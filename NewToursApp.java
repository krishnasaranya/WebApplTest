package NewTours_App;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursApp {
	FirefoxDriver driver;
	@Test
	@Given("^Open Firefox And Start Application$")
	public void Open_Firefox_And_Start_Application() throws Throwable {
	    driver = new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com/");
	    
	}

	@When("^I enter Valid  Login Credentials$")
	public void I_enter_Valid_Login_Credentials() throws Throwable {
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
	}

	@Then("^user should be able to Login Succesfully$")
	public void user_should_be_able_to_Login_Succesfully() throws Throwable {
	    driver.close();
	   
	}


}
