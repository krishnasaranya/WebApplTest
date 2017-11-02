package com.day17_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursApplictaionHomePage {

	@Test
	public void FindAFlight() throws IOException
	{
		
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		
		WelcomeMercuryTours wmt = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		wmt.FindAFlight("tutorial","tutorial");
	}
}
