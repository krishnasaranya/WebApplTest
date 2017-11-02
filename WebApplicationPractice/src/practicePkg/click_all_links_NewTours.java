package practicePkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class click_all_links_NewTours {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		WebElement HeaderElement =driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td");
		List <WebElement> HeaderLinks = driver.findElementsByTagName("a");
		System.out.println(HeaderElement.getText());
		
		
		int linksize= HeaderLinks.size();
		
		for( int i=0;i<linksize;i++)
		{
			HeaderElement =driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td");
			HeaderElement.findElements(By.tagName("a")).get(i).getText();
			HeaderElement.findElements(By.tagName("a")).get(i).getText();
			driver.navigate().back();
		}
	driver.close();
	}

}
