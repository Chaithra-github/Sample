package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	WebDriver chrome;
	// iNstance variable
	By myAccount = By.linkText("My Account");

	// MEthod
	public Home(WebDriver chrome) {
		super();
	this.chrome = chrome;
	}

	public void clickOnMyAccount() {
		chrome.findElement(myAccount).click();
	}
}
