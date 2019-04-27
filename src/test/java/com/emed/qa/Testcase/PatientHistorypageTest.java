package com.emed.qa.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Doctorhomepage;
import com.emed.qa.Pages.Doctorloginpage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.PatientHistorypage;
import com.emed.qa.Pages.Patienthistorydetailspage;
import com.emed.qa.TestBase.Base;

public class PatientHistorypageTest extends Base {
	
	PatientHistorypage patienthistorypage;
	HomePage homepage;
	Doctorhomepage doctorhomepage;

	Patienthistorydetailspage patienthistorydetails;
	
	public PatientHistorypageTest()  {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initializtion();
		patienthistorypage = new PatientHistorypage();
		
	}

	
	@Test
	public void logintest() {
		
		homepage = patienthistorypage.login(prop.getProperty("username"),prop.getProperty("password"));
       
		doctorhomepage = patienthistorypage.Doctorhomepageviewing("Svasta clinic");
		
		
		
		patienthistorydetails = patienthistorypage.Medicalhistory("Jointswelling", "Breathingproblems", "highbloodpressures", "Asthuma", "cancer", 
				   "diabetesbloodsugar", "eyeproblems", "heartdiseases", "kidneydisease", "seizuresepilepsys", "thyroiddisorders", "stomachintestinaldiseases", "strokes", "liverdiseases",
				   "mentalillnesss", "headaches", "bloodtranfusions","A", "Positive", "bloodproblemss", "normal");
		
		patienthistorydetails = patienthistorypage.surigicalhistory("Legsurgery", "2015", "Handsurgery", "2016");
		
		patienthistorydetails = patienthistorypage.Hospitalization("KG Hospital", "2016", "Normal Visit ", "KMCH Hospital", "2016", "Normal Visit",
				"Royalcare Hospital", "2018", "Normal Visit");
		
		
		patienthistorydetails = patienthistorypage.Socialhistory("Occasionally", "Sometiems", "1-2 cigarettes per day", "Reqular", "Female", "Smokes Marijuana", "Reqular", 
				"Employee", "walking");
		
		
		patienthistorydetails = patienthistorypage.Familyhistory("Yes", "Normal1", "Yes", "Normal2", "Yes", "Normal3", "Yes", "Normal4", "Yes", "Normal5", "Yes", "Normal6", "Yes", "Normal7",
				"Yes", "Normal8", "Yes", "Normal9", "Yes", "Normal10", "Yes","Normal11", "Yes", "Normal12", "Yes", "Normal13", "Yes","Normal14", "Yes","Normal15", "Yes", "Normal16", "Add medical History");
		
		
	   }
	
	
}

   




// @Test(priority =1)
//	public void validatejointpainradiooption() {
//		boolean flag = patienthistorypage.jointpain();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test(priority =2)
//	public void validatebreathingproblemsradiooption() {
//		boolean flag = patienthistorypage.breathingproblems();
//		Assert.assertTrue(flag);
//
//	}
//	
//}
  

	

//	
//	@Test
//	public void validatehighbloodpressureradiooption() {
//		boolean flag = patienthistorypage.highbloodpressure();
//		Assert.assertTrue(flag);
//
//	}
//
//	@Test
//	public void validateAsthmaradiooption() {
//		boolean flag = patienthistorypage.Asthma();
//		Assert.assertTrue(flag);
//
//	}
//
//	@Test
//	public void validatecancerradiooption() {
//		boolean flag = patienthistorypage.cancer();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test
//	public void validatedibetesbloodsugarradiooption() {
//		boolean flag = patienthistorypage.dibetesbloodsugar();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test
//	public void validateeyeproplemsradiooption() {
//		boolean flag = patienthistorypage.eyeproplems();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test
//	public void validateheartdiseaseradiooption() {
//		boolean flag = patienthistorypage.heartdisease();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test
//	public void validatekidneydiseasesradiooption() {
//		boolean flag = patienthistorypage.kidneydiseases();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test
//	public void validateseizuresepilepsyradiooption() {
//		boolean flag = patienthistorypage.seizuresepilepsy();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test
//	public void validatethyroiddisorderradiooption() {
//		boolean flag = patienthistorypage.thyroiddisorder();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test
//	public void validatestomachinstetinaldiseaseradiooption() {
//		boolean flag = patienthistorypage.stomachinstetinaldisease();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test
//	public void validatestrokeradiooption() {
//		boolean flag = patienthistorypage.stroke();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test
//	public void validateliverdiseaseradiooption() {
//		boolean flag = patienthistorypage.liverdisease();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//	@Test
//	public void validatementalillnessradiooption() {
//		boolean flag = patienthistorypage.mentalillness();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//
//	@Test
//	public void validateheadacheradiooption() {
//		boolean flag = patienthistorypage.headache();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//
//	@Test
//	public void validatebloodtransfusionradiooption() {
//		boolean flag = patienthistorypage.bloodtransfusion();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//
//	@Test
//	public void validatebloodproblemsradiooption() {
//		boolean flag = patienthistorypage.bloodproblems();
//		Assert.assertTrue(flag);
//
//	}
//	
//	
//
//	@Test
//	public void validateothersradiooption() {
//		boolean flag = patienthistorypage.others();
//		Assert.assertTrue(flag);
//
//	}
	
//   @Test 
//   
//   public void patientmedicalhistorydetails() {
//	   
//	   patienthistorydetails = patienthistorypage.Medicalhistory("Jointpain", "Breathingproblems", "highbloodpressures", "Asthuma", "canc", 
//			   "diabetesbloodsugar", "eyeproblems", "heartdiseases", "kidneydisease", "seizuresepilepsys", "thyroiddisorders", "stomachintestinaldiseases", "strokes", "liverdiseases",
//			   "mentalillnesss", "headaches", "bloodtranfusions", "bloodproblemss", "normal");
//	
//          }
//	
//}
	
	
