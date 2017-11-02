package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PerformClickOperation_Signin {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe ");

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.findElement(By.id("gb_70")).click();
		System.out.println(driver.getTitle());
		driver.close();
	
	}
}
