package org.sam.driver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sam.constant.FrameworkConstant;
import org.sam.utils.ReadPropertyFile;

public class Driver {

	public static void initDriver() throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) { 
			System.setProperty("webdriver.chrome.driver", FrameworkConstant.CHROMEDRIVERPATH());

			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(ReadPropertyFile.get("URL"));

		}
		
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void quitDriver() {

		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}

	}

}
