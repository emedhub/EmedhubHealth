package com.emed.qa.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.emed.qa.TestBase.Base;

public class Newpatientpage extends Base {


	//page factory or object repository
	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id='submit']")
	WebElement login;

	//		@FindBy(xpath="//*[@id='head']/div[2]/div/nav/ul/li[1]/a")
	//		WebElement logout;

	//		@FindBy(xpath="//*[@id='loginForm']/div[1]/div[1]/img")
	//		WebElement eMedHuplogo;

	@FindBy(css = "body > div.container.body > div > div.right_col > div.col-md-12.col-sm-12.col-xs-12.xprofile > div > div > div > div > div.adm_home > div.boxlink.clr2 > a > section > div:nth-child(2)")
	WebElement Patientlink;


	@FindBy(css = "body > div > div > div.right_col > div > div > div.homelistcontain > div > div > div.adm_home > div:nth-child(1) > a > section > div:nth-child(2)")
	WebElement Newpatientsetup;

	@FindBy(id="patientFnameText")
	WebElement firstname;

	@FindBy(id="patientMobileText")
	WebElement mobnum1; 

	@FindBy(id="patientUserID")
	WebElement useridss;

	@FindBy(id="patientPincodeText")
	WebElement pincod;


	@FindBy(xpath ="//*[@id='btnCreatePatientProfile']")
	WebElement savebtn;




	public Newpatientpage() {

		PageFactory.initElements(driver, this);

	}


	//Actions

	//		public String validatecurrenturl() {
	//			return driver.getCurrentUrl();
	//		}


	//		public boolean eMedHupimage() {
	//
	//			return eMedHuplogo.isDisplayed();
	//		}


	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();

		return new HomePage();
	}


	public Patient  clickonpatientlink() {


		Patientlink.click();

		Newpatientsetup.click();

		return new Patient();

	}

	public Newpatientlinks clickonnewpatientlink(String firname, String gender, String mobnumb, String userid,
			String pincodes) {
			

		//		Newpatientsetup.click();

		firstname.sendKeys(firname);

		Select select = new Select(driver.findElement(By.id("patientGenderText")));
		select.selectByVisibleText(gender);

		mobnum1.sendKeys(mobnumb);

		useridss.sendKeys(userid);

		pincod.sendKeys(pincodes);

		pincod.sendKeys(Keys.TAB);

 
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfAllElements(pincod));


		savebtn.click();


		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 2);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			//exception handling
		}


		return new Newpatientlinks();

	}


}
























