package com.emed.qa.Pages;

import java.util.List;

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

public class Planpage extends Base{

	
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
			
			
			@FindBy(id="inner_planID")
			WebElement Plantab;

			//Laboratory

			@FindBy(xpath="//*[@id='inner_plan']/table/tbody/tr[1]/td/table/tbody/tr/td/ul/li[1]/a")
			WebElement laboratorylink;
		
			@FindBy(id="textAddTestToList")
			WebElement Labdata;
			
			@FindBy(id="btnAddTestToList")
			WebElement AddBtn;
			
//			@FindBy(id="btnAddTestAsFavorite")
//			WebElement AddtofavouriteBtn;
			
			@FindBy(id="btnSaveLabTestReport")
			WebElement LabdetailsSaveBtn;
			
			
			//Radiology

			@FindBy(xpath="//*[@id='inner_plan']/table/tbody/tr[1]/td/table/tbody/tr/td/ul/li[2]/a")
			WebElement Radiologylink;
			
			
			@FindBy(id="textAddRadTestToList")
			WebElement Raddata;
			
			@FindBy(id="btnAddRadTestToList")
			WebElement RadAddBtn;
			
			
			@FindBy(id="btnSaveRadiologyTestReport")
			WebElement RadSaveBtn;
			
			
			
			
			//SpecialTest
			
			@FindBy(xpath="//*[@id='inner_plan']/table/tbody/tr[1]/td/table/tbody/tr/td/ul/li[3]/a")
			WebElement Specialtestlink;
			
			
			@FindBy(id="textAddSplTestToList")
			WebElement Specdata;
			
			@FindBy(id="btnAddSplTestToList")
			WebElement SpecAddBtn;
			
			
			@FindBy(id="btnSaveSplTestReport")
			WebElement SpeSaveBtn;
			
			
			
			//Inhouse treatment
	
		
			@FindBy(xpath="//*[@id='inner_plan']/table/tbody/tr[1]/td/table/tbody/tr/td/ul/li[4]/a")
			WebElement Inhousetreatmentlink;
			
			
			@FindBy(id="btn_AddTreatment")
			WebElement AddnewBtn;
			
			@FindBy(id="treatmentName_0")
			WebElement TreatmentName;
			
			@FindBy(id="treatmentDosage_0")
			WebElement Dosage;
			
			@FindBy(id="treatmentRoute_0")
			WebElement Route;
		
			@FindBy(id="treatmentComments_0")
			WebElement Comments;
			
			
			@FindBy(id="btnSavePlansGP")
			WebElement InhoSavebtn;
			
			
		
			
			public Planpage() {

				PageFactory.initElements(driver, this);

			}

			
			
			public HomePage login(String un, String pwd) {
				
				username.sendKeys(un);
				password.sendKeys(pwd);
				login.click();

				return new HomePage();

			   }

			
			
			public Analysispage Plan(String selectclinic, String Bloo, String ct, String ct1, String Treatname, String Dose,
					String route, String Comment) {
				

				driver.findElement(By.id("selectClinicDoctor")).click();
				Select select = new Select(driver.findElement(By.id("selectClinicDoctor")));
				select.selectByVisibleText(selectclinic);
				
				
				patientnameclick.click();
				
				Analysistab.click();
				
				Plantab.click();
				
				//laboratory
				
				laboratorylink.click();
				
				Labdata.sendKeys(Bloo);
				
				Labdata.sendKeys(Keys.BACK_SPACE);
				Labdata.sendKeys(Keys.BACK_SPACE);
				
				
				
				try {

					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.visibilityOfAllElements(Labdata));
				
				
				WebElement select1 = driver.findElement(By.id("ui-id-1"));
				
				List<WebElement> options = select1.findElements(By.tagName("li"));

				   for (WebElement option2 : options) {

				   if("Blood Glucose Fasting".equals(option2.getText().trim()))

				    option2.click();  
				   
				   }   
				   
			   	} catch (Exception e) {

					//exception handling

				}
				
				AddBtn.click();
				
				LabdetailsSaveBtn.click();
				
				
				try {

					WebDriverWait wait = new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.alertIsPresent());
					Alert alert = driver.switchTo().alert();
					alert.accept();
				} catch (Exception e) {

					//exception handling

				}
				
				// Radiology
				
				Radiologylink.click();
				
				Raddata.sendKeys(ct);
				
				Raddata.sendKeys(Keys.BACK_SPACE);
				Raddata.sendKeys(Keys.BACK_SPACE);
				
				
				try {

					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.visibilityOfAllElements(Raddata));
				
				
				WebElement select1 = driver.findElement(By.id("ui-id-16"));
				
				List<WebElement> options = select1.findElements(By.tagName("li"));

				   for (WebElement option5 : options) {

				   if("US - Vascular".equals(option5.getText().trim()))

				    option5.click();  
				   
				   }   
				   
			   	} catch (Exception e) {

					//exception handling

				}
				
				
				RadAddBtn.click();
				
				RadSaveBtn.click();
				
				try {

					WebDriverWait wait = new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.alertIsPresent());
					Alert alert = driver.switchTo().alert();
					alert.accept();
				} catch (Exception e) {

					//exception handling

				}
				
				//Special Test
				
				Specialtestlink.click();
				
				Specdata.sendKeys(ct1);
				
				Specdata.sendKeys(Keys.BACK_SPACE);
				
				Specdata.sendKeys(Keys.BACK_SPACE);
				
				
				try {

					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.visibilityOfAllElements(Specdata));
				
				
				WebElement select1 = driver.findElement(By.id("ui-id-75"));
				
				List<WebElement> options = select1.findElements(By.tagName("li"));

				   for (WebElement option1 : options) {

				   if("Dexa scan - Bone Density".equals(option1.getText().trim()))

				    option1.click();  
				   
				   }   
				   
			   	} catch (Exception e) {

					//exception handling

				}
				
				SpecAddBtn.click();
				
				SpeSaveBtn.click();
				
				
				try {

					WebDriverWait wait = new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.alertIsPresent());
					Alert alert = driver.switchTo().alert();
					alert.accept();
				} catch (Exception e) {

					//exception handling

				}
				
				
				//inhouse Treatment
				
				
				Inhousetreatmentlink.click();
				
				AddnewBtn.click();
				
				TreatmentName.sendKeys(Treatname);
				
				Dosage.sendKeys(Dose);
				
				Route.sendKeys(route);
				
				Comments.sendKeys(Comment);
				
				InhoSavebtn.click();
				
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















































































