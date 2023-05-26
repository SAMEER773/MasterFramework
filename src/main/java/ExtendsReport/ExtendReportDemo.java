package ExtendsReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportDemo {
	
	@Test
	public void test1() throws IOException {
		ExtentReports extentReports = new ExtentReports();
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("index.html");
		extentReports.attachReporter(extentSparkReporter);
		
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentSparkReporter.config().setDocumentTitle("Automation Report");
		extentSparkReporter.config().setReportName("Testing");
		//set up code
		
		ExtentTest createTest = extentReports.createTest("First Test");
		createTest.pass("Checking the logs");
		
		ExtentTest createTest2 = extentReports.createTest("Second test");
		createTest2.fail("Checking the log in second test");
		
		//tear down code
		extentReports.flush();
		
		Desktop.getDesktop().browse(new File("index.html").toURI());  // to open report automatically
		
		
		
		
		
	}

}
