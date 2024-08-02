package com.crm.Listeners1;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClassVtiger.BaseClass;

public class VtigetrListner extends BaseClass implements ITestListener {
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log("onTestStart", true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess", true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("onTestFailure", true);
		LocalDateTime date = LocalDateTime.now(); 
		String time = date.toString().replace(":", "-");
		
		
		  TakesScreenshot ts=(TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to=new File("C:\\Users\\Dell\\eclipse-workspace\\com.crm.advancedSeleniumA61\\ScreenShot\\DwsPage"+time+".png");
	    try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped", true);

	}


	public void onStart(ITestContext context) {
		Reporter.log("onStart", true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("onStart",true);


	}
}
