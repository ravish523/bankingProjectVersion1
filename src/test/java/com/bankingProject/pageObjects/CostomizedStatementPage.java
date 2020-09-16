package com.bankingProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostomizedStatementPage {
	
	@FindBy(xpath="//a[contains(text(),'Customised Statement')]")
	private WebElement cotomlink;
	@FindBy(name="accountno")
	private WebElement account;
	@FindBy(xpath="//input[@name='fdate']")
	private WebElement fdate;
	@FindBy(xpath="//input[@name='tdate']")
	private WebElement tdate;
	@FindBy(name="loweramt")
	private WebElement loweramt;
	@FindBy(name="tranno")
	private WebElement notrans;
	@FindBy(name="AccSubmit")
	private WebElement accsubmit;
	
	public CostomizedStatementPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setCustomizedTextBox()
	{
		cotomlink.click();	
	}
	public void setAccountTextBox(String acc)
	{
		account.sendKeys(acc);
	}
	public void setfdateTextBox(String fd)
	{
		fdate.sendKeys(fd);
	}
	
	
	

}
