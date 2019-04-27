package com.emed.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.emed.qa.TestBase.Base;

public class Pediatrichistory extends Base {



	//page factory or object repository


	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id='submit']")
	WebElement login;

	@FindBy(xpath="//*[@id='tblDoctorsPatient']/tbody[2]/tr/td[4]/u/a")
	WebElement patientnameclick ;

	@FindBy(xpath="//*[@id='btnSpecialityHistoryli']")
	WebElement PediatrichistoryTab;

	//Birth history

	@FindBy(name="pregnancyComplication")
	WebElement pregancyradiooptionclick;

	@FindBy(id="pregnancyCompDesc")
	WebElement pregnancydesc;

	@FindBy(id="gestationalAgeWeeks")
	WebElement pretermweeks ;

	@FindBy(id="birthWeight")
	WebElement birthweght;

	@FindBy(name="afterBirthComplication")
	WebElement birthcomplicationradiooptionclick;

	@FindBy(id="afterBirthCompDesc")
	WebElement complicationdes;


	//Medical Problems


	@FindBy(name="obesity")
	WebElement obesityradiobuttonclick;

	@FindBy(id="obesityDesc")
	WebElement obedesc;

	@FindBy(name="eczema")
	WebElement eczemaradiobuttonclick;

	@FindBy(id="eczemaDesc")
	WebElement eczedesc;

	@FindBy(name="acidReflux")
	WebElement acidRefluxradiobuttonclick;

	@FindBy(id="acidRefluxDesc")
	WebElement acidrefludesc;

	@FindBy(name="headaches")
	WebElement headachesradiobuttonclick;

	@FindBy(id="headachesDesc")
	WebElement headachedescr;

	@FindBy(name="acne")
	WebElement acneradiobuttonclick;

	@FindBy(id="acneDesc")
	WebElement acnedescr;

	@FindBy(name="depression")
	WebElement depressionradiobuttonclick;

	@FindBy(id="depressionDesc")
	WebElement  deprescdesc;

	@FindBy(name="bedWetting")
	WebElement bedwettingradiobuttonclick;

	@FindBy(id="bedWettingDesc")
	WebElement bedwetingdesc;

	@FindBy(name="attentionIssues")
	WebElement attentionradiobuttonclick;

	@FindBy(id="attentionIssuesDesc")
	WebElement attentionissudesc;

	@FindBy(name="growthProblems")
	WebElement growthproblemradiobuttonclick;

	@FindBy(id="growthProblemsDesc")
	WebElement growthprobdesc;

	@FindBy(name="earInfections")
	WebElement earinfectionradiobuttonclick;

	@FindBy(id="earInfectionsDesc")
	WebElement earinfecdesc;

	@FindBy(name="developmentalIssues")
	WebElement developmentradiobuttonclick;

	@FindBy(id="developmentalIssuesDesc")
	WebElement developmentissdesc;

	@FindBy(name="constipation")
	WebElement constipationradiobuttonclick;

	@FindBy(id="constipationDesc")
	WebElement constipationdesc;

	@FindBy(name="schoolPerfProblems")
	WebElement schoolperfradiobuttonclick;

	@FindBy(id="schoolPerfProblemsDesc")
	WebElement schoolperformancedesc;


	@FindBy(id="additionalNotes")
	WebElement additionalnote;


	public Pediatrichistory() {

		PageFactory.initElements(driver, this);

	}


	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();

		return new HomePage();

	}


	public  Doctorhomepage  Doctorhomepageviewing(String selectclinic) {


		driver.findElement(By.id("selectClinicDoctor")).click();
		Select select = new Select(driver.findElement(By.id("selectClinicDoctor")));
		select.selectByVisibleText(selectclinic);	

		patientnameclick.click();

		return new Doctorhomepage();

	}



	public Pediatrichistorydetailspage birthhistory(String mother, String mode, String age, String week,
			String biweight,String baby) {

		pregancyradiooptionclick.click();

		pregnancydesc.sendKeys(mother);

		driver.findElement(By.id("modeOfDelivery")).click();
		Select select1 = new Select(driver.findElement(By.id("modeOfDelivery")));
		select1.selectByVisibleText(mode);

		driver.findElement(By.id("gestationalAge")).click();
		Select select2 = new Select(driver.findElement(By.id("gestationalAge")));
		select2.selectByVisibleText(age);

		pretermweeks.sendKeys(week);

		birthweght.sendKeys(biweight);

		birthcomplicationradiooptionclick.click();

		complicationdes.sendKeys(baby);


		return new Pediatrichistorydetailspage();


	}




	public Pediatrichistorydetailspage Medicalproblems(String Normal1, String Normal2, String Normal3, String Normal4,
			String Normal5, String Normal6, String Normal7, String Normal8, String Normal9, String Normal10,
			String Normal11, String Normal12, String  Normal13) {

		obesityradiobuttonclick.click();

		obedesc.sendKeys(Normal1);

		eczemaradiobuttonclick.click();

		eczedesc.sendKeys(Normal2);

		acidRefluxradiobuttonclick.click();

		acidrefludesc.sendKeys(Normal3);

		headachesradiobuttonclick.click();

		headachedescr.sendKeys(Normal4);

		acneradiobuttonclick.click();

		acnedescr.sendKeys(Normal5);

		depressionradiobuttonclick.click();

		deprescdesc.sendKeys(Normal6);

		bedwettingradiobuttonclick.click();

		bedwetingdesc.sendKeys(Normal7);

		attentionradiobuttonclick.click();

		attentionissudesc.sendKeys(Normal8);

		growthproblemradiobuttonclick.click();

		growthprobdesc.sendKeys(Normal9);

		earinfectionradiobuttonclick.click();

		earinfecdesc.sendKeys(Normal10);

		developmentradiobuttonclick.click();

		developmentissdesc.sendKeys(Normal11);

		constipationradiobuttonclick.click();

		constipationdesc.sendKeys(Normal12);

		schoolperfradiobuttonclick.click();

		schoolperformancedesc.sendKeys(Normal13);


		return new Pediatrichistorydetailspage();

	}

}


