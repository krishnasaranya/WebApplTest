package day13;

import org.testng.annotations.Test;

public class TestNGAnnotations1 {

			@Test(priority=1)
			public void BrowserLaunch()
			{
				System.out.println("This is used for Browser Launch");
	}
		@Test(priority=2)
			public void Login()
			{
				System.out.println("This is for Login");
			}

			@Test(priority=3)
			public void ComposeMail()
			{
				System.out.println("This is for Composing Mail");
				
			}
}




