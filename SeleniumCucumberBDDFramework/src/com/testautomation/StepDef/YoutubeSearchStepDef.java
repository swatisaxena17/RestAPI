package com.testautomation.StepDef;

import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testautomation.Utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YoutubeSearchStepDef {

	public static WebDriver driver;

	PropertiesFileReader obj = new PropertiesFileReader();

	@Given("^Open Chrome browse and enter URL$")
	public void open_Chrome_Browse_and_Enter_URL() throws Throwable {

		Properties properties = obj.getProperty();
		System.setProperty("webdriver.chrome.driver", "C:\\Swaman\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("browser.baseURL"));
		Thread.sleep(3000);

	}

	@When("^Enter Search Criteria$")
	public void enter_Search_Criteria() throws Throwable {
		driver.findElement(By.id("search")).sendKeys("selenium c# by bakappa n");

		// Zoom in and Zoom out
		// driver.findElement( By.id("search")).sendKeys(Keys.CONTROL,Keys.ADD);
		// driver.findElement( By.id("search")).sendKeys(Keys.CONTROL,Keys.SUBTRACT);
//		Thread.sleep(1000);
//
//		// finding hidden element and clicking
//
//		List<WebElement> radio = driver.findElements(By.id("search"));
//
//		for (WebElement w : radio) {
//			int x = w.getLocation().getX();
//			if (x != 0) {
//				w.clear();
//				break;
//			}
//		}

		// scroll using java script executor

//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("window.scrollBy(0,1000)");
//
//		
//		//To find hidden element
//		
//	WebElement element = driver.findElement(By.xpath("//input[@id='firstname']"));
//		js.executeScript("arguments[0].click();", element);
//	js.executeScript("document.getElementById('testobject').click();");
//				
		
		//Waits-------------------------------------
//				driver.navigate().refresh();
//				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				
//				WebDriverWait w = new WebDriverWait(driver, 20);
//				w.until(ExpectedConditions.visibilityOfElementLocated(By.id("Search")));
//				
//				Wait wi = new FluentWait(driver).withTimeout(20,TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);
//				wi.until(ExpectedConditions.visibilityOfElementLocated(By.id("Search")));
				
				
				
				
				
		// Select from drop down

//		Select s = new Select(driver.findElement(By.id("search")));
//		s.selectByIndex(index);
//		s.selectByVisibleText(text);
//		s.selectByValue(value);

		// handling multiple windows

//Parent window ID

//		String a = driver.getWindowHandle();
//		System.out.println("Parent Window Id is : "+ a);
//		
//		Set<String> all =driver.getWindowHandles();
//		int count = all.size();
//		System.out.println("Total Window  : "+ count);
//		
//		for( String child :all) {
//			
//			if(!a.equalsIgnoreCase(child)) {
//				driver.switchTo().window(child);
//				
//				driver.findElement(By.cssSelector("#search-icon-legacy")).sendKeys("selenium c# by bakappa n");
//	 			
//				Thread.sleep(3000);
//				driver.close();
//			}
//		}
//		
//		driver.switchTo().window(a);
		
		//set window size using Java script executor
		
//		Dimension dim = new Dimension(width,height);
//				driver.manage().window().setSize(dim);

	}

	@Then("^Click on Search button$")
	public void click_On_Search_Button() throws Throwable {

		driver.findElement(By.cssSelector("#search-icon-legacy")).sendKeys("selenium c# by bakappa n");

		Thread.sleep(1000);
		driver.quit();

	}
}
