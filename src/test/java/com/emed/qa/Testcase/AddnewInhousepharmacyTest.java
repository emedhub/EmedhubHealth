package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Addnewinhousepharmacy;
import com.emed.qa.Pages.Addnewpharmacy;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.PharmacyDetailsPage;
import com.emed.qa.TestBase.Base;
import com.emed.qa.Utils.TestUtill;

public class AddnewInhousepharmacyTest extends Base {
  
	
	Addnewinhousepharmacy addnewinhousepharmacy;
	
	HomePage homepage;
	
	PharmacyDetailsPage pharmacydetailpage;
	
	
	String sheetname = "Inhousepharmacy";
	

	
	public AddnewInhousepharmacyTest()  {

		super();
		
	}
	
	
	@BeforeMethod
  
	public void setup() {
		Initializtion();
		addnewinhousepharmacy = new Addnewinhousepharmacy();

	}


	//	@Test
	
	//	public void eMedHupimagelogoTest() {
	//		boolean flag = newclinicpage.eMedHupimage();   
	//		Assert.assertTrue(flag);
	//       
	//	}

	
	@DataProvider
	public Object[][] AddnewinhousepharmacyTestData() {
		Object data[][] = TestUtill.getTestdata(sheetname);
		return data;
		
	}

	

	@Test(dataProvider ="AddnewinhousepharmacyTestData")

	public void loginpagetest1(String Pharname, String Pinco, String branch, String Mobnum,
			String Emails, String GST, String Regnumber, String Searchclinics) {

		homepage =  addnewinhousepharmacy.login(prop.getProperty("username"),prop.getProperty("password"));
		
//		pharmacydetailpage = addnewpharmacy.Addnewpharmacies("Roops Pharmacy", "641035", "Saravanampatti", "9994048950", "roops@gmail.com", "132454325635545", "ABC3458",
//				"Europe Clinic");
		
		
		pharmacydetailpage = addnewinhousepharmacy.Addnewinhousepharmacies(Pharname, Pinco, branch, Mobnum, Emails, GST, Regnumber, Searchclinics);

		
		
	}
	

}

    















