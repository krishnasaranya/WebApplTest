package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadingData {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("E:\\Saranya_Practice_Programs\\Saranya_Book1.xlsx");
		XSSFWorkbook wb1 = new XSSFWorkbook(file);
		XSSFSheet ws =  wb1.getSheet("Sheet1");
		
		Row r= ws.getRow(0);
	    Cell c=	r.getCell(0);
	    
	    String data=c.getStringCellValue();
	    System.out.println(data);
	}

}




