package com.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwitterResultsPage extends WebPage {
	WebDriver driver;
	WebDriverWait wait;

	public TwitterResultsPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	
	//Elements
	WebElement recommendedFollowersContainer; // class='js-recommended-followers dashboard-user-recommendations flex-module-inner'
	WebElement individualFollower; // class='UserSmallListItem js-account-summary account-summary js-actionable-user'
	WebElement FollowBtn; // pending to complete //button[contains (@class, 'EdgeButton--secondary')]  another example //button[contains (@class, 'EdgeButton--secondary')]/span[contains(.,'Follow')]

	//Methods
	public void followItemNumber(int number) {
		
	}

}
