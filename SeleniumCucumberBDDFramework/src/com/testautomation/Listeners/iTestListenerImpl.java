package com.testautomation.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class iTestListenerImpl extends ExtentReportListener implements ITestListener {

//	public static ExtentReports extent;
	
	@Override
	public void onTestStart(ITestResult result) {
//		System.out.println("Execution Started on UAT Env ...");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("PASS");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAIL");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("SKIP");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		System.out.println("FAIL");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution Started on UAT Env ...");
		extent = setUp();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution completed on UAT Env ...");
		extent.flush();
		System.out.println("Generated Report ...");
		
	}
	
	

}
