package com.bankingProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	
	}
	@FindBy(name="uid")
	WebElement txtuser;
	@FindBy(name="password")
	WebElement txtpassword;
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
	txtuser.sendKeys(uname);	
	}
	public void setPass(String pwd)
	{
	txtpassword.sendKeys(pwd);	
	}
	public void setLogin()
	{
	btnLogin.click();	
	}

	}

	


