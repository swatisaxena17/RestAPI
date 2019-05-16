package com.testautomation.StepDef;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.testautomation.Listeners.ExtentReportListener;
import com.testautomation.PageObjects.ChannelPage;
import com.testautomation.PageObjects.YoutubeResultPage;
import com.testautomation.PageObjects.YoutubeSearchPage;
import com.testautomation.Utility.BrowserUtility;
import com.testautomation.Utility.PropertiesFileReader;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YouTubeChannelValidations extends ExtentReportListener{
	
	
	
	PropertiesFileReader obj = new PropertiesFileReader();
	private static WebDriver driver;
	
//	YoutubeSearchPage search = new YoutubeSearchPage(driver);
//	YoutubeResultPage result = new YoutubeResultPage(driver);
	
	
	@Given("^Open Chrome browser with URL$")
	public void open_Chrome_Browser_With_URL() throws Throwable {

		ExtentTest logInfo = null;
		try {
			test = extent.createTest(Feature.class,"Youtube Channel name validations");
			test = test.createNode(Scenario.class, "Youtube Channel name validation");
			logInfo = test.createNode(new GherkinKeyword("Given")	,"open_Chrome_Browser_With_URL");
		
			Properties properties = obj.getProperty();
			
			driver = BrowserUtility.OpenBrowser(driver, properties.getProperty("browser.name"), properties.getProperty("browser.baseURL"));
			
			logInfo.pass("Opened Browser and entered URL  ");
			
		}catch(AssertionError | Exception e) {
			testStepHandle("Fail", driver,logInfo,e);
		}
		

	}
	

	
	@When("^Search Selnium Tutorial$")
	public void search_Selnium_Tutorial() throws Throwable {
		ExtentTest logInfo = null;
	
		try {
			logInfo = test.createNode(new GherkinKeyword("When")	,"search_Selnium_Tutorial");
		new YoutubeSearchPage(driver).NavigateToResultPage();
		logInfo.pass("Searching Selenium Tutorial.  ");
		
		}catch(AssertionError | Exception e) {
			testStepHandle("Fail", driver,logInfo,e);
		}
	   
	}
	
	@When("^Search Selnium Tutorial \"([^\"]*)\"$")
	public void search_Selnium_Tutorial(String searchString) throws Throwable {
		ExtentTest logInfo = null;
	
		try {
			logInfo = test.createNode(new GherkinKeyword("When")	,"search_Selnium_Tutorial");
		new YoutubeSearchPage(driver).NavigateToResultPageParameter(searchString);
		logInfo.pass("Searching Selenium Tutorial.  ");
		
		}catch(AssertionError | Exception e) {
			testStepHandle("Fail", driver,logInfo,e);
		}
	   
	}

	@And("^Click on Channel name$")
	public void click_on_Channel_name() throws Throwable {
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("And")	,"click_on_Channel_name");
		new YoutubeResultPage(driver).NavigateToChannelName();
		
		logInfo.pass("Clicked on the Channel Name.  ");
		
	}catch(AssertionError | Exception e) {
		testStepHandle("Fail", driver,logInfo,e);
	}
	 
	}

	@Then("^Validate Channel Name$")
	public void validate_Channel_Name() throws Throwable {
		
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("Then")	,"validate_Channel_Name");
		
		String expectedChannelName ="Selenium Java TestNG Tutorials - Bakkappa N - YouTube";
		String actualChannelName = new ChannelPage(driver).getTitle();
		Assert.assertEquals(actualChannelName, expectedChannelName, "Channel names are not matching");
	  
		Thread.sleep(1000);
		logInfo.pass("Validated Channel Title.  ");
		driver.quit();
		
		
		}catch(AssertionError | Exception e) {
			testStepHandle("Fail", driver,logInfo,e);
		}
	}


}
