package com.emed.qa.Pages;

import java.util.List;

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

public class AssessmentPage extends Base {
	
	//page factory or object repository


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


		@FindBy(id="inner_assessmentID")
		WebElement Assessmenttab;


		@FindBy(id="assessment1IcdCode")
		WebElement ICDCode;
		
		
		@FindBy(id="adviseGiven")
		WebElement Advise;
		
//		@FindBy(xpath="//*[@id='inner_assessment']/table/tbody/tr[4]/td/button[1]")
//		WebElement PrevBtn;
		
		
		@FindBy(id="btnSaveAssessmentGP")
		WebElement SaveBtn;
		
		
//		@FindBy(xpath="//*[@id='inner_assessment']/table/tbody/tr[4]/td/button[3]")
//		WebElement NextBtn;
		


  public AssessmentPage() {

	PageFactory.initElements(driver, this);

}


public HomePage login(String un, String pwd) {
	
	username.sendKeys(un);
	password.sendKeys(pwd);
	login.click();

	return new HomePage();

   }




public Analysispage Assessment(String selectclinic, String iCDcode2, String advise) {
	
	
	

	driver.findElement(By.id("selectClinicDoctor")).click();
	Select select = new Select(driver.findElement(By.id("selectClinicDoctor")));
	select.selectByVisibleText(selectclinic);
	
	
	patientnameclick.click();
	
	Analysistab.click();
	
	Assessmenttab.click();
	
	ICDCode.sendKeys(iCDcode2);
	
	ICDCode.sendKeys(Keys.BACK_SPACE);
	ICDCode.sendKeys(Keys.BACK_SPACE);
	
	try {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(ICDCode));
	
	
	WebElement select1 = driver.findElement(By.id("ui-id-1"));
	
	List<WebElement> options = select1.findElements(By.tagName("li"));

	   for (WebElement option1 : options) {

	   if("A009".equals(option1.getText().trim()))

	    option1.click();  
	   
	   }   
	   
   	} catch (Exception e) {

		//exception handling

	}
	
	

	
//	WebDriverWait wait1 = new WebDriverWait(driver,120);
//	wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("//*[@id='ui-id-1']//li")));
//	
//	List<WebElement> list = driver.findElements(By.tagName("//*[@id='ui-id-1']//li"));
//	
//	System.out.println("Auto Suggest List ::" + list.size());
//	
//	for(int i = 0 ;i< list.size();i++)
//	{
//		System.out.println(list.get(i).getText());
//		
//		if(list.get(i).getText().equals("A009"))
//		{
//			list.get(i).click();
//			break;
//		}
//	}
//	
	
	Advise.sendKeys(advise);
	
	SaveBtn.click();
	
	try {

		WebDriverWait wait1 = new WebDriverWait(driver, 2);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	} catch (Exception e) {

		//exception handling

	}
	
//	NextBtn.click();
	
	
	return new Analysispage();
	
	}


} 


