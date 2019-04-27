package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Analysispage;
import com.emed.qa.Pages.Doctorhomepage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.PatientHistorypage;
import com.emed.qa.Pages.Patienthistorydetailspage;
import com.emed.qa.Pages.SymptomsAllergiespage;
import com.emed.qa.TestBase.Base;
import com.emed.qa.Utils.TestUtill;

public class SymptomsAllergiesTest extends Base {

	SymptomsAllergiespage symptomsallergiespage;
	HomePage homepage;
	Analysispage analysispage;

	Patienthistorydetailspage patienthistorydetails;
	
	String sheetname = "symptomsallergies";

	public SymptomsAllergiesTest()  {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initializtion();
		symptomsallergiespage = new SymptomsAllergiespage();

	}
	
	
	
	@DataProvider
	public Object[][] newsymptomsallergiesData()   {
		Object data[][] = TestUtill.getTestdata(sheetname);
		return data;
		
	}

     
	@Test(dataProvider ="newsymptomsallergiesData")
	public void logintest(String selectclinic, String symptoms, String duration, String modeofset, String precipationfact,
			String Descrip,String entereddate, String allername, String allergytype, String allergystatus, String comment) {

		homepage = symptomsallergiespage.login(prop.getProperty("username"),prop.getProperty("password"));

		//		analysispage = symptomsallergiespage.DoctornotesPage("Qcity Clinic", "Fever", "5days","Dullache","Increase"
		//				"pastweek","19-02-2019","Crocin","Medication Allergy","Active","Normal");
		//				

		analysispage =	symptomsallergiespage.DoctornotesPage(selectclinic, symptoms, duration, modeofset, precipationfact, Descrip, entereddate, allername, allergytype, allergystatus,comment);

        
	}

}


















