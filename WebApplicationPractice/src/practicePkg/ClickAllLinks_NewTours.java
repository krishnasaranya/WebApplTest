package practicePkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ClickAllLinks_NewTours {

	public static void main(String[] args) {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.newtours.demoaut.com/");
		//WebElement Elements = driver.findElementByXPath("html/body/div[1]");
		List <WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		for(int i=0;i<Links.size();i++)
			
		{
			//Elements = driver.findElementByXPath("html/body/div[1]");
			Links = driver.findElements(By.tagName("a"));
			String link = Links.get(i).getText();
			System.out.println(link);
			
			Links.get(i).click();
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(5);
			}
		driver.close();
	}
	
	

}
