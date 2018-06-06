package com.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Locators;

public class TwitterOptionsPage extends WebPage {
	WebDriver driver;
	WebDriverWait wait;

	public TwitterOptionsPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy (how= How.XPATH, using = Locators.PRIMARY_BTN_XPATH)
	WebElement primaryLoginBtn;
	
	public void navigateToLoginPage() {		
		primaryLoginBtn.click();
	}
}
