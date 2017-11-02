package day9;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickAllLinks_Screenshots_NewTours {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();		
		List <WebElement> Links =driver.findElementsByTagName("a");
		System.out.println(Links.size());
		
		for(int i=0; i<Links.size();i++)
		{
			String LinkName = Links.get(i).getText();
			System.out.println(LinkName);
			
			Links.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File ("E:\\Saranya_Practice_Programs\\Screenshots\\"+LinkName+".png"));
		
			driver.navigate().back();
			Links=driver.findElementsByTagName("a");
		
		}
		driver.close();
	}

}
