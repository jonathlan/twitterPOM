package com.twitter.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Locators;

public class TwitterHomePage extends WebPage {
	WebDriver driver;
	WebDriverWait wait;

	public TwitterHomePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;	
		this.wait = wait;
		PageFactory.initElements(this.driver, this);		
	}
	
	//Elements
	@FindBy (how = How.XPATH, using = Locators.TWEET_TXT_XPATH)
	WebElement tweetTxt;
	
	@FindBy (how = How.XPATH, using = Locators.TWEET_BTN_XPATH)	
	WebElement tweetBtn;
	
	@FindBy(how = How.ID, using = Locators.SEARCH_TXT_ID)
	WebElement searchTxt;
	
	@FindBy (how = How.XPATH, using = Locators.SEARCH_TOPIC_BTN_XPATH)
	WebElement searchBtn;
	
	@FindBy (how = How.XPATH, using = Locators.TWEETS_CONTAINER_XPATH)
	List<WebElement> tweetsContainer;
	
	@FindBy (how = How.XPATH, using = Locators.LAST_TWEET_XPATH)
	WebElement lastTweetText;
	
	//Methods
	
	public void tweetSomething (String something) {
		tweetTxt = wait.until(ExpectedConditions.elementToBeClickable(tweetTxt));				
		tweetTxt.sendKeys(something);		
		tweetBtn.click();
		System.out.println("Something: " + something);
	}
	
	public boolean isTweeted (String tweet) {	
		driver.navigate().refresh();
		driver.switchTo().alert().accept();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'"+tweet+"')]")));
		} catch (Exception e) {
			// TODO if wait fails, check for  "See one more tweet..." click it and retry
		}
		tweetsContainer = driver.findElements(By.xpath(Locators.TWEETS_CONTAINER_XPATH)); 
				//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(Locators.TWEETS_CONTAINER_XPATH)));
		
		WebElement lastTweet = tweetsContainer.get(0);
		String txt = lastTweet.findElement(By.xpath(Locators.LAST_TWEET_XPATH)).getText();
		System.out.println("Last tweet " + txt);
		return (txt.equals(tweet)) ? true : false;
	}
	
	public void searchTopic (String topic) {		
		searchTxt.clear();
		searchTxt.sendKeys(topic);
		searchBtn.click();
	}

}
