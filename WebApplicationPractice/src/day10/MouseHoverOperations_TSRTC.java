package day10;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOperations_TSRTC {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Electronics=driver.findElementByXPath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span");
		
		Actions act = new Actions(driver);
		act.moveToElement(Electronics).perform();
		
		driver.findElementByXPath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span").click();
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}

}
