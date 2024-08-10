package com.ninza.HRM.baseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ninza.HRM.FileUtility.ExcelUtility;
import com.ninza.HRM.FileUtility.PropertyFileUtility;

public class BaseClass {

	public WebDriver driver;
	@BeforeClass
	public void openBrowser() throws IOException
	{
		driver=new ChromeDriver();
		PropertyFileUtility pu=new PropertyFileUtility();
		String url=pu.readDataFromConfigFile("url");
		driver.get(url);
	}



	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
