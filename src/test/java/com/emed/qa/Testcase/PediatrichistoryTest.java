package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Doctorhomepage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.Pediatrichistory;
import com.emed.qa.Pages.Pediatrichistorydetailspage;
import com.emed.qa.TestBase.Base;

public class PediatrichistoryTest extends Base {
 
	Pediatrichistory pediatrichistory;
	HomePage homepage;
	Doctorhomepage doctorhomepage;
	
	Pediatrichistorydetailspage pediatrichistorydetails;
	
	public PediatrichistoryTest()  {
		
	super();
	
	}
	
	@BeforeMethod
	public void setup() {
		Initializtion();
		pediatrichistory = new Pediatrichistory();
	}
	
	
	
	@Test
	public void logintest() {
		
		homepage = pediatrichistory.login(prop.getProperty("username"),prop.getProperty("password"));
       
		doctorhomepage = pediatrichistory.Doctorhomepageviewing("Svasta clinic");
		
		pediatrichistorydetails = pediatrichistory.birthhistory("Mother", "C-Section", "Post Term","2", "2.5", "Baby");
		
		pediatrichistorydetails = pediatrichistory.Medicalproblems("Normal1", "Normal2", "Normal3", "Normal4", "Normal5", "Normal6",
				"Normal7", "Normal8","Normal9","Normal10", "Normal11","Normal12","Normal13");
		
		
   }
	
}






















