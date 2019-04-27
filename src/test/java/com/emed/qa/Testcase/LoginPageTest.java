package com.emed.qa.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.LoginPage;
import com.emed.qa.TestBase.Base;
import com.emed.qa.Utils.TestUtill;


public class LoginPageTest extends Base {
	LoginPage loginpage;
	HomePage homepage;
	
	
	
	public LoginPageTest()  {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initializtion();
		loginpage = new LoginPage();

	}

	@Test
	public void loginpagetitleTest() {

		String URL  = loginpage.validatecurrenturl();
		Assert.assertEquals(URL ,"http://103.16.143.56:6172/SprintUI/login.html");

	}


	@Test
	public void eMedHupimagelogoTest() {
		boolean flag = loginpage.eMedHupimage();   
		Assert.assertTrue(flag);

	}

	
	
	@Test
	public void loginpagetest1() {

		homepage=  loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

}

// @AfterMethod
// public void  teardown() {
//	 driver.quit();
// }
// }

