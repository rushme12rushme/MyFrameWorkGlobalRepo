package com.ninza.HRM.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	
	public String readDataFromConfigFile(String propname) throws IOException
	{
		FileInputStream fis=new FileInputStream("./ConfigData/ConfigData.properties");
		
		Properties p=new Properties();
		p.load(fis);
		String propvalue=p.getProperty(propname);
		
		return propvalue;
	}

}
