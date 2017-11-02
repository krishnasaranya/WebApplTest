package practicePkg;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Perform_MouseHover_AlertMsg_Icici {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.icicibank.com/");
		
		Sleeper.sleepTightInSeconds(10);
	WebElement	login = driver.findElementByXPath(".//*[@id='main']/div[1]/div/a[1]");
		Actions act = new Actions(driver);
		act.moveToElement(login).perform();
		driver.findElement(By.xpath(".//*[@id='IBLogin-child']/ul[1]/li[1]/a")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElementByXPath(".//*[@id='main']/div[2]/div/div/div[1]/div/div[4]/a").click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath(".//*[@id='VALIDATE_CREDENTIALS1']")).click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("E:\\Saranya_Practice_Programs\\Screenshots\\screen1.png"));
		System.out.println(driver.getTitle());
		driver.navigate().back();
	  File ScFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(ScFile, new File("E:\\Saranya_Practice_Programs\\Screenshots\\screen2.png"));
		
		System.out.println(driver.getTitle());
		driver.close();
	}
	

}
