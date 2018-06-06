package com.twitter.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class WebPage {
	protected List<WebElement> elements = new ArrayList<WebElement>();

	protected boolean at(List<WebElement> list, int qty) {
		return (list.size() == qty) ? true : false;		
	}
}
