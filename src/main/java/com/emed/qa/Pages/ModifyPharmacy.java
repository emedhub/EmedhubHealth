package com.emed.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.emed.qa.TestBase.Base;

public class ModifyPharmacy extends Base {

	//page factory or object repository


	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id='submit']")
	WebElement login;

	//		@FindBy(xpath="//*[@id='loginForm']/div[1]/div[1]/img")
	//	WebElement eMedHuplogo;

	@FindBy(css = "body > div.container.body > div > div.right_col > div.col-md-12.col-sm-12.col-xs-12.xprofile > div > div > div > div > div.adm_home > div:nth-child(8) > a > section > div:nth-child(2)")
	WebElement Pharmacytab;


	@FindBy(css="body > div > div > div.right_col > div > div > div.homelistcontain > div > div > div.adm_home > div:nth-child(1) > a > section > div:nth-child(2)")
	WebElement Addnewpharmacy;
	
	
	//modify Pharmacy Search Clinic

	@FindBy(id="searchPharmacyName")
	WebElement Pharmacyname;

	@FindBy(id="searchPharmacyBranch")
	WebElement Branch;

	@FindBy(id="searchPharmacyArea")
	WebElement Area;

	@FindBy(id="searchPharmacyCity")
	WebElement City;

	@FindBy(id="searchPharmacyPhoneNo")
	WebElement phoneandmobnumber;

	@FindBy(id="searchPharmacyEmail")
	WebElement Email;
	
	@FindBy(id="btnSearchPharmacy")
	WebElement SearchpharBtn;



	
	public ModifyPharmacy() {

		PageFactory.initElements(driver, this);

	}
	
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();

		return new HomePage();

	}
	
	
	public PharmacyDetailsPage ModifyPhamracies(String Pharname, String branch, String Are, String cities,
			String phoneandmob, String emai) {

		Pharmacytab.click();

		Addnewpharmacy.click();

		Pharmacyname.sendKeys(Pharname);
		
		Branch.sendKeys(branch);
		
		Area.sendKeys(Are);
		
		City.sendKeys(cities);
		
		phoneandmobnumber.sendKeys(phoneandmob);
		
		Email.sendKeys(emai);
		
		SearchpharBtn.click();
		
		return new PharmacyDetailsPage();	
		

		}
		

}




















































































