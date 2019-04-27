package com.emed.qa.Pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.emed.qa.TestBase.Base;

public class PatientHistorypage extends Base {

	//page factory or object repository


	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//*[@id='submit']")
	WebElement login;

	@FindBy(xpath="//*[@id='tblDoctorsPatient']/tbody[2]/tr/td[4]/u/a")
	WebElement patientnameclick ;

	@FindBy(id="patientArthritis1")
	WebElement radiobutton1;

	@FindBy(id="jointpainDesc")
	WebElement jointpain;

	@FindBy(id="patientLungDisease1")
	WebElement radiobutton2;

	@FindBy(id="breathingProblemDesc")
	WebElement breathingproblems;


	@FindBy(id="patientBP1")
	WebElement radiobutton3;

	@FindBy(id="bpDesc")
	WebElement highbloodpressure;


	@FindBy(id="patientAsthma1")
	WebElement radiobutton4;

	@FindBy(id="asthmaDesc")
	WebElement Asthma;

	@FindBy(id="patientCancer1")
	WebElement radiobutton5;

	@FindBy(id="cancerDesc")
	WebElement cancer;

	@FindBy(id="patientDiabetes1")
	WebElement radiobutton6;

	@FindBy(id="diabetesDesc")
	WebElement dibetesbloodsugar;

	@FindBy(id="patientEyeDisease1")
	WebElement radiobutton7;

	@FindBy(id="eyeDiseaseDesc")
	WebElement eyeproplems;

	@FindBy(id="patientHeartDisease1")
	WebElement radiobutton8;

	@FindBy(id="heartDiseaseDesc")
	WebElement heartdisease;

	@FindBy(id="patientKidneyDisease1")
	WebElement radiobutton9;

	@FindBy(id="kidneyDiseaseDesc")
	WebElement kidneydiseases;

	@FindBy(name="patientSeizuresEpilepsey")
	WebElement radiobutton10;

	@FindBy(id="seizuresDesc")
	WebElement seizuresepilepsy;

	@FindBy(name="patientThyroid")
	WebElement radiobutton11;

	@FindBy(id="thyroidDesc")
	WebElement thyroiddisorder;

	@FindBy(name="patientStomachIntDisease")
	WebElement radiobutton12;

	@FindBy(id="stomachIntDesc")
	WebElement stomachinstetinaldisease;


	@FindBy(name="patientStroke")
	WebElement radiobutton13;

	@FindBy(id="strokeDesc")
	WebElement stroke;

	@FindBy(id="patientLiverDisease1")
	WebElement radiobutton14;

	@FindBy(id="liverDiseaseDesc")
	WebElement liverdisease;


	@FindBy(id="patientPsychiatricDisorder1")
	WebElement  radiobutton15;

	@FindBy(id="mentalIllnessDesc")
	WebElement mentalillness;


	@FindBy(id="patientHeadache1")
	WebElement  radiobutton16;

	@FindBy(id="patientHeadacheProblemsDesc")
	WebElement headache;


	@FindBy(id="bloodTransfusion1")
	WebElement radiobutton17;

	@FindBy(id="bloodTransfusionDetails")
	WebElement bloodtransfusion;


	@FindBy(name="patientBloodProblems")
	WebElement radiobutton18;

	@FindBy(id="patientBloodProblemsDesc")
	WebElement bloodproblems;


	@FindBy(name="patientOtherDisease")
	WebElement radiobutton19;

	@FindBy(id="otherDiseasseDesc")
	WebElement others;


	//SurgicalHistory

	@FindBy(xpath="//*[@id='headingSurgicalHistory']/h4")
	WebElement surgicalhistorylink;

	@FindBy(css="#patientSurgery1")
	WebElement surgicalhistoryradiobuttonclick;

	@FindBy(id="surgery1Desc")
	WebElement surgery1;

	@FindBy(id="surgery1Year")
	WebElement year1;

	@FindBy(id="surgery2Desc")
	WebElement surgery2;

	@FindBy(id="surgery2Year")
	WebElement year2;


	//Hospitalization 

	@FindBy(xpath="//*[@id='headingHospitalization']/h4")
	WebElement Hospitalizationlink;

	@FindBy(css="#patientHospitalized1")
	WebElement Hospitalizationradiobuttonclick;

	@FindBy(id="hospitalized1Desc")
	WebElement hospital1;

	@FindBy(id="hospitalized1Year")
	WebElement hosyear1;

	@FindBy(id="hospitalized1Reason")
	WebElement hosreason1;

	@FindBy(id="hospitalized2Desc")
	WebElement hospital2;

	@FindBy(id="hospitalized2Year")
	WebElement hosyear2;

	@FindBy(id="hospitalized2Reason")
	WebElement hosreason2;

	@FindBy(id="hospitalized3Desc")
	WebElement Hospital3;

