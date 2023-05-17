package org.sam.utils;

import org.sam.driver.DriverManager;

public class GetTitle {
	
	
	public static  String title() {
		
		return DriverManager.getDriver().getTitle();
		
	}

}
