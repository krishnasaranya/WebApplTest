package day14;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Login {

	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		//driver.manage().window().maximize();
	}
	@Test
	public void LoginDetails()
	{
		driver.findElementByName("userName").sendKeys("tutorial");
		driver.findElementByName("password").sendKeys("tutorial");
		
		driver.findElementByName("login").click();
		
		Sleeper.sleepTightInSeconds(5);
	
	}
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
	
	
}
