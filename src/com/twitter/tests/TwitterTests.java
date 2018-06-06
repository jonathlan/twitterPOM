package com.twitter.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import helpers.SpecificProperties;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TwitterTests extends TwitterTestBasePOM {
	
	@Test
	@FileParameters("./data/tweetparams.csv")
	public void tweet(String tweet) {		
		tOptionsPage.navigateToLoginPage();		
		tLoginPage.login(properties.getProperty("USER"), properties.getProperty("PWD"));		
		tHomePage.tweetSomething(tweet);
		assertTrue("Tweet failed", tHomePage.isTweeted(tweet));
	}
	
	@Test
	public void findTopic() {
		tOptionsPage.navigateToLoginPage();	
		tLoginPage.login(properties.getProperty("USER"), properties.getProperty("PWD"));
		tHomePage.searchTopic("Han Solo");		
	}
}
