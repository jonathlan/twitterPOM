package com.twitter.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Locators;

public class TwitterLoginPage extends WebPage {	
	WebDriver driver;
	WebDriverWait wait;

	public TwitterLoginPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	
	//Elements
	@FindBy (how = How.XPATH, using = Locators.USR_TXT_XPATH)
	WebElement userTxt; 
	
	@FindBy (how = How.XPATH, using = Locators.PWD_TXT_XPATH)
	WebElement pwdTxt; 
	
	@FindBy (how = How.XPATH, using = Locators.LOGIN_BTN)	
	WebElement loginBtn; 

	//Methods
	public void login(String user, String pwd) {
				
		userTxt.clear();
		userTxt.sendKeys(user);
				
		pwdTxt.clear();
		pwdTxt.sendKeys(pwd);
				
		Actions actions = new Actions(driver);
		actions.moveToElement(loginBtn).click().build().perform();
		loginBtn.click();
		
	}
	
	
		
}
