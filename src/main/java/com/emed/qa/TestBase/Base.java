package com.emed.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.emed.qa.Utils.TestUtill;


public class Base {
	public static  WebDriver driver;
	public static Properties prop;

	public Base() {

		try {

			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:/WorkspaceAutomation1/EmedhubTest/src/main/java/com/emed/qa/Config/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException E) {
			E.printStackTrace();
		} catch (IOException E) {
			E.printStackTrace();
		}
	} 

	public static void Initializtion() {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtill.Page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtill.implicity_wait, TimeUnit.SECONDS);


		driver.get(prop.getProperty("url"));

	} 

} 






