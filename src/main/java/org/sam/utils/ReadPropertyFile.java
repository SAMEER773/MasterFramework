package org.sam.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import org.sam.constant.FrameworkConstant;

public class ReadPropertyFile {

	private ReadPropertyFile() {

	}
	static FileInputStream file;
	private static Properties properties = new Properties();
	private static final Map<String ,String>CONFIGMAP=new HashMap<String, String>();
	static {
		try {
			file = new FileInputStream(FrameworkConstant.CONFIGFILEPATH().trim());
			properties.load(file);
			
			/*for(Object key: properties.keySet()) {
				CONFIGMAP.put(String.valueOf(key),String.valueOf(properties.get(key)));
			}*/
			
			for(Map.Entry<Object, Object>entry:properties.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			}
			//properties.entrySet().forEach(entry ->CONFIGMAP.put(entry.getKey()), String.valueOf(entry.getValue()));
			//if we good in lambda function use above line of code
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		

	}
	
	public static String get(String key) throws Exception {
		if(Objects.isNull(key)||Objects.isNull(CONFIGMAP.get(key))) {
			throw new Exception("Properties name " + key + " is not found please check config properties");
			
		}
		
		return CONFIGMAP.get(key);
	}
	//once a load properties file its behave like a hash table its little slow but tread safe
	//converting a property to hashmap need some time

/*	public static String getValue(String key) throws Exception {

		if (Objects.isNull(properties.getProperty(key))|| Objects.isNull(key)) {
			throw new Exception("Properties name " + key + " is not found please check config properties");
		}
		return properties.getProperty(key);*/

	}


