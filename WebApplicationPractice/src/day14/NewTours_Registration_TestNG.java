package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Registration_TestNG {
	
	FirefoxDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
	}
	@Test(priority =1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test(priority=2)
	public void Register_Details()
	{
		driver.findElementByName("firstName").sendKeys("saranya");
		driver.findElementByName("lastName").sendKeys("Kodali");
		driver.findElement(By.name("phone")).sendKeys("777777");
		driver.findElement(By.id("userName")).sendKeys("sri@gmail.com");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("address1")).sendKeys("HITechCity");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500012");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("Hello");
		driver.findElement(By.name("confirmPassword")).sendKeys("Hello");
	
		driver.findElement(By.name("register")).click();
		String ActualResult = driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();
		
		String ExpectedResult = "tutorial";
		
		if(ActualResult.contains(ExpectedResult))
		{
			System.out.println("TestCase Passed");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
	}
	
	@AfterTest 
	public void TearDown()
	{
		driver.close();
	}
}
