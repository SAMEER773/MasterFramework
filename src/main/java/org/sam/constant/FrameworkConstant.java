package org.sam.constant;

import org.sam.ennum.ConfigProperties;
import org.sam.utils.PropertyUtils;

// if we don't want to allow people to extend this  class make class as final
//if we want to restrict to people for creating object create private constructor
public final class FrameworkConstant {

	private FrameworkConstant() {

	}

	private static final String RESOURCESPATH = System.getProperty("user.dir");
	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/src/test/resources/Executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "/src/main/resources/Config/config.properties";
	private static final String EXCELFILEPATH = RESOURCESPATH + "/src/test/resources/ExcelSheet/testData.xlsx";
	private static final String JSONFILEPATH = RESOURCESPATH + "/src/test/resources/Json/config.json";
	private static final String EXTENTREPORTPATH = RESOURCESPATH + "/extent-test-output";

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

	public static String excelFilePath() {
		return EXCELFILEPATH;
	}

	public static String jsonFilePath() {
		return JSONFILEPATH;
	}

	public static String extentReportPath() throws Exception {
		if (PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes")) {
			return EXTENTREPORTPATH + "/" + System.currentTimeMillis() + "/index.html";
		}
		else {
			return EXTENTREPORTPATH+"/index.html";
			
		}
		
	}

}
