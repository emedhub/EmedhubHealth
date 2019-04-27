package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Analysispage;
import com.emed.qa.Pages.AssessmentPage;
import com.emed.qa.Pages.Examinationpage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.TestBase.Base;

public class AssessmentTest extends Base {

	AssessmentPage assessmentpage;

	HomePage homepage;

	Analysispage analysispage;

	public AssessmentTest()  {

		super();
	}

	@BeforeMethod
	public void setup() {
		Initializtion();
		assessmentpage = new AssessmentPage();

	}


	@Test()
	public void logintest()  {

		homepage = assessmentpage.login(prop.getProperty("username"),prop.getProperty("password"));

		analysispage = assessmentpage.Assessment("Qcity Clinic", "A00", "Do not eat raw vegetables");


	}	

}











