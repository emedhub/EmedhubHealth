package com.emed.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emed.qa.TestBase.Base;
//import com.main.java.com.emed.qa.Pages.HomePage;

public class LoginPage extends Base {
	//page factory or object repository
	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id='submit']")
	WebElement login;

	@FindBy(xpath="//*[@id='head']/div[2]/div/nav/ul/li[1]/a")
	WebElement logout;

	@FindBy(xpath="//*[@id='loginForm']/div[1]/div[1]/img")
	WebElement eMedHuplogo;



	public LoginPage() {
		PageFactory.initElements(driver, this);

	}


	//Actions

	public String validatecurrenturl() {
		return driver.getCurrentUrl();
	}


	public boolean eMedHupimage() {

		return eMedHuplogo.isDisplayed();
	}


	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();

		return new HomePage();
	}


	

}


