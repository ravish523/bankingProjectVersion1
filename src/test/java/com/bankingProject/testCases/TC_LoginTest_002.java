package com.bankingProject.testCases;

import org.testng.annotations.Test;

import com.bankingProject.pageObjects.LoginPage_2;

public class TC_LoginTest_002 extends BaseClass {
	@Test
	public void loginPage()
	{
		driver.get(baseURL);
		LoginPage_2 lpl= new LoginPage_2(driver);
		lpl.setuserNmae(username);
		lpl.setuserPass(password);
		lpl.setLgnBtn();
		lpl.verifyErrMsg();
	}
	

}
