package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emed.qa.Pages.AddModifyPharmacy;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.ModifyPharmacy;
import com.emed.qa.Pages.PharmacyDetailsPage;
import com.emed.qa.TestBase.Base;

public class AddModifyPharmacyTest extends Base {
  
	
	AddModifyPharmacy addmodifypharmacy;
	
	HomePage homepage;
	
	PharmacyDetailsPage pharmacydetailpage;
	
	
	public AddModifyPharmacyTest()  {

		super();
		
	}
	
	
	@BeforeMethod
  
	public void setup() {
		Initializtion();
		addmodifypharmacy = new AddModifyPharmacy();

	}
	

	@Test

	public void loginpagetest1() {

		homepage =  addmodifypharmacy.login(prop.getProperty("username"),prop.getProperty("password"));
		
		pharmacydetailpage = addmodifypharmacy.Addmodifypharmacy("sky Pharmacy","8220862066", "skyphar@gmail.com");
		
		
	
	  }
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
