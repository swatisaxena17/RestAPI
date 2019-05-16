package com.testautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChannelPage {
	
	WebDriver driver;
	
	public ChannelPage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(how =How.LINK_TEXT,using = "abc")
		public WebElement searchLink;
		
		public String getTitle() throws InterruptedException {
			Thread.sleep(2000);
			return driver.getTitle();
		
		}

}
