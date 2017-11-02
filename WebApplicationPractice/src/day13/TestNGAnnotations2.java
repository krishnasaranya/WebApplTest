
package day13;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations2 {
		@BeforeTest
		public void ApplicationLaunch()
		{
			System.out.println("This is for Launching the application");
		}
		@Test
		public void BrowserLaunch()
		{
			System.out.println("This is for BrowserLaunch");
		}
		@Test
		public void Login()
		{
			System.out.println("This is for login");
			
		}

		@AfterTest
		public void ApplicationClose()
		{
			System.out.println("Application Close");
		}
}
