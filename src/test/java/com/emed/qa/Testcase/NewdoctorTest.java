package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Doctorpage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.Newdoctorpage;
import com.emed.qa.Pages.Newpatientpage;
import com.emed.qa.TestBase.Base;
import com.emed.qa.Utils.TestUtill;

public class NewdoctorTest extends Base {
  
	Newdoctorpage newdoctorpage;
	
	Doctorpage doctorsetup;
	HomePage homepage;
	
	String sheetname = "Sheet1";
	
	public NewdoctorTest()  {
		super();
	}
	
	

	@BeforeMethod
	public void setup() {
		Initializtion();
		newdoctorpage = new Newdoctorpage();

	}

//	@Test
//	public void loginpagetitleTest() {
//
//		String URL  = Newpatient.validatecurrenturl();
//		Assert.assertEquals(URL ,"http://103.16.143.56:6172/SprintUI/login.html");
//
//	}


//	@Test
//	public void eMedHupimagelogoTest() {
//		boolean flag = Newpatient.eMedHupimage();   
//		Assert.assertTrue(flag);
//
//	}	
	
	
	
	@DataProvider
	public Object[][] newdoctorTestData() {
		Object data[][] = TestUtill.getTestdata(sheetname);
		return data;
	}
	
	//@Test(dataProvider="newclinicTestData")
	

	@Test(dataProvider="newdoctorTestData")
	
	public void loginpagetest1(String firname, String suname, String gender, String dob, String emails, 
			String specia, String eduquali, String useid, String mobnumb, String regids, String pricliname, String aadhar,
			String gp, String clinicname, String add1, String add2, String add3, String cities, String state,
			String coutrys, String phnumber) {
			 
		
			

		homepage=  newdoctorpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		doctorsetup = newdoctorpage.clickondoctorlink();
		
//		doctorsetup =  newdoctorpage.newdoctorsetup("Senbha", "B", "Female", "13-02-2011", "senbha@gmail.com", "Generalphysician", "MBBS", "senbha@123", "9994048950", "DR0453", "Senbhaclinic");
      
		doctorsetup = newdoctorpage.newdoctorsetup(firname, suname, gender, dob, emails, specia, eduquali, useid, mobnumb, regids, pricliname,aadhar,
				gp, clinicname, add1, add2, add3, cities, state, coutrys, phnumber);
		
		
	}
	
}






//    @AfterMethod
//    public void teardown() {
//    driver.quit();
//
//    }
//    }



