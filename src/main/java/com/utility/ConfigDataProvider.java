package com.utility;

import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public  ConfigDataProvider() throws Exception {
		
		String filepath="C:\\Users\\HP\\Downloads\\Batch_Framework\\Config1\\config1.properties";
		FileInputStream fis =new FileInputStream(filepath);
		 pro= new Properties();
		pro.load(fis);
		
	}
 public String getBaseUrl() {
	 return pro.getProperty("BaseUrl");
 }
}
