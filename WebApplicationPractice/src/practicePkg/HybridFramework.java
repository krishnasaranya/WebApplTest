package practicePkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HybridFramework {
	
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void Login() throws IOException
	{  	FileInputStream f = new FileInputStream("E:\\Saranya_Practice_Programs\\WebApplicationPractice\\src\\testDataForm\\TestData_NewTours.properties");
		Properties pr = new Properties();
		pr.load(f);
	
		FileInputStream file = new FileInputStream("E:\\Saranya_Practice_Programs\\WebApplicationPractice\\src\\testDataForm\\Saranya_Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowcount = ws.getLastRowNum();
		for (int i=1;i<=rowcount;i++)
		{
			Row r = ws.getRow(i);
			driver.findElementByName(pr.getProperty("UserName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElementByName(pr.getProperty("Password")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElementByName(pr.getProperty("Login")).click();
			driver.navigate().back();
		}
	}
		@AfterTest
		public void Teardown()
		{
		driver.close();
		
		}
	}
	





