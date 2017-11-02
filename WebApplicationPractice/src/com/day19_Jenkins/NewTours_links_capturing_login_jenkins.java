package com.day19_Jenkins;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NewTours_links_capturing_login_jenkins {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Saranya_Practice_Programs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			
			//FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			
			List<WebElement> links = driver.findElementsByTagName("a");
			System.out.println(links);
			
			for( int i=0;i<links.size();i++)
			{
				 String link = links.get(i).getText();
				 
				 System.out.println(link);
			}
		
		driver.close();
		}
		

	}


