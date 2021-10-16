package com.ddf.test.LoginTest;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.ddf.base.base_pact;
import com.ddf.utils.ExtentReportManager;
import com.ddf.utils.TestDataProvider;

public class rediff extends base_pact
{
	
ExtentReports report=ExtentReportManager.getReportInstance();
	
	
	@Test(dataProvider="getTestOneData")
	public void testOne(Hashtable<String, String> dataTable) throws InterruptedException, IOException {
		 logger = report.createTest("Test login");
		invokeBrowser("chrome");
		openURL("websiteURL");
		elementClick("signinBtn_Xpath");
		enterText("username_path_Id",dataTable.get("email"));
		System.out.println("Username: dT.get(email)"+dataTable.get("email"));
		enterText("pass_path_Id",dataTable.get("pass"));
		elementClick("submit_but");
		logger.log(Status.PASS,"Test case passed successfully");
		Thread.sleep(2000);
		tearDown();
	}
	@AfterTest
	public void endReport() 
	{
		report.flush();
	}
	public void testOne_tryDP(Hashtable<String, String> dataTable) throws InterruptedException
	{
	//System.out.println(dataTable.get("Col1"));
	  //  logger = report.createTest("Enter UserName And Password in Rediff : " + dataTable.get("Col1"));
		invokeBrowser("chrome");
		openURL("websiteURL");
		elementClick("signinBtn_Xpath");
		//elementClick("signinBtn_Xpath");
		
		enterText("username_path_Id", dataTable.get("Col1"));
		Thread.sleep(2000);
		enterText("pass_path_Id", dataTable.get("Col3"));		
		Thread.sleep(2000);
		tearDown();
	}

	
	
	
	
	@DataProvider
	public Object[][] getTestOneData()
	{
		return TestDataProvider.getTestData("TestData_Testmanagement.xlsx", "Feature 1", "Test login");
	}
	

}
