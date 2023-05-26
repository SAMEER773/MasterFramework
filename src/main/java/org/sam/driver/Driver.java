package org.sam.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sam.constant.FrameworkConstant;
import org.sam.ennum.ConfigProperties;
import org.sam.utils.PropertyUtils;

public class Driver {

	public static void initDriver() throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) { 
			System.setProperty("webdriver.chrome.driver", FrameworkConstant.getChromeDriverPath());

			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));

		}
		
		DriverManager.getDriver().manage().window().maximize();
		//DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void quitDriver() {

		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}

	}

}
