package com.twitter.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.twitter.pages.TwitterHomePage;
import com.twitter.pages.TwitterLoginPage;
import com.twitter.pages.TwitterOptionsPage;
import com.twitter.pages.TwitterResultsPage;
import com.twitter.pages.WebPage;

import helpers.Locators;
import helpers.SpecificProperties;

public class TwitterTestBasePOM {	
	protected WebDriver driver = null;
	protected WebDriverWait wait;
	protected TwitterLoginPage tLoginPage;
	protected TwitterHomePage tHomePage;
	protected TwitterResultsPage tResultsPage;
	protected TwitterOptionsPage tOptionsPage;
	protected SpecificProperties tProp = new SpecificProperties();
	protected Properties properties;	
	
	@Before
	public void setUp() throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		properties = tProp.LoadProperties("./data/properties.xml");		
		
			ChromeOptions ops = new ChromeOptions();
	        ops.addArguments("--disable-notifications --start-maximized");
			System.setProperty(properties.getProperty("CHROME_DRIVER_NAME"),
					properties.getProperty("GENERIC_DRIVER_LOCATION")+properties.getProperty("CHROME_DRIVER_EXE"));
		    driver = new ChromeDriver(ops);			
		    driver.get(properties.getProperty("MAIN_URL"));
		    driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
		    
		    wait = new WebDriverWait(driver, 30);
		    
		    tLoginPage = new TwitterLoginPage(driver, wait);
		    tHomePage = new TwitterHomePage(driver, wait);
		    tResultsPage = new TwitterResultsPage(driver, wait);
		    tOptionsPage = new TwitterOptionsPage(driver, wait);
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
