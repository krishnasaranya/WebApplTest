import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations3 {
	
	@BeforeMethod
	public void ApplicationLaunchandLogin()
	{
		
		System.out.println("Application Launch and Login");
	}
	@Test(priority=1)
	public void SendMail()
	{
		System.out.println("Mail sent");
		
	}
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("Compose a new mail");
	}
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("Application close");
	}
}
