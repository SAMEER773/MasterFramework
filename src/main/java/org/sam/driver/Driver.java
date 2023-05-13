package org.sam.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sam.constatnt.FrameworkConstatnt;
import org.sam.utils.ReadPropertyFile;

public class Driver {

	public static void initDriver() throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) { // to avoid to call this method if some one call this method
															// its not affect to
			// our frame work
			System.setProperty("webdriver.chrome.driver", FrameworkConstatnt.CHROMEDRIVERPATH());

			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(ReadPropertyFile.getValue("URL"));

		}

	}

	public static void quitDriver() {

		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}

	}

}
