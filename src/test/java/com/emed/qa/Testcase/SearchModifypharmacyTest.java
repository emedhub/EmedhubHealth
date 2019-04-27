package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.ModifyPharmacy;
import com.emed.qa.Pages.PharmacyDetailsPage;
import com.emed.qa.TestBase.Base;

public class SearchModifypharmacyTest extends Base {
  
	ModifyPharmacy modifypharmacy;
	
	HomePage homepage;
	
	PharmacyDetailsPage pharmacydetailpage;
	
	
	public SearchModifypharmacyTest()  {

		super();
		
	}
	
	
	@BeforeMethod
  
	public void setup() {
		Initializtion();
		modifypharmacy = new ModifyPharmacy();

	}
	

	@Test

	public void loginpagetest1() {

		homepage =  modifypharmacy.login(prop.getProperty("username"),prop.getProperty("password"));
		
//		pharmacydetailpage = addnewpharmacy.Addnewpharmacies("Roops Pharmacy", "641035", "Saravanampatti", "9994048950", "roops@gmail.com", "132454325635545", "ABC3458",
//				"Europe Clinic");
		
		
//		pharmacydetailpage = modifypharmacy.ModifyPhamracies("sky Pharmacy", "Sarvanampatti Post", "S v Puram Proozone",
//				"Coimbatore", "4221234567", "skypharmacy@gmail.com");
		
		
		pharmacydetailpage = modifypharmacy.ModifyPhamracies("$%^&*()", "$%^&*()", "$%^&*()",
				"$%^&*()", "4221", "$%^&*()");
		
		
		
	}
	

}

	































