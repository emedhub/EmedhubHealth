package com.emed.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.emed.qa.TestBase.Base;

public class Prescriptionpage extends Base {
	

	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id='submit']")
	WebElement login;



	@FindBy(xpath="//*[@id='tblDoctorsPatient']/tbody[2]/tr/td[4]/u/a")
	WebElement patientnameclick;


	@FindBy(id="btnAnalysis")
	WebElement Analysistab;
	
	
	@FindBy(id="prescriptionTab")
	WebElement PrescriptionTab ;

}
