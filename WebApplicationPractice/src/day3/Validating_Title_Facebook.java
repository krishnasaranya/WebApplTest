package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Validating_Title_Facebook {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		
		 String Expected_Title = "Facebook  Log In or Sign Up";
         System.out.println(driver.getTitle());
		 String Actual_Title = driver.getTitle();
		 if(Actual_Title.equals(Expected_Title))
		 {
			 		System.out.println("Title Matched Pass");
				 }
	
			else
	{
		System.out.println("Title missmatched Fail");
	}

}
}
