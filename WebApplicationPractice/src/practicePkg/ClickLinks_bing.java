package practicePkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickLinks_bing {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
	WebElement HeaderElement	= driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td");
	List<WebElement> HeaderLinks = HeaderElement.findElements(By.tagName("a"));
	int linksize = HeaderLinks.size();
	System.out.println(linksize);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	for(int i=0;i<linksize;i++)
	{
		//String link = HeaderLinks.get(i).getText();
		
		 HeaderElement	= driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td");
		 HeaderLinks= HeaderElement.findElements(By.tagName("a"));
		 HeaderLinks.get(i).click();
		//String link = HeaderElement.findElements(By.tagName("a")).get(i).getText();
		//System.out.println(link);
		
	//	HeaderElement.findElements(By.tagName("a")).get(i).click();
		
		driver.navigate().back();
		
		
	}
	driver.close();
	}

}
