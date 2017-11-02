package practicePkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Parameters_Excel {
	FirefoxDriver driver;
	FileInputStream file;
	XSSFWorkbook wb;
	XSSFSheet ws;
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test(priority=2)
	public void ExcelData() throws IOException
	{
		file = new FileInputStream("E:\\Saranya_Practice_Programs\\Saranya_Registration_details.xlsx");
		wb = new XSSFWorkbook("file");
		ws = wb.getSheet("Sheet1");
	}
	@Test(priority=3)
	public void Register_Details()
	{
		int RowCount  = ws.getLastRowNum();
		
		for(int i=0;i<RowCount;i++)
		{
			Row r = ws.getRow(i);
			
			int cellcount = r.getLastCellNum();
			for(int j=0;j<cellcount;j++)
			{
				Cell c =r.getCell(j);
			}
			
		}
		driver.findElementByName("firstName").sendKeys("saranya");
		driver.findElementByName("lastName").sendKeys("Kodali");
		driver.findElement(By.name("phone")).sendKeys("777777");
		driver.findElement(By.id("userName")).sendKeys("sri@gmail.com");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("address1")).sendKeys("HITechCity");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500012");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("Saaaranyaaa");
		driver.findElement(By.name("password")).sendKeys("Hello");
		driver.findElement(By.name("confirmPassword")).sendKeys("Hello");
	}
	@AfterTest 
	public void TearDown()
	{
		driver.close();
	}

	}

