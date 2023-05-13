package org.sam.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	
	private ReadPropertyFile() {
		
	}
	
	static FileInputStream file;
	
	public static String getValue(String key) throws Exception {
		
		
		try {
		 file=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/Config/config.properties");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Properties properties = new Properties();
		try {
			properties.load(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String value=properties.getProperty(key);
		if(value==null) {
			throw new Exception("Properties name "+key+" is not found please check config properties");
		} 
		return value;
		
	}

}
