package practicePkg;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCry_ClickOperations {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.firstcry.com/");
		driver.findElementByLinkText("PLACE ORDER").click();
	}

}
