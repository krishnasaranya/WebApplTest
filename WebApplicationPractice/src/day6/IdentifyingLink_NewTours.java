package day6;

//import java.lang.reflect.Array;
//import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyingLink_NewTours {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe ");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		//driver.findElementByLinkText("REGISTER").click();
		
		  WebElement reg = driver.findElementByLinkText("REGISTER");
		  System.out.println(reg.getText());
		 
		 System.out.println(reg);
		 
	}

}
