package com.emed.qa.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.emed.qa.TestBase.Base;

public class AddModifyPharmacy extends Base {

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


	@FindBy(id="btnSearchPharmacy")
	WebElement SearchBtn;


	@FindBy(xpath="//*[@id='tblPharmacyList']/tbody/tr[1]/td[2]/u/a")
	WebElement PharmacynameLink;


	@FindBy(id="addPharmacyMobile")
	WebElement mobilenumber;

	@FindBy(id="addPharmacyEmail")
	WebElement Emailid;

	@FindBy(id="btnCreate")
	WebElement SaveBtn;





	public AddModifyPharmacy() {

		PageFactory.initElements(driver, this);

	}


	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();

		return new HomePage();

	}

	public PharmacyDetailsPage Addmodifypharmacy(String Pharname, String mobnum, String Emails ) {

		Pharmacytab.click();

		Addnewpharmacy.click();

		Pharmacyname.sendKeys(Pharname);

		SearchBtn.click();

		PharmacynameLink.click();



		try {

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfAllElements(PharmacynameLink));


		} catch (Exception e) {

			//exception handling

		}

		//SCROLL DOWN
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();



		//Mousehover Option

		WebElement ele = driver.findElement(By.xpath("//*[@id='inhousePharmacyClinicName']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(ele).perform();



		mobilenumber.clear();
		mobilenumber.sendKeys(mobnum);

		Emailid.clear();
		Emailid.sendKeys(Emails);



		SaveBtn.click();


		try {

			WebDriverWait wait1 = new WebDriverWait(driver, 5);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {

			//exception handling

		}

		return new PharmacyDetailsPage();


	}


}























































