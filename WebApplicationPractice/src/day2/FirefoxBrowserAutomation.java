package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserAutomation {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver(); //driver is an object which has the current browser info
		driver.get("https://facebook.com");
		driver.navigate().to("https://gmail.com");
		driver.close();
		
	}

}
