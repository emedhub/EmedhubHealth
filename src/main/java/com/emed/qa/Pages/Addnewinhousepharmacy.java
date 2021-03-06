package com.emed.qa.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.emed.qa.TestBase.Base;

public class Addnewinhousepharmacy extends Base {

	//page factory or object repository


	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id='submit']")
	WebElement login;


	//	@FindBy(xpath="//*[@id='loginForm']/div[1]/div[1]/img")
	//	WebElement eMedHuplogo;

	@FindBy(css = "body > div.container.body > div > div.right_col > div.col-md-12.col-sm-12.col-xs-12.xprofile > div > div > div > div > div.adm_home > div:nth-child(8) > a > section > div:nth-child(2)")
	WebElement Pharmacytab;


	@FindBy(css="body > div > div > div.right_col > div > div > div.homelistcontain > div > div > div.adm_home > div:nth-child(1) > a > section > div:nth-child(2)")
	WebElement Addnewpharmacy;

	@FindBy(id="btnCreateNewPharmacy")
	WebElement CreateBtn;

	@FindBy(id="addPharmacyName")
	WebElement Pharmacyname;

	@FindBy(id="addPharmacyPincode")
	WebElement Pincode;

	@FindBy(id="addPharmacyBranch")
	WebElement Branch;

	@FindBy(id="addPharmacyMobile")
	WebElement Mobnumber;

	@FindBy(id="addPharmacyEmail")
	WebElement Email;

	@FindBy(id="addGSTN")
	WebElement GStin;

	@FindBy(id="addPharmacyRegNo")
	WebElement Regnum;

	@FindBy(id="inhousePharmacy")
	WebElement Inhousepharradioption;


	// Map the clinic

	@FindBy(id="searchClinicName")
	WebElement Clinicname;

	//	@FindBy(id="searchClinicCity")
	//	WebElement City;
	//
	//	@FindBy(id="searchClinicContact")
	//	WebElement phoneandmobilenum;

	@FindBy(id="btnSearchClinic")
	WebElement Searchclinic;

	@FindBy(id="btnCreate")
	WebElement CliniccreateBtn;

	//		@FindBy(id="btnClear")
	//		WebElement ClinicclearBtn;


	@FindBy(xpath="//*[@id='tblMapClinicList']/tbody/tr/td[2]/u/a")
	WebElement Clinicnamelink;


	// Map the Pharmacy with Linkclinic

	@FindBy(id="btnLinkPharmacy")
	WebElement LinkpharmacyBtn;


	//		@FindBy(xpath="//*[@id='popupMapClinic']/div/a")
	//		WebElement CloseBtn;


	public Addnewinhousepharmacy() {

		PageFactory.initElements(driver, this);

	}


	//	//Actions
	//
	//	//	public String validatecurrenturl() {
	//	//		return driver.getCurrentUrl();
	//	//	}
	//
	//
	//	//	public boolean eMedHupimage() {
	//	//
	//	//		return eMedHuplogo.isDisplayed();
	//	//	}
	//
	//
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();

		return new HomePage();

	}


	public PharmacyDetailsPage  Addnewinhousepharmacies(String Pharname, String Pinco, String branch, String Mobnum,
			String Emails, String GST, String Regnumber, String Searchclinics) {

		Pharmacytab.click();

		Addnewpharmacy.click();

		CreateBtn.click();

		Pharmacyname.sendKeys(Pharname);

		Pincode.sendKeys(Pinco);

		Pincode.sendKeys(Keys.TAB);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(Pincode));

		Branch.sendKeys(branch);

		Branch.sendKeys(Keys.TAB);

		Mobnumber.sendKeys(Mobnum);

		Email.sendKeys(Emails);

		GStin.sendKeys(GST);

		Regnum.sendKeys(Regnumber);

		Regnum.sendKeys(Keys.TAB);
		Regnum.sendKeys(Keys.TAB);
		
		
		try {

			WebDriverWait wait1 = new WebDriverWait(driver, 5);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {

			//exception handling

		}

		Inhousepharradioption.click();

      
		//Map the clinic

		Clinicname.sendKeys(Searchclinics);


		//		City.sendKeys();

		//		phoneandmobilenum.sendKeys();


		Searchclinic.click();


//        CliniccreateBtn.click();
//
//
		try {

			WebDriverWait wait1 = new WebDriverWait(driver, 5);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {

			//exception handling

		}
		
//
//		Clinicnamelink.click();
//
//
//    
//
//		//Map the Pharmacy
//
//
//		LinkpharmacyBtn.click();
//
//		try {
//
//			WebDriverWait wait2 = new WebDriverWait(driver, 3);
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//		} catch (Exception e) {
//
//			//exception handling
//
//		}
//
//
//
//		//	    CloseBtn.click();


		return new PharmacyDetailsPage();		
		

	}

}	





