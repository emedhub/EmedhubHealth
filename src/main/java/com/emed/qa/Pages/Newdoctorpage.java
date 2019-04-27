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

public class Newdoctorpage extends Base{

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

	@FindBy(css = "body > div.container.body > div > div.right_col > div.col-md-12.col-sm-12.col-xs-12.xprofile > div > div > div > div > div.adm_home > div.boxlink.clr1 > a > section > div:nth-child(2)")
	WebElement Doctorlink;


	@FindBy(css = "body > div.container.body > div > div.right_col > div > div > div.homelistcontain > div > div > div.adm_home > div:nth-child(1) > a > section > div:nth-child(2)")
	WebElement Newdoctorsetup;



	@FindBy(id="doctorFnameText")
	WebElement firstname;

	@FindBy(id="doctorInitialText")
	WebElement surname;

	@FindBy(id="doctorEmailText")
	WebElement email;

	@FindBy(id="doctorSpecialitySpecialityIdText")
	WebElement speciality;

	@FindBy(id="doctorEduQualificationText")
	WebElement eduqua;

	@FindBy(id="userIdText")
	WebElement userid;

	@FindBy(id="doctorMobileText")
	WebElement mobnum;

	@FindBy(id="doctorRegistrationIdText")
	WebElement regid;

	@FindBy(id="doctorClinicNameText")
	WebElement priclinicname;


	@FindBy(id="txtAadharCardNo")
	WebElement Aadharcard;


	@FindBy(id="isInvoiceRequired1")
	WebElement invoiceradiooption;


	@FindBy(id="checkPostalAddressCAP")
	WebElement postaladdresscheckbox;

	@FindBy(id="doctorClinic1NameText")
	WebElement clinicname1;

	@FindBy(id="doctorClinic1Add1Text")
	WebElement address1;

	@FindBy(id="doctorClinic1Add2Text")
	WebElement address2;

	@FindBy(id="doctorClinic1Add3Text")
	WebElement address3;

	@FindBy(id="doctorClinic1CityText")
	WebElement city;


	@FindBy(id="doctorClinic1PhoneNumberText")
	WebElement phonenumber;

	@FindBy(xpath="//*[@id='btnAddDrNew']")
	WebElement savebtn ;



	public Newdoctorpage() {

		PageFactory.initElements(driver, this);

	}


	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();

		return new HomePage();
	}




	public Doctorpage clickondoctorlink() {

		Doctorlink.click();

		Newdoctorsetup.click();

		return new  Doctorpage();
	}


	public Doctorpage newdoctorsetup(String firname, String suname, String gender, String dob, String emails, 
			String specia, String eduquali, String useid, String mobnumb, String regids, String pricliname, String aadhar,
			String gp, String clinicname, String add1, String add2, String add3, String cities, String state,
			String coutrys, String phnumber) {



		firstname.sendKeys(firname);
		surname.sendKeys(suname);

		driver.findElement(By.id("doctorGenderText")).click();
		Select select = new Select(driver.findElement(By.id("doctorGenderText")));
		select.selectByVisibleText(gender);


		driver.findElement(By.id("doctorDobText")).click();
		driver.findElement(By.id("doctorDobText")).sendKeys(dob);
		driver.findElement(By.id("doctorDobText")).sendKeys(Keys.TAB);



		email.sendKeys(emails);
		speciality.sendKeys(specia);
		eduqua.sendKeys(eduquali);
		userid.sendKeys(useid);
		mobnum.sendKeys(mobnumb);
		regid.sendKeys(regids);
		priclinicname.sendKeys(pricliname);

		Aadharcard.sendKeys(aadhar);

		driver.findElement(By.id("selectSvnProfile")).click();
		Select select2 = new Select(driver.findElement(By.id("selectSvnProfile")));	
		select2.selectByVisibleText(gp);

		invoiceradiooption.click();

		postaladdresscheckbox.click();

		clinicname1.sendKeys(clinicname);
		address1.sendKeys(add1);
		address2.sendKeys(add2);
		address3.sendKeys(add3);
		city.sendKeys(cities);


		driver.findElement(By.id("doctorClinic1StateText")).click();
		Select select3 = new Select(driver.findElement(By.id("doctorClinic1StateText")));	
		select3.selectByVisibleText(state);

		driver.findElement(By.id("doctorClinic1CountryText")).click();
		Select select4 = new Select(driver.findElement(By.id("doctorClinic1CountryText")));	
		select4.selectByVisibleText(coutrys);


		phonenumber.sendKeys(phnumber);

		savebtn.click();



		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			//exception handling
		}


		//		try { 
		//
		//	          Robot robot = new Robot(); 
		//
		//	          robot.keyPress(KeyEvent.VK_ENTER); 
		//	         } 
		//	    catch (AWTException e) { 
		//	           e.printStackTrace(); 
		//	         } 


		return new Doctorpage();
	}


}



































