package com.day16_KeyWordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyWordDriven_NewTours_Login {

	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
	}
	@Test
	public void Login() throws IOException
	{
		FileInputStream file = new FileInputStream("E:\\Saranya_Practice_Programs\\WebApplicationPractice\\src\\testDataForm\\TestData_NewTours.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Login"))).click();
	}
	@AfterTest()
	public void TearDown()
	{
		driver.close();
	}
	
	
	
}
