package org.sam.report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import org.sam.constant.FrameworkConstant;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtendReport {

	private ExtendReport() {

	}

	private static ExtentReports extentReports;
	//public static ExtentTest createTest;

	public static void initReports() throws Exception {

		if (Objects.isNull(extentReports)) {
			extentReports = new ExtentReports();
			ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(FrameworkConstant.extentReportPath());
			extentReports.attachReporter(extentSparkReporter);

			extentSparkReporter.config().setTheme(Theme.DARK);
			extentSparkReporter.config().setDocumentTitle("Automation Report");
			extentSparkReporter.config().setReportName("Testing");
		}
	}

	public static void flushReports() throws Exception {

		if (Objects.nonNull(extentReports)) {
			extentReports.flush();

			try {
				Desktop.getDesktop().browse(new File(FrameworkConstant.extentReportPath()).toURI());
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	public static void createTest(String testcaseName) {
		//ExtentTest createTest = extentReports.createTest(testcaseName);
		ExtentManager.setExtentTest(extentReports.createTest(testcaseName));
	}

}
