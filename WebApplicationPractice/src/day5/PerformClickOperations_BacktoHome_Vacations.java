package day5;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PerformClickOperations_BacktoHome_Vacations {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		//driver.findElementByLinkText("REGISTER").click();
		driver.findElementByName("login").click();
		driver.findElementByLinkText("Vacations").click();
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img").click();
		System.out.println(driver.getTitle());
		driver.close();
		
		System.out.println(driver.getCurrentUrl());
		
		}

}
