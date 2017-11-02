package day7;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingHeaderLinks_ClickLinks_NewTours {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bing.com/");
		WebElement HeaderBlock=driver.findElementById("sc_hdu");
		List <WebElement> HeaderLinks=HeaderBlock.findElements(By.tagName("a"));
		int Linksize= HeaderLinks.size();
		System.out.println(Linksize);
		System.out.println(HeaderLinks);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		for(int i=0;i<Linksize;i++)
		{
			HeaderBlock.findElements(By.tagName("a")).get(i).getText();
			HeaderBlock.findElements(By.tagName("a")).get(i).click();
			driver.navigate().back();
		}
		driver.close();
	

	
	}
	

}
