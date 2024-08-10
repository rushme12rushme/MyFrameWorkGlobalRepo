package com.ninza.HRM.POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement usernameTbx;
	
	@FindBy(id="inputPassword")
	private WebElement pwdTbx;
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void login(String username,String password)
	{
		usernameTbx.sendKeys(username);
		pwdTbx.sendKeys(password);
		loginBtn.click();
		
	}

}
