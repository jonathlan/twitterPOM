package com.twitter.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Locators;	

public class WebPage {
//	protected Locators loctr = new Locators();
	protected List<WebElement> elements = new ArrayList<WebElement>();

	protected boolean at(List<WebElement> list, int qty) {
		return (list.size() == qty) ? true : false;		
	}
}
