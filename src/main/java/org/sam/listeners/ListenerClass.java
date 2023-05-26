package org.sam.listeners;

import org.sam.report.ExtendReport;
import org.sam.report.ExtentLogger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener, ISuiteListener {

	public void onStart(ISuite suite) {
		try {
			ExtendReport.initReports();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void onFinish(ISuite suite) {
		try {
			ExtendReport.flushReports();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

	public void onTestStart(ITestResult result) {
		ExtendReport.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		ExtentLogger.pass(result.getMethod().getMethodName()+" is passed");
	}

	public void onTestFailure(ITestResult result) {
		ExtentLogger.fail(result.getMethod().getMethodName()+" is failed");
		//attached screenshot
	}

	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getMethod().getMethodName()+" is Skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
