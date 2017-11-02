package day6;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyingTotalLinks_NewToursHomePage {

	public static void main(String[] args) {
      FirefoxDriver driver=new FirefoxDriver();
      driver.get("http://newtours.demoaut.com");
      
      List<WebElement> links= driver.findElementsByTagName("a");
      
      System.out.println(links.size());
      
    driver.close();
	}

}
