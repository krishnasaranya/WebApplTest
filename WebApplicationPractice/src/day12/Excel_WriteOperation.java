package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream("E:\\Saranya_Practice_Programs\\Saranya1.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(file);
	XSSFSheet ws = wb.getSheet("Sheet1");
		
	
		Row r = ws.createRow(4);
		Cell c = r.createCell(5);
		//System.out.println(c.gettringCellValue());
		
		c.setCellValue("Hello");

		FileOutputStream file1 = new FileOutputStream("E:\\Saranya_Practice_Programs\\Saranya1.xlsx");
		wb.write(file1);
	}

}
