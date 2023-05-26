package ListernerPractice;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener , ISuiteListener {

	public void onStart(ISuite suite) {
		System.out.println("before suit in listener");
	}

	public void onFinish(ISuite suite) {
		System.out.println("after suit in listener");
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("before method in listener");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("after method in listener : pass");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("after method listener : i am attaching screenshot hear");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("after method listener : test ignored or skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	

}
