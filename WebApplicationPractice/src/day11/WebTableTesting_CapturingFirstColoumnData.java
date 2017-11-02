package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableTesting_CapturingFirstColoumnData {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]/a
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[36]/td[1]/a
		String part1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String part2 = "]/td[1]/a";
		for(int i=1;i<36;i++)
		{
			String rowtext=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(rowtext);
			
		}
	
		driver.close();
	}

}
