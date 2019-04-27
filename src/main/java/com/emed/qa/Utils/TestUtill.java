package com.emed.qa.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import com.emed.qa.TestBase.Base;

public class TestUtill extends Base {

	public static long Page_load_timeout = 10;
	public static long implicity_wait = 30;



	public static String TESTDATA_SHEET_PATH ="E:/WorkspaceAutomation/EmedhubTest/src/main/java/com/emed/qa/Testdata/NewPatientdata.xlsx";


	static Workbook book;
	static Sheet sheet;



	public static Object[][] getTestdata(String sheetname) {

		FileInputStream  file = null;

		try {

			file = new FileInputStream(TESTDATA_SHEET_PATH);

		}catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {

			book =  WorkbookFactory.create(file);

		} catch (InvalidFormatException e) {

			e.printStackTrace();

		}catch  (IOException e) {

			e.printStackTrace();

		}

		sheet = book.getSheet(sheetname);

		Object [][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];


		//	System.out.println(sheet.getLastRowNum() + "*******"  + sheet.getRow(0).getLastCellNum());


		for (int i = 0 ; i<sheet.getLastRowNum(); i++)  {


			for (int k =0 ; k<sheet.getRow(0).getLastCellNum(); k++)  {


				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();

				//system.out.println(data[i][k]);

			}

		}

		return data;


	}
}































