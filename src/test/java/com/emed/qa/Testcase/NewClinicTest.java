package com.emed.qa.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Addclinicnamepage;
import com.emed.qa.Pages.Frontofficepage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.Newclinicpage;
import com.emed.qa.TestBase.Base;
import com.emed.qa.Utils.TestUtill;

public class NewClinicTest extends Base {

	Newclinicpage newclinicpage;
	HomePage  homepage;
	Frontofficepage frontofficepage;
	
	Addclinicnamepage addclinicnamepage;

	String sheetname = "newclinic";

	@BeforeMethod

	public void setup() {
		Initializtion();
		newclinicpage = new Newclinicpage();

	}


	//	@Test
	
	//	public void eMedHupimagelogoTest() {
	//		boolean flag = newclinicpage.eMedHupimage();   
	//		Assert.assertTrue(flag);
	//       
	//	}


	@DataProvider
	public Object[][] newclinicTestData() {
		Object data[][] = TestUtill.getTestdata(sheetname);
		return data;
	}


	//(dataProvider="newclinicTestData")

	@Test(dataProvider="newclinicTestData")

	public void loginpagetest1(String addclinic, String add1,String add2, String add3, String city, 
			String state , String country,
			String pinco, String mobnu, String email) {

		homepage =  newclinicpage.login(prop.getProperty("username"),prop.getProperty("password"));
		frontofficepage = newclinicpage.clickonfrontofficelink();
		//   	    addclinicnamepage = newclinicpage.addclinicnamelink("saravanamclinic", "123,street", "sivanandhapuram", "saravanampatti", "Coimbatore", "Tamil Nadu", "India", "641035","9994048950","saravanama@gmail.com");

		addclinicnamepage = newclinicpage.addclinicnamelink(addclinic, add1, add2, add3, city, state, country, pinco, mobnu, email);

		//		

	}

	//	@Test(priority = 1)
	//	public void addclinicnamedropdownarrow() 
	//		boolean flag = newclinicpage.addcliniclcon();
	//		Assert.assertTrue(flag);
	//	}


	//	@AfterMethod
	//	
	//	public void teardown() {
	//		
	//	driver.quit();
	//	
	//	}	
	//	
	//	@Test
	//	public void verifyFrontofficelinkTest() {
	//		
	//		frontofficepage = newclinicpage.clickonfrontofficelink();
	//
	//	}
	//	
	//	@Test
	//	public void verifyAddclinicnamelinkTest() {
	//		
	//		addclinicnamepage = newclinicpage.addclinicnamelink();
	//		
	//
	//	}

}






























