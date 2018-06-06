package helpers;

public class Locators {
	
	/*Home Page String Locators*/
	public static final String TWEET_TXT_XPATH = "//div[@aria-labelledby='tweet-box-home-timeline-label']";
	public static final String TWEET_BTN_XPATH = "//button[@class='tweet-action EdgeButton EdgeButton--primary js-tweet-btn']";
	public static final String TWEETS_CONTAINER_XPATH = "//ol/li";
	public static final String LAST_TWEET_XPATH = ".//p[@class='TweetTextSize  js-tweet-text tweet-text']";
	public static final String SEARCH_TXT_ID = "search-query";
	public static final String SEARCH_TOPIC_BTN_XPATH = "//button[@class='Icon Icon--medium Icon--search nav-search']";
	
	public String getTWEET_TXT_XPATH () { return TWEET_TXT_XPATH;	}
	public String getTWEET_BTN_XPATH () { return TWEET_BTN_XPATH; }
	public String getTWEETS_CONTAINER_XPATH () { return TWEETS_CONTAINER_XPATH; }
	public String getLAST_TWEET_XPATH () { return LAST_TWEET_XPATH; }
	public String getSEARCH_TXT_ID () { return SEARCH_TXT_ID; }
	public String SEARCH_TOPIC_BTN_XPATH () { return SEARCH_TOPIC_BTN_XPATH; }
	
	/*Login Page String Locators*/
	public static final String USR_TXT_XPATH = "//h1/following-sibling::form[contains(@class, 'signin')]//input[@name='session[username_or_email]']";
	public static final String PWD_TXT_XPATH = "//h1/following-sibling::form[contains(@class, 'signin')]//input[@name='session[password]']";
	public static final String LOGIN_BTN = "//h1/following-sibling::form[contains(@class, 'signin')]//button";
	
	/*Options Page String Locators*/
	public static final String PRIMARY_BTN_XPATH = "//a[2][@href='/login']"; 
}
