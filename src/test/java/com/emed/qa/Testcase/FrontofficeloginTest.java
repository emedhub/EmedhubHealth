package com.emed.qa.Testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Frontofficehomepage;
import com.emed.qa.Pages.Frontofficelogin;
import com.emed.qa.Pages.Frontofficepage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.LoginPage;
import com.emed.qa.TestBase.Base;
import com.emed.qa.Utils.TestUtill;

public class FrontofficeloginTest extends Base {

	Frontofficelogin Fologinpage;
	HomePage homepage;
	Frontofficehomepage fohomepage;


	String sheetname = "walkinpatient";

	public FrontofficeloginTest()  {
		super();
		
	}

	@BeforeMethod
	public void setup() {
		Initializtion();
		Fologinpage = new Frontofficelogin();

	}

	//	@Test
	//	public void loginpagetitleTest() {
	//
	//		String URL  = loginpage.validatecurrenturl();
	//		Assert.assertEquals(URL ,"http://103.16.143.56:6172/SprintUI/login.html");
	//
	//	}


	//	@Test
	//	public void Test() {
	//		boolean flag = loginpage.eMedHupimage();   
	//		Assert.assertTrue(flag);
	//
	//	}



	@DataProvider
	public Object[][] walkinpatientTestData() {
		Object data[][] = TestUtill.getTestdata(sheetname);
		return data;
	}


	@Test(dataProvider="walkinpatientTestData")

	public void loginpagetest1(String firname, String gender,

			String mobnu, String city, String country, String appdate, String apptime) {

		homepage =  Fologinpage.login(prop.getProperty("username"),prop.getProperty("password"));

		//		fohomepage = Fologinpage.clickonCreatenewpatient("Shewag","Male","9994048950","Coimbatore","India");


		fohomepage = Fologinpage.clickonCreatenewpatient(firname, gender, mobnu, city, country, appdate, apptime);
		

         }

}








// @AfterMethod
// public void  teardown() {
//	 driver.quit();
// }
// }


