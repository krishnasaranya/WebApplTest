package day5;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PerformClickOperation_Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe ");

		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		driver.findElementByLinkText("REGISTER").click();
		driver.close();
	}

}
