package practicePkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Practice{
	FirefoxDriver driver;

@BeforeTest
public void setup()
{
	driver = new FirefoxDriver();
	driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
	driver.manage().window().maximize();
}
@Test(priority=1)
public void Register()
{
	driver.findElementByLinkText("REGISTER").click();
}
@Test(priority=2)
public void NewUserRegistration() throws IOException
{
	FileInputStream file = new FileInputStream("E:\\Saranya_Practice_Programs\\WebApplicationPractice\\src\\testDataForm\\saranya_NewRegister.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(file);
	XSSFSheet ws = wb.getSheet("Sheet1");
	int RowCount = ws.getLastRowNum();
	for(int i=1;i<=RowCount;i++)
	{
		Row r = ws.getRow(i);
		
	driver.findElementByName("firstName").sendKeys(r.getCell(0).getStringCellValue());
	driver.findElementByName("lastName").sendKeys(r.getCell(1).getStringCellValue());
	double d = r.getCell(2).getNumericCellValue();
	long l = (long)d;
	String phone = Long.toString(l);
	driver.findElement(By.name("phone")).sendKeys(phone);
	driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
	driver.findElement(By.name("city")).sendKeys(r.getCell(4).getStringCellValue());
	driver.findElement(By.name("address1")).sendKeys(r.getCell(5).getStringCellValue());
	driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
	
	double o = r.getCell(7).getNumericCellValue();
	long g = (long)o;
	String postalcode = Long.toString(g);
	driver.findElement(By.name("postalCode")).sendKeys(r.getCell(8).getStringCellValue());
	driver.findElement(By.name("country")).sendKeys(r.getCell(9).getStringCellValue());
	driver.findElement(By.id("email")).sendKeys(r.getCell(10).getStringCellValue());
	driver.findElement(By.name("password")).sendKeys(r.getCell(11).getStringCellValue());
	driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(12).getStringCellValue());
	
	driver.findElementByName("register").click();
	
	String ActualUser = driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();
	String ExpectedUser = r.getCell(10).getStringCellValue();
	if(ActualUser.contains(ExpectedUser))
	{
		System.out.println("Pass");
		
		r.createCell(12).setCellValue("Pass");
	}
	else
	{
		System.out.println("Fail");
		r.createCell(12).setCellValue("fail");
	}
	
	FileOutputStream file1 = new FileOutputStream("E:\\Saranya_Practice_Programs\\WebApplicationPractice\\src\\testDataForm\\saranya_NewRegister.xlsx");
	wb.write(file1);
	}
	
}

}