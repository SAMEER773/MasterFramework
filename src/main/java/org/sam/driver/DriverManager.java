package org.sam.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
	
	private DriverManager() {
		
	}

	private static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>(); // all three method used to make thread
	// safe
	// to avoid to call this method if some one call this method
	// its not affect to
// our frame work

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void setDriver(WebDriver driverref) {

		dr.set(driverref);

	}

	public static void unload() {
		dr.remove();
	}

}
