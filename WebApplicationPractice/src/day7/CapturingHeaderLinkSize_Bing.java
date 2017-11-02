package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingHeaderLinkSize_Bing {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bing.com/");
		WebElement HeaderBlock=driver.findElementById("sc_hdu");
		
		List<WebElement>Headerlinks=HeaderBlock.findElements(By.tagName("a"));
		System.out.println(Headerlinks.size());
		
		for(int i=0;i<Headerlinks.size();i++)
		{
			String links=Headerlinks.get(i).getText();
			System.out.println(links);
		}
		driver.close();
	}
	

}
