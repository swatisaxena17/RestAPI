package com.testautomation.PageObjects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YoutubeSearchPage {
	
	WebDriver driver;
	
	public YoutubeSearchPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
//	@FindBy(how =How.ID,using ="search")
//	public WebElement searchTextBox;
//	
//	@FindBy(how =How.CSS,using="#search-icon-legacy")
//	public WebElement searchButton;
	
	private String searchTextBox = "search";
	private String searchButton = "#search-icon-legacy";
	
	
	public void NavigateToResultPage() {
		WebElement s = driver.findElement(By.id(searchTextBox));
		s.sendKeys("selenium by bakappa n");
		WebElement t = driver.findElement(By.cssSelector(searchButton));
		
		t.click();
	}
	
	public void NavigateToResultPageParameter(String searchstring) {
		WebElement s = driver.findElement(By.id(searchTextBox));
		s.sendKeys(searchstring);
		WebElement t = driver.findElement(By.cssSelector(searchButton));
		
		t.click();
	}
	
	public void PressAltControlDelete() {
		WebElement txtUserName = driver.findElement(By.id("Email"));
		 
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
		 .moveToElement(txtUserName)
		 .click()
		 .keyDown(txtUserName, Keys.SHIFT)
	//	 .sendKeys(txtUserName, “hello”)
		 .keyUp(txtUserName, Keys.SHIFT)
		 .doubleClick(txtUserName)
		 .contextClick()
		 .build();
		seriesOfActions.perform();
		
		
		//Resize window
		System.out.println("get window size" + driver.manage().window().getSize());
		Dimension d = new Dimension(400,500);
		driver. manage().window().setSize(d);
		
		//Resize window using java script executor
		JavascriptExecutor js = 	(JavascriptExecutor) driver;
		js.executeScript("window.resizeTo(400,500);");
		
	}
}
