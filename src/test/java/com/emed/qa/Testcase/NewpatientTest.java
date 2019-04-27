package com.emed.qa.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Addclinicnamepage;
import com.emed.qa.Pages.Frontofficepage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.LoginPage;
import com.emed.qa.Pages.Newclinicpage;
import com.emed.qa.Pages.Newpatientlinks;
import com.emed.qa.Pages.Newpatientpage;
import com.emed.qa.Pages.Patient;
import com.emed.qa.TestBase.Base;
import com.emed.qa.Utils.TestUtill;

public class NewpatientTest extends Base {

	Newpatientpage  Newpatient;
	Patient Patientlink;
	Newpatientlinks Newpatientset;
	HomePage homepage;


	
	String sheetname = "newpatient";

	public NewpatientTest()  {
		super();
	}



	@BeforeMethod
	public void setup() {
		Initializtion();
		Newpatient = new Newpatientpage();

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
	public Object[][] newpatientTestData() {
		Object data[][] = TestUtill.getTestdata(sheetname);
		return data;
	}

	//@Test(dataProvider="newclinicTestData")


	@Test(dataProvider="newpatientTestData")

	public void loginpagetest1(String firname, String gender, String mobnumb, String userid, String pincodes ) {
			



		homepage=  Newpatient.login(prop.getProperty("username"),prop.getProperty("password"));
		Patientlink = Newpatient.clickonpatientlink();
		//		Newpatientset = Newpatient.clickonnewpatientlink("vikas","Male","9994048950","vikas1","Coimbatore","Tamil Nadu");
		
		Newpatientset = Newpatient.clickonnewpatientlink(firname, gender, mobnumb, userid, pincodes);

	}
	
}



//    @AfterMethod
//    public void teardown() {
//    driver.quit();
//
//    }
//    }




