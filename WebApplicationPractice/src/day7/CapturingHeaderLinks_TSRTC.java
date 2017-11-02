package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingHeaderLinks_TSRTC {

	public static void main(String[] args) {
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElementByXPath("html/body/div[3]");
		List <WebElement> HeaderList=HeaderBlock.findElements(By.tagName("a"));
		System.out.println(HeaderList.size());
		
		for(int i=0;i<HeaderList.size();i++)
		{
			String link=HeaderList.get(i).getText();
			System.out.println(link);
		}
	driver.close();
	}
	

}
