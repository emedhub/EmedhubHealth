package com.emed.qa.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.emed.qa.TestBase.Base;

public class Examinationpage extends Base {

	//page factory or object repository


	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id='submit']")
	WebElement login;



	@FindBy(xpath="//*[@id='tblDoctorsPatient']/tbody[3]/tr/td[4]/u/a")
	WebElement patientnameclick;


	@FindBy(id="btnAnalysis")
	WebElement Analysistab;


	@FindBy(id="inner_examinationID")
	WebElement Examinationtab;




	//Examination

	//vitals


	@FindBy(id="heightInCms")
	WebElement height;

	@FindBy(id="weightKgs")
	WebElement weight;

	@FindBy(id="bloodPressureSystolic")
	WebElement systolic;

	@FindBy(id="bloodPressureDystolic")
	WebElement dystolic;

	@FindBy(id="temperatureFahrenheit")
	WebElement temperature;

	@FindBy(id="pulseOximetry")
	WebElement pulseoximetry;

	@FindBy(id="bloodSugar")
	WebElement Bloodsugar;



	//Examinations

	@FindBy(id="heent")
	WebElement Heent;

	@FindBy(id="oralDental")
	WebElement oral;

	@FindBy(id="respiratory")
	WebElement respi;

	@FindBy(id="cardiovascular")
	WebElement cardio;

	@FindBy(id="abdomen")
	WebElement apdom;

	@FindBy(id="nervousSystem")
	WebElement nervous;

	@FindBy(id="extremities")
	WebElement extreme;

	@FindBy(id="spine")
	WebElement spines;

	@FindBy(id="skin")
	WebElement skins;

	@FindBy(id="genitalUrniary")
	WebElement bones;




	//	@FindBy(id="btnClearExamination")
	//	WebElement clear;


	//	@FindBy(xpath="//*[@id='inner_examination']/table/tbody/tr/td[2]/div[2]/a/button")
	//	WebElement Addtofavourite;


	//	@FindBy(xpath="//*[@id='inner_examination']/div[5]/button[1]")
	//	WebElement Previousbtn;

	@FindBy(xpath="//*[@id='btnSaveVitalsAndExaminationGP']")
	WebElement Savebtn;

	//	@FindBy(xpath="//*[@id='inner_examination']/div[5]/button[3]")
	//	WebElement Nextbtn;



	public Examinationpage() {

		PageFactory.initElements(driver, this);

	}


	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();

		return new HomePage();

	}


	public Analysispage Examination(String selectclinic, String heigt, String weght, String systo, String dyso, String temperture,
			String temptype, String pulse, String blosugar, String hent, String orals, String resp, String cardi,
			String apdomon, String nervou, String extre, String spine, String ski, String bone) {
		
		
		driver.findElement(By.id("selectClinicDoctor")).click();
		Select select = new Select(driver.findElement(By.id("selectClinicDoctor")));
		select.selectByVisibleText(selectclinic);	


		patientnameclick.click();

		Analysistab.click();

		Examinationtab.click();



		height.sendKeys(heigt);	
		weight.sendKeys(weght);

		Keyboard keyboard = ((HasInputDevices) driver).getKeyboard();
		keyboard.pressKey(Keys.TAB);

		systolic.sendKeys(systo);
		dystolic.sendKeys(dyso);

		temperature.sendKeys(temperture);

		driver.findElement(By.id("temperatureType")).click();
		Select select1 = new Select(driver.findElement(By.id("temperatureType")));
		select1.selectByVisibleText(temptype);

		pulseoximetry.sendKeys(pulse);
		Bloodsugar.sendKeys(blosugar);

		Heent.sendKeys(hent);
		oral.sendKeys(orals);
		respi.sendKeys(resp);
		cardio.sendKeys(cardi);
		apdom.sendKeys(apdomon);
		nervous.sendKeys(nervou);
		extreme.sendKeys(extre);
		spines.sendKeys(spine);
		skins.sendKeys(ski);
		bones.sendKeys(bone);



		//		clear.click();

		//		Addtofavourite.click();

		//		Previousbtn.click();

		Savebtn.click();
		

		try {

			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {

			//exception handling

		}




		//		Nextbtn.click();


		return new Analysispage();

	}

}






















































