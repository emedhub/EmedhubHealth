package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Addnewpharmacy;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.Newclinicpage;
import com.emed.qa.Pages.PharmacyDetailsPage;
import com.emed.qa.TestBase.Base;
import com.emed.qa.Utils.TestUtill;

public class AddNewPharmacyTest extends Base {
	
	Addnewpharmacy addnewpharmacy;
	
	HomePage homepage;
	
	PharmacyDetailsPage pharmacydetailpage;
	
	
	String sheetname = "Addnewpharmacy";
	

	
	public AddNewPharmacyTest()  {

		super();
		
	}
	
	
	@BeforeMethod
  
	public void setup() {
		Initializtion();
		addnewpharmacy = new Addnewpharmacy();

	}


	//	@Test
	
	//	public void eMedHupimagelogoTest() {
	//		boolean flag = newclinicpage.eMedHupimage();   
	//		Assert.assertTrue(flag);
	//       
	//	}

	
	@DataProvider
	public Object[][] newpharmacycreateTestData() {
		Object data[][] = TestUtill.getTestdata(sheetname);
		return data;
		
	}

	

	@Test(dataProvider ="newpharmacycreateTestData")

	public void loginpagetest1(String Pharname, String Pinco, String branch, String Mobnum,
			String Emails, String GST, String Regnumber) {

		homepage =  addnewpharmacy.login(prop.getProperty("username"),prop.getProperty("password"));
		
//		pharmacydetailpage = addnewpharmacy.Addnewpharmacies("Roops Pharmacy", "641035", "Saravanampatti", "9994048950", "roops@gmail.com", "132454325635545", "ABC3458",
//				"Europe Clinic");
		
		
		pharmacydetailpage = addnewpharmacy.Addnewpharmacies(Pharname, Pinco, branch, Mobnum, Emails, GST, Regnumber);
		

	}
	
	
}
 
       
    
          
        

	



		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		