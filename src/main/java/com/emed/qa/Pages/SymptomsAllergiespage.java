package com.emed.qa.Pages;

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

public class SymptomsAllergiespage extends Base{


	//page factory or object repository


	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id='submit']")
	WebElement login;



	@FindBy(xpath="//*[@id='tblDoctorsPatient']/tbody[2]/tr/td[4]/u/a")
	WebElement patientnameclick ;



	@FindBy(id="btnAnalysis")
	WebElement Analysistab ;

	//	Symptomps

	@FindBy(id="btnSym1")
	WebElement nextbtn;

	@FindBy(id="symptom1")
	WebElement symptoms1;

	@FindBy(id="symDuration1")
	WebElement duration1;

	@FindBy(id="symModeFactor1")
	WebElement modeofonset;

	@FindBy(id="symPrecipFactors1")
	WebElement precipationfactor;

	@FindBy(id="symptom1Desc")
	WebElement description;

	//Allergies

	@FindBy(id="btn_addAllergy")
	WebElement Addnewbtn;

	@FindBy(id="allergyName_0")
	WebElement Allergyname;


	@FindBy(id="comments_0")
	WebElement Comments;

//	@FindBy(xpath="//*[@id='tbl_gp_allery']/tbody/tr/td[6]/a")
//	WebElement removeallergybtn;

	@FindBy(xpath="//*[@id='btnSaveSymptomsAndAllergiesGP']")
	WebElement Savebtn;





	public SymptomsAllergiespage() {

		PageFactory.initElements(driver, this);

	}


	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();

		return new HomePage();

	}

	public Analysispage  DoctornotesPage(String selectclinic, String symptoms, String duration, String modeofset, String precipationfact,
			String Descrip,String entereddate, String allername, String allergytype, String allergystatus,String comment)  {


		driver.findElement(By.id("selectClinicDoctor")).click();
		Select select = new Select(driver.findElement(By.id("selectClinicDoctor")));
		select.selectByVisibleText(selectclinic);	

		patientnameclick.click();

		Analysistab.click();


		nextbtn.click();


		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			
			//exception handling
			
		}


		symptoms1.sendKeys(symptoms);
		duration1.sendKeys(duration);
		modeofonset.sendKeys(modeofset);
		precipationfactor.sendKeys(precipationfact);
		description.sendKeys(Descrip);


		Addnewbtn.click();


		driver.findElement(By.id("allergyStateDate_0")).click();
		driver.findElement(By.id("allergyStateDate_0")).sendKeys(entereddate);
		driver.findElement(By.id("allergyStateDate_0")).sendKeys(Keys.TAB);


		Allergyname.sendKeys(allername);

        driver.findElement(By.id("allergyType_0")).click();
		Select select1 = new Select(driver.findElement(By.id("allergyType_0")));
		select1.selectByVisibleText(allergytype);
		
        

		driver.findElement(By.cssSelector("#allergyActive_0")).click();
		Select select2 = new Select(driver.findElement(By.cssSelector("#allergyActive_0")));
		select2.selectByVisibleText(allergystatus);


		Comments.sendKeys(comment);

//		removeallergybtn.click();

//		try {		
//			WebDriverWait wait = new WebDriverWait(driver, 2);
//			wait.until(ExpectedConditions.alertIsPresent());
//			Alert alert = driver.switchTo().alert();
//			alert.dismiss();
//		} catch (Exception e) {
//			//exception handling
//		}


		Savebtn.click();


		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			
			//exception handling
			
		}


		return new Analysispage();


	}

}


















