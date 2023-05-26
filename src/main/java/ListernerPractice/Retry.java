package ListernerPractice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	//when ever a test is failed this method retry will be called , if this method return true , the failed method willbe return
int counter=0;
int limit=2;
	public boolean retry(ITestResult result) {
		
		if(counter<limit) {
			counter++;
			return true;
		}
		
		return false;
	}

}
