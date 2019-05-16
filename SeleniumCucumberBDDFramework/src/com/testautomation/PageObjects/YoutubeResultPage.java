package com.testautomation.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeResultPage {
	
WebDriver driver;
	
public YoutubeResultPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how =How.LINK_TEXT,using = "Selenium Java TestNG Tutorials - Bakkappa N")
	public WebElement searchLink;
	
	public void NavigateToChannelName() throws InterruptedException {
		Thread.sleep(2000);
//	WebDriverWait wait = (new WebDriverWait(driver,30)).until(ExpectedConditions));
		searchLink.click();
	
	}

}
