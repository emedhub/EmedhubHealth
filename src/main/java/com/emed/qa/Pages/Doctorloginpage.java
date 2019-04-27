package com.emed.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emed.qa.TestBase.Base;

public class Doctorloginpage extends Base {
	
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

	@FindBy(xpath="//*[@id='tblDoctorsPatient']/tbody[2]/tr/td[4]/u/a")
	WebElement patientnameclick ;
	
	@FindBy(xpath="//*[@id='doctorName']")
	WebElement doctorname;
	

	public Doctorloginpage() {
		
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
	
	
 
	public Doctorhomepage PatientAppointmentlist(String selectclinic) {
		
		driver.findElement(By.id("selectClinicDoctor")).click();
		Select select = new Select(driver.findElement(By.id("selectClinicDoctor")));
		select.selectByVisibleText(selectclinic);	
		
		patientnameclick.click();
		
		return new Doctorhomepage();
		
	}

	 public boolean doctornamevalidate()  {
		   
		   return doctorname.isDisplayed();
		   
	   }

}
