package practicePkg;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}