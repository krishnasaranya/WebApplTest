package day9;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class PerformClickOnHeaderLinks_Screenshots_TSRTC {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		 WebElement HeaderLinks=driver.findElementByXPath("html/body/div[3]");
		 List<WebElement> Links=HeaderLinks.findElements(By.tagName("a"));
		 
		 System.out.println(Links.size());
		 
		 for(int i=0;i<Links.size();i++)
		 {
			 
			 HeaderLinks=driver.findElementByXPath("html/body/div[3]");
			 Links=HeaderLinks.findElements(By.tagName("a"));
			 
			 String Elements = Links.get(i).getText();
			 System.out.println(Elements);
			 Links.get(i).click();
			 Sleeper.sleepTightInSeconds(10);
			 
			 File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcfile, new File("E:\\Saranya_Practice_Programs\\Screenshots\\"+Elements+".png"));
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			  
			 //HeaderLinks=driver.findElementByXPath("html/body/div[3]");
			 //Links=HeaderLinks.findElements(By.tagName("a"));
			 
			 driver.navigate().back();
			 
			 Sleeper.sleepTightInSeconds(5);
			 
		 }
	driver.close();
	}

}
