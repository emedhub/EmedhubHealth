package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Doctorhomepage;
import com.emed.qa.Pages.Doctorloginpage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.TestBase.Base;

import junit.framework.Assert;

public class DoctorHomepageTest extends Base{
 

	Doctorloginpage doctorloginpage;
	HomePage homepage;
	Doctorhomepage doctorhomepage;
	public DoctorHomepageTest()  {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initializtion();
		doctorloginpage = new Doctorloginpage();

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
	
	
	

	
	@Test
	public void loginpagetest1() {

		homepage = doctorloginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		doctorhomepage = doctorloginpage.PatientAppointmentlist("Qcity Clinic");
		
	}
	
	
	@Test
	public void doctornamevalidate() {
		
		boolean flag = doctorloginpage.doctornamevalidate();
		Assert.assertTrue(flag);
		
	}
		 
}
	
	


// @AfterMethod
// public void  teardown() {
//	 driver.quit();
// }
// }

	
	