	@FindBy(id="hospitalized3Year")
	WebElement hosyear3;

	@FindBy(id="hospitalized3Reason")
	WebElement hosreason3;

	//Social History

	@FindBy(xpath="//*[@id='headingSocialHistory']/h4")
	WebElement socialhistorylink;

	@FindBy(id="patientAlcohol1")
	WebElement radiobut1;

	@FindBy(id="alcoholDesc")
	WebElement Alcoholdes;

	@FindBy(name="patientMarried")
	WebElement radiobut2;

	@FindBy(name="patientSexuallyActive")
	WebElement radiobut3;

	@FindBy(id="patientSmoking1")
	WebElement radiobut4;

	@FindBy(id="smokingDesc")
	WebElement smokingdes;

	@FindBy(name="patientMultiplePartner")
	WebElement radiobut5;

	@FindBy(id="patientDrugs1")
	WebElement radiobut6;

	@FindBy(id="drugsDesc")
	WebElement drugdescrip;

	@FindBy(id="patientOccupationSocial")
	WebElement employee;

	@FindBy(name="patientDailyActivityLevel")
	WebElement radiobut8;

	@FindBy(id="exerciseRegularly1")
	WebElement radiobut9;

	@FindBy(id="exerciseDescription")
	WebElement exercisedes;


	//family history
	
	@FindBy(xpath="//*[@id='headingFamilyHistory']/h4")
	WebElement familyhistorylink;

	@FindBy(id="mentalProblemsHist")
	WebElement mentalproblemdes;

	@FindBy(id="asthmaHist")
	WebElement asthmahis;

	@FindBy(id="highBPHist")
	WebElement highbpdes;

	@FindBy(id="cancerHist")
	WebElement canchistdes;

	@FindBy(id="diabetesHist")
	WebElement diabdesc;

	@FindBy(id="heartDiseaseHist")
	WebElement heartdiseashis;

	@FindBy(id="highCholesterolHist")
	WebElement highchohist;

	@FindBy(id="hypertensionHist")
	WebElement hypertenhist;

	@FindBy(id="headacheHist")
	WebElement headachehistory;

	@FindBy(id="nerveBrainProblemHist")
	WebElement nervebrainprohis;

	@FindBy(id="obesityOverweightHist")
	WebElement obesityhis;

	@FindBy(id="stomachIntProblemHist")
	WebElement stomachIntProbleHis;

	@FindBy(id="strokeHist")
	WebElement strokehis;

	@FindBy(id="tuberculosisHist")
	WebElement tuberculosishist;

	@FindBy(id="thyroidHormonalHist")
	WebElement thyroidhist;

	@FindBy(id="bloodProblemsHist")
	WebElement bloodprohis;

	@FindBy(id="addlNotes")
	WebElement additionalnotes;




	public PatientHistorypage() {

		PageFactory.initElements(driver, this);

	}


	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();

