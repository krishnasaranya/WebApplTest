package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_Title_Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe ");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		//driver.get("https://gmail.com");
		driver.close();
		System.out.println(driver.getTitle()); //print the current browser title
	}

}
