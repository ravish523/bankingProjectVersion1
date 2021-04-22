package com.bankingProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage_2 {
	//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	@FindBy(name="uid")
	private WebElement userTextBox;
	@FindBy(name="password")
	private WebElement passTextBox;
	@FindBy(name="btnLogin")
	private WebElement btnTextBox;
	@FindBy(xpath="//span[contains(text()'not valid']")
	private WebElement errmsg;
	
	public LoginPage_2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setuserNmae(String un)
	{
		userTextBox.sendKeys(un);
	}
	public void setuserPass(String pass)
	{
		passTextBox.sendKeys(pass);
	}
	public void setLgnBtn()
	{
		btnTextBox.click();
	}
	public void verifyErrMsg()
	{
		Assert.assertTrue(errmsg.isDisplayed());
	}
	
	
	
	
	
	
	
	
	
	
}
