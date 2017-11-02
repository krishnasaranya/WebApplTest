package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Validating_URL_Facebook {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.close();
		
		String Expected_URL = "facebook.com";
		String Actual_URL= driver.getCurrentUrl();
		
		System.out.println(Expected_URL);
		System.out.println(Actual_URL);
		
		if(Actual_URL.contains(Expected_URL))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}