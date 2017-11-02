package com.day17_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {

//	WebElement Username = driver.findelement(By.linkText("UserName"))
	@FindBy(name = "userName")
	WebElement UserName;
	@FindBy(name = "password")
	WebElement Password;
	@FindBy(name = "login")
	WebElement Login;
	
	public void FindAFlight(String u,String p)
	{
		UserName.sendKeys(u);
		Password.sendKeys(p);
		Login.click();
		
	}

} 
