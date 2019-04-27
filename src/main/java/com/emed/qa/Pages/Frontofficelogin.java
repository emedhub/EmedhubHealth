package com.emed.qa.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

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

public class Frontofficelogin extends Base {


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


	@FindBy(xpath="//*[@id='todaytabledate']/tbody[2]/tr/td[2]/a")
	WebElement Doctornamelink;

	@FindBy(id="btnMakeAppointment")
	WebElement Makeappointmentlink;

	@FindBy(id="btnSearchPatient")
	WebElement Searchpatientlink;

	@FindBy(id="btnCreateAppointment")
	WebElement CreateAppointmentlink;

	@FindBy(id="patientFnameText")
	WebElement firstname;

	@FindBy(id="patientMobileText")
	WebElement mobnum1; 

	@FindBy(id="patientCityText")
	WebElement cities;


	@FindBy(xpath ="//*[@id='btnEditProfile']")
	WebElement savebtn;


	@FindBy(xpath ="//*[@id='btntaddAppointment']")
	WebElement createappointmentBtn;






	public Frontofficelogin() {

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


	public Frontofficehomepage clickonCreatenewpatient(String firname, String gender,

			String mobnu, String city, String country, String appdate, String apptime )    {	



		Doctornamelink.click();

		Makeappointmentlink.click();

		Searchpatientlink.click();

		CreateAppointmentlink.click();


		firstname.sendKeys(firname);


		Select select = new Select(driver.findElement(By.id("patientGenderText")));
		select.selectByVisibleText(gender);		

		mobnum1.sendKeys(mobnu);

		cities.sendKeys(city);

		Select select1 = new Select(driver.findElement(By.id("patientCountryText")));
		select1.selectByVisibleText(country);

		savebtn.click();
		
		try {
	        WebDriverWait wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	    } catch (Exception e) {
	        //exception handling
	    }

		

		driver.findElement(By.id("tadddate")).click();
		driver.findElement(By.id("tadddate")).sendKeys(appdate);
		driver.findElement(By.id("tadddate")).sendKeys(Keys.TAB);


		driver.findElement(By.id("taddtime")).click();
		Select select2 = new Select(driver.findElement(By.id("taddtime")));
		select2.selectByVisibleText(apptime);
		
	
		createappointmentBtn.click();
		
		
		try {
	        WebDriverWait wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	    } catch (Exception e) {
	        //exception handling
	    }


		return new Frontofficehomepage();

	}

}



































