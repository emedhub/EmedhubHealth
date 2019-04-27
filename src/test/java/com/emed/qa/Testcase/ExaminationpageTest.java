package com.emed.qa.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.emed.qa.Pages.Analysispage;
import com.emed.qa.Pages.Examinationpage;
import com.emed.qa.Pages.HomePage;
import com.emed.qa.Pages.SymptomsAllergiespage;
import com.emed.qa.TestBase.Base;
import com.emed.qa.Utils.TestUtill;

public class ExaminationpageTest extends Base {
	
	Examinationpage examinationpage;

	HomePage homepage;
	
	Analysispage analysispage;
	
	String sheetname ="examinations";
  
	public ExaminationpageTest()  {
		
		super();
	}

	@BeforeMethod
	public void setup() {
		Initializtion();
		examinationpage = new Examinationpage();

	}
	
	@DataProvider
	public Object[][] newexaminationData()   {
		Object data[][] = TestUtill.getTestdata(sheetname);
		return data;
		
	}
	
	@Test(dataProvider = "newexaminationData")
	public void logintest(String selectclinic, String heigt, String weght, String systo, String dyso, String temperture,
			String temptype, String pulse, String blosugar, String hent, String orals, String resp, String cardi,
			String apdomon, String nervou, String extre, String spine, String ski, String bone)  {

		homepage = examinationpage.login(prop.getProperty("username"),prop.getProperty("password"));
    
//		analysispage = examinationpage.Examination("Qcity Clinic","120","50","120","80","32","Fahrenheit","92","95","Head","Damaged","Cough",
//				"Vitals signs","Pain","Muscle strength","Pulse","Gait","Rashes","Fractures");
				
		analysispage = 	examinationpage.Examination(selectclinic, heigt, weght, systo, dyso, temperture, temptype, pulse,
				blosugar, hent, orals, resp, cardi, apdomon, nervou, extre, spine, ski, bone);
		
	    
     }
	
}




















