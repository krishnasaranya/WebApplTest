package practicePkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ClickHeaderLinks_TSRTC {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
	    WebElement HeaderElement=driver.findElementByXPath("html/body/div[3]"); 
	    List <WebElement> HeaderLinks = HeaderElement.findElements(By.tagName("a"));
	    System.out.println(HeaderLinks.size());
	    
	    
	    for(int i=0;i<HeaderLinks.size();i++)
	    {
	    	
		    HeaderElement=driver.findElementByXPath("html/body/div[3]");
		    HeaderLinks = HeaderElement.findElements(By.tagName("a"));
		    String Links = HeaderLinks.get(i).getText();
		    System.out.println(Links);

		    HeaderLinks.get(i).click();
		    driver.navigate().back();
		    Sleeper.sleepTightInSeconds(10);

	    }
	    driver.close();
	}
	

}
