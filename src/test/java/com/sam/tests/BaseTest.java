package com.sam.tests;

import org.sam.driver.Driver;
import org.sam.report.ExtendReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	protected BaseTest() {

	}

	@BeforeMethod
	protected void setUp() throws Exception {
		Driver.initDriver();

	}

	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();

	}

}