		return new HomePage();

	}


	public  Doctorhomepage  Doctorhomepageviewing(String selectclinic) {


		driver.findElement(By.id("selectClinicDoctor")).click();
		Select select = new Select(driver.findElement(By.id("selectClinicDoctor")));
		select.selectByVisibleText(selectclinic);	

		patientnameclick.click();

		return new Doctorhomepage();

	}





	public boolean jointpain() {

		return radiobutton1.isDisplayed();
	}


	public boolean breathingproblems() {

		return radiobutton2.isDisplayed();

	}


	//		public boolean highbloodpressure() {
	//			return radiobutton3.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean Asthma() {
	//			return radiobutton4.isDisplayed();
	//				
	//		}
	//		
	//		
	//		
	//		public boolean cancer() {
	//			return radiobutton5.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean dibetesbloodsugar() {
	//			return radiobutton6.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean eyeproplems() {
	//			return radiobutton7.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean heartdisease() {
	//			return radiobutton8.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean kidneydiseases() {
	//			return radiobutton9.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean seizuresepilepsy() {
	//			return radiobutton10.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean thyroiddisorder() {
	//			return radiobutton11.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean stomachinstetinaldisease() {
	//			return radiobutton12.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean stroke() {
	//			return radiobutton13.isDisplayed();
	//				
	//		}
	//		
	//		
	//		
	//		public boolean liverdisease() {
	//			return radiobutton14.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean mentalillness() {
	//			return radiobutton15.isDisplayed();
	//				
	//		}
	//		
	//		
	//		
	//		public boolean headache() {
	//			return radiobutton16.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean bloodtransfusion() {
	//			return radiobutton17.isDisplayed();
	//				
	//		}
	//		
	//		
	//		public boolean bloodproblems() {
	//			return radiobutton18.isDisplayed();
	//				
	//		}
	//		
	//	
	//		
	//		public boolean others() {
	//			return radiobutton19.isDisplayed();
	//				
	//		}
	//
	//
	//		




	public Patienthistorydetailspage Medicalhistory(String jointpain2, String breathingproblems2,
			String highbloodpressures, String asthuma, String canc, String diabetesbloodsugar, String eyeproblems,
			String heartdiseases, String kidneydisease, String seizuresepilepsys, String thyroiddisorders,
			String stomachintestinaldiseases, String strokes, String liverdiseases, String mentalillnesss,
			String headaches, String bloodtranfusions,String bp, String selectbpgoup, String bloodproblemss, String normal) {






		radiobutton1.click();
		jointpain.sendKeys(jointpain2);
		radiobutton2.click();
		breathingproblems.sendKeys(breathingproblems2);
		radiobutton3.click();
		highbloodpressure.sendKeys(highbloodpressures);
		radiobutton4.click();
		Asthma.sendKeys(asthuma);
		radiobutton5.click();
		cancer.sendKeys(canc);
		radiobutton6.click();
		dibetesbloodsugar.sendKeys(diabetesbloodsugar);
		radiobutton7.click();
		eyeproplems.sendKeys(eyeproblems);
		radiobutton8.click();
		heartdisease.sendKeys(heartdiseases);
		radiobutton9.click();
		kidneydiseases.sendKeys(kidneydisease);
		radiobutton10.click();
		seizuresepilepsy.sendKeys(seizuresepilepsys);
		radiobutton11.click();
		thyroiddisorder.sendKeys(thyroiddisorders);
		radiobutton12.click();
		stomachinstetinaldisease.sendKeys(stomachintestinaldiseases);
		radiobutton13.click();
		stroke.sendKeys(strokes);
		radiobutton14.click();
		liverdisease.sendKeys(liverdiseases);
		radiobutton15.click();
		mentalillness.sendKeys(mentalillnesss);
		radiobutton16.click();
		headache.sendKeys(headaches);
		radiobutton17.click();
		bloodtransfusion.sendKeys(bloodtranfusions);

		driver.findElement(By.id("patientBloodGroup")).click();
		Select select = new Select(driver.findElement(By.id("patientBloodGroup")));
		select.selectByVisibleText(bp);

		driver.findElement(By.id("patientBloodGroupSign")).click();
		Select select1 = new Select(driver.findElement(By.id("patientBloodGroupSign")));
		select1.selectByVisibleText(selectbpgoup);


		radiobutton18.click();
		bloodproblems.sendKeys(bloodproblemss);
		radiobutton19.click();
		others.sendKeys(normal);




		return new Patienthistorydetailspage();


	}



	public  Patienthistorydetailspage  surigicalhistory(String surgergeries1, String years1, 
			String surgergeries2, String years2) {


		surgicalhistorylink.click();


		surgicalhistoryradiobuttonclick.click();


		surgery1.sendKeys(surgergeries1);

		year1.sendKeys(years1);

		surgery2.sendKeys(surgergeries2);

		year2.sendKeys(years2);

		return new Patienthistorydetailspage();


	}




	public Patienthistorydetailspage Hospitalization(String hos1, String yea1, String hosrea1, 
			String hos2, String yea2, String hosrea2, String hos3, String yea3, String hosrea3 ) {

		Hospitalizationlink.click();

		Hospitalizationradiobuttonclick.click();

		hospital1.sendKeys(hos1);

		hosyear1.sendKeys(yea1);

		hosreason1.sendKeys(hosrea1);

		hospital2.sendKeys(hos2);

		hosyear2.sendKeys(yea2);

		hosreason2.sendKeys(hosrea2);

		Hospital3.sendKeys(hos3);

		hosyear3.sendKeys(yea3);

		hosreason3.sendKeys(hosrea3);



		return new Patienthistorydetailspage();


	}  




	public Patienthistorydetailspage Socialhistory(String alcoholselect,String alcho, String smok, String Requ,
			String partner, String Someti, String reqular, String work, String walk ) {

		socialhistorylink.click();

		radiobut1.click();

		driver.findElement(By.id("alcoholFrequency")).click();
		Select select = new Select(driver.findElement(By.id("alcoholFrequency")));
		select.selectByVisibleText(alcoholselect);

		Alcoholdes.sendKeys(alcho);

		radiobut2.click();

		radiobut3.click();

		radiobut4.click();

		driver.findElement(By.id("smokingFrequency")).click();
		Select select1 = new Select(driver.findElement(By.id("smokingFrequency")));
		select1.selectByVisibleText(smok);

		smokingdes.sendKeys(Requ);

		driver.findElement(By.id("patientPartner")).click();
		Select select2 = new Select(driver.findElement(By.id("patientPartner")));
		select2.selectByVisibleText(partner);

		radiobut5.click();

		driver.findElement(By.id("drugsFrequency")).click();
		Select select3 = new Select(driver.findElement(By.id("drugsFrequency")));
		select3.selectByVisibleText(Someti);

		drugdescrip.sendKeys(reqular);

		employee.sendKeys(work);

		radiobut8.click();

		radiobut9.click();

		exercisedes.sendKeys(walk);

		return new Patienthistorydetailspage();

	}

	



	public Patienthistorydetailspage Familyhistory(String MenPr, String Normal1, String amsath, String Normal2, String highbp, 
			String Normal3, String cancers, String Normal4, String diabe, String Normal5, String heartdis, String Normal6,
			String highcho, String  Normal7, String hyperte, String Normal8, String heada, String Normal9, String nerveepil,
			String Normal10, String obes, String Normal11, String stomachinpro, String Normal12, String stro, String Normal13,
			String tuberco, String Normal14, String thryr, String Normal15, String bloddpb, String Normal16, String History ) {

		familyhistorylink.click();
		
		driver.findElement(By.id("familyMentalProblems")).click();
		Select select1 = new Select(driver.findElement(By.id("familyMentalProblems")));
		select1.selectByVisibleText(MenPr);

		mentalproblemdes.sendKeys(Normal1);

		driver.findElement(By.id("familyAsthma")).click();
		Select select2 = new Select(driver.findElement(By.id("familyAsthma")));
		select2.selectByVisibleText(amsath);

		asthmahis.sendKeys(Normal2);

		driver.findElement(By.id("familyHighBP")).click();
		Select select3 = new Select(driver.findElement(By.id("familyHighBP")));
		select3.selectByVisibleText(highbp);

		highbpdes.sendKeys(Normal3);

		driver.findElement(By.id("familyCancer")).click();
		Select select4 = new Select(driver.findElement(By.id("familyCancer")));
		select4.selectByVisibleText(cancers);

		canchistdes.sendKeys(Normal4);


		driver.findElement(By.id("familyDiabetes")).click();
		Select select5 = new Select(driver.findElement(By.id("familyDiabetes")));
		select5.selectByVisibleText(diabe);

		diabdesc.sendKeys(Normal5);

		driver.findElement(By.id("familyHeartDisease")).click();
		Select select6 = new Select(driver.findElement(By.id("familyHeartDisease")));
		select6.selectByVisibleText(heartdis);

		heartdiseashis.sendKeys(Normal6);


		driver.findElement(By.id("familyHighCholesterol")).click();
		Select select7 = new Select(driver.findElement(By.id("familyHighCholesterol")));
		select7.selectByVisibleText(highcho);

		highchohist.sendKeys(Normal7);

		driver.findElement(By.id("familyHypertension")).click();
		Select select8 = new Select(driver.findElement(By.id("familyHypertension")));
		select8.selectByVisibleText(hyperte);

		hypertenhist.sendKeys(Normal8);

		driver.findElement(By.id("familyHeadache")).click();
		Select select9 = new Select(driver.findElement(By.id("familyHeadache")));
		select9.selectByVisibleText(heada);

		headachehistory.sendKeys(Normal9);

		driver.findElement(By.id("familyNerveBrainProblem")).click();
		Select select10 = new Select(driver.findElement(By.id("familyNerveBrainProblem")));
		select10.selectByVisibleText(nerveepil);

		nervebrainprohis.sendKeys(Normal10);

		driver.findElement(By.id("familyObesity")).click();
		Select select11 = new Select(driver.findElement(By.id("familyObesity")));
		select11.selectByVisibleText(obes);

		obesityhis.sendKeys(Normal11);

		driver.findElement(By.id("familyStomachIntProblem")).click();
		Select select12 = new Select(driver.findElement(By.id("familyStomachIntProblem")));
		select12.selectByVisibleText(stomachinpro);

		stomachIntProbleHis.sendKeys(Normal12);


		driver.findElement(By.id("familyStroke")).click();
		Select select13 = new Select(driver.findElement(By.id("familyStroke")));
		select13.selectByVisibleText(stro);

		strokehis.sendKeys(Normal13);

		driver.findElement(By.id("familyTuberculosis")).click();
		Select select14 = new Select(driver.findElement(By.id("familyTuberculosis")));
		select14.selectByVisibleText(tuberco);

		tuberculosishist.sendKeys(Normal14);

		driver.findElement(By.id("familyThyroid")).click();
		Select select15 = new Select(driver.findElement(By.id("familyThyroid")));
		select15.selectByVisibleText(thryr);

		thyroidhist.sendKeys(Normal15);

		driver.findElement(By.id("familyBloodProblems")).click();
		Select select16 = new Select(driver.findElement(By.id("familyBloodProblems")));
		select16.selectByVisibleText(bloddpb);

		bloodprohis.sendKeys(Normal16);

		additionalnotes.sendKeys(History);


		return new Patienthistorydetailspage();


	}

}















