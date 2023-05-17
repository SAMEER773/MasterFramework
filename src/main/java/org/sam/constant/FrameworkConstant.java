package org.sam.constant;

// if we don't want to allow people to extend this  class make class as final
//if we want to restrict to people for creating object create private constructor
public final class FrameworkConstant {

	private FrameworkConstant() {

	}
private static final String RESOURCESPATH= System.getProperty("user.dir");
	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/Executables/chromedriver.exe";
	private static final String CONFIGFILEPATH=RESOURCESPATH+ "/src/main/resources/Config/config.properties";

	public static String CHROMEDRIVERPATH() {
		return CHROMEDRIVERPATH;
	}
	public static String CONFIGFILEPATH() {
		return CONFIGFILEPATH;
	}

}

