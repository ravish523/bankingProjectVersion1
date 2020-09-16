package com.bankingProject.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bankingProject.pageObjects.LoginPage;
import com.bankingProject.pageObjects.LoginPage_2;

public class TC_LoginTest_001 extends BaseClass{

	
		@Test
		public void loginTest()
		{
			
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(username);
			logger.info("entering the user name in the page..");
			lp.setPass(password);
			logger.info("entering the password in the page....");
			lp.setLogin();
			logger.info("clicking to the submit button.....");
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}		
				
		}

}
