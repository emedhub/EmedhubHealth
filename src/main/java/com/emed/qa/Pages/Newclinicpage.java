package com.emed.qa.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.emed.qa.TestBase.Base;

public class Newclinicpage extends Base {
	
	

		//page factory or object repository
		@FindBy(name="username")
		WebElement username;

		@FindBy(name="password")
		WebElement password;

		@FindBy(xpath="//*[@id='submit']")
		WebElement login;

//		@FindBy(xpath="//*[@id='head']/div[2]/div/nav/ul/li[1]/a")
//		WebElement logout;

		@FindBy(xpath="//*[@id='loginForm']/div[1]/div[1]/img")
		WebElement eMedHuplogo;
		
		@FindBy(css = "body > div.container.body > div > div.right_col > div.col-md-12.col-sm-12.col-xs-12.xprofile > div > div > div > div > div.adm_home > div.boxlink.clr3 > a > section > div:nth-child(2)")
		WebElement Frontofficelink;
	
		
		@FindBy(css = "body > div > div > div.right_col > div > div > div.homelistcontain > div > div > div > div:nth-child(1) > a > section > div:nth-child(2)")
		WebElement Addclinicnamelink;
		
		@FindBy(xpath ="//*[@id='footer']/footer/div[1]/a") 
		WebElement svastanibhanda;
		
		@FindBy(id="addNewClinicName")
		WebElement addclinicname;
		
		@FindBy(id="addNewClinicAddress1")
		WebElement clinicaddress1;
		
		@FindBy(id="addNewClinicAddress2")
		WebElement clinicaddress2;
		
		@FindBy(id="addNewClinicAddress3")
		WebElement clinicaddress3;
		
		@FindBy(id="addNewClinicCity")
		WebElement cities;
		
		@FindBy(id ="addNewClinicPincode")
		WebElement pincode;
		
		@FindBy(id ="addNewClinicMobile1")
		WebElement mobilenumber;
		
		@FindBy(id ="addNewClinicEmail")
		WebElement emailid;
		
		@FindBy(xpath ="//*[@id='btnAddNewClinic']")
		WebElement savebtn;



		public Newclinicpage() {
			
			PageFactory.initElements(driver, this);

		}


		//Actions

//		public String validatecurrenturl() {
//			return driver.getCurrentUrl();
//		}


//		public boolean eMedHupimage() {
//
//			return eMedHuplogo.isDisplayed();
//		}


		public HomePage login(String un, String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			login.click();

			return new HomePage();
			
		}
		
		
		
		public Frontofficepage clickonfrontofficelink() {
			
			Frontofficelink.click();
			
			
			return new Frontofficepage();
			
		}
		
	
		
		public Addclinicnamepage addclinicnamelink(String addclinic, String add1,String add2, String add3, String city, 
				String state , String country,
				String pinco, String mobnu, String email)  {
			
			Addclinicnamelink.click();
			
			addclinicname.sendKeys(addclinic);
			clinicaddress1.sendKeys(add1);
			clinicaddress2.sendKeys(add2);
			clinicaddress3.sendKeys(add3);
			cities.sendKeys(city);
			
			
			
			
			Select select = new Select(driver.findElement(By.id("addNewClinicState")));
			select.selectByVisibleText(state);
			
			
			
			Select select1 = new Select(driver.findElement(By.id("addNewClinicCountry")));
			select1.selectByVisibleText(country);
			
			pincode.sendKeys(pinco);
			mobilenumber.sendKeys(mobnu);
			emailid.sendKeys(email);
			savebtn.click();
			
			
			try {
		        WebDriverWait wait = new WebDriverWait(driver, 2);
		        wait.until(ExpectedConditions.alertIsPresent());
		        Alert alert = driver.switchTo().alert();
		        alert.accept();
		    } catch (Exception e) {
		        //exception handling
		    }
			
			
		
			return new Addclinicnamepage();
		}
		
		
		
		
		
		public boolean addcliniclcon() {
			
			return svastanibhanda.isDisplayed();
			
	
			
		}  
			
}        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         

