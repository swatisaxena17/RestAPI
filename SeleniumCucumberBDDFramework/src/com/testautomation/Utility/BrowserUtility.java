package com.testautomation.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtility {
	
	public static WebDriver OpenBrowser(WebDriver driver, String BrowserName, String url) throws InterruptedException{
		
		if (BrowserName.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Swaman\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		return driver;
		}
		else
			if(BrowserName.equals("IE")){
				
				System.setProperty("webdriver.ie.driver", "C:\\Swaman\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				Thread.sleep(3000);
				return driver;
			}
			else if(BrowserName.equals("Firefox")){
				System.setProperty("webdriver.gecko.driver", "C:\\Swaman\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				Thread.sleep(3000);
				return driver;
			}
		return null;
	
	}

}
