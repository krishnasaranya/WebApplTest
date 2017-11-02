package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadingAllData {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("E:\\Saranya_Practice_Programs\\Saranya_Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rowcount = ws.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			
			Row r = ws.getRow(i);
			int cellcount = r.getLastCellNum();
			{
			for(int j=0;j<cellcount;j++)
			{
				Cell c= r.getCell(j);
				System.out.print(c.getStringCellValue()+" ");
				
			}
			System.out.println();
		
		}
			}
}		
	
}

	
	