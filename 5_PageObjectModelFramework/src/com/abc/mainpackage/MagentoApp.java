package com.abc.mainpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Logout;

public class MagentoApp {

	public static void main(String[] args) {

		WebDriver chrome = new ChromeDriver();
		
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "http://www.magento.com";
		chrome.get(url);
		// Creating object for Home page
		Home home = new Home(chrome);
		home.clickOnMyAccount();
		
		// Creating object for Login page
		String email ="nitinmanjunath1991@gmail.com";
		String password ="Welcome123";
				
		Login login = new Login(chrome);
		login.typeEmail(email);
		login.typePassword(password);
		login.clickOnLogin();
		
		Logout logout = new Logout(chrome);
		logout.clickOnLogout();
		
	}

}
