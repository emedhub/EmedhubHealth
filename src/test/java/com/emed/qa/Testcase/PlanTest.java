package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Analysispage;
import com.emed.qa.Pages.AssessmentPage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.Planpage;
import com.emed.qa.TestBase.Base;

public class PlanTest extends Base {
	
	
	Planpage planpage;
	
	HomePage homepage;
	
	Analysispage analysispage;
	
	
	
	public PlanTest()  {

		super();
	}

	@BeforeMethod
	public void setup() {
		Initializtion();
		planpage = new Planpage();

	}


	@Test()
	public void logintest()  {

		homepage = planpage.login(prop.getProperty("username"),prop.getProperty("password"));

		analysispage = planpage.Plan("Qcity Clinic", "Blood", "ct-", "ct1","Lyrica", "125mg", "Nerve","Normal");


	}	

}

	





  

