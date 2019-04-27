package com.emed.qa.Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.java.com.emed.qa.Pages.HomePage;
import com.main.java.com.emed.qa.Pages.LoginPage;

public class LoginPageTest extends Base {
  
	LoginPage loginpage;
	 HomePage homepage;
	public LoginpageTest()  {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		Initializtion();
		loginpage = new LoginPage();
	}
	
 @Test
 public void loginpagetest1() {
	 homepage=  loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
 }

 
 @AfterMethod
 public void  teardown() {
	 driver.quit(); 
 }
 }
