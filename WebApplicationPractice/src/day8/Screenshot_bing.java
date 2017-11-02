package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Screenshot_bing {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bing.com/");
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("E:\\Saranya_Practice_Programs\\Bing1.png"));
		
		Sleeper.sleepTightInSeconds(15);
		driver.close();		
	}

	
}