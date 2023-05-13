package org.sam.constatnt;

// if we dont want to allow people to extend this  class make class as final
//if we want to restrict to people for creating object create private constructor
public final class FrameworkConstatnt {

	private FrameworkConstatnt() {

	}

	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir") + "/Executables/chromedriver.exe";

	public static String CHROMEDRIVERPATH() {
		return CHROMEDRIVERPATH;
	}

}
