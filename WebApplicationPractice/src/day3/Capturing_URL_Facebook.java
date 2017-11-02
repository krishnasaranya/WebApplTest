package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_URL_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.close();
		System.out.println(driver.getCurrentUrl()); //capture the current browser URL
	}
}
