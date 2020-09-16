package com.bankingProject.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
		public String baseURL="http://demo.guru99.com/V1/index.php";
	    public String username ="mngr275951";
        public String password="ymahyby";
	    public static WebDriver driver;
	    public static Logger logger;
	    @BeforeClass
	    public void setup() throws InterruptedException
	    {
	    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get(baseURL);
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 // adding log4j
			logger = Logger.getLogger("bankingProjectVersion1");
			PropertyConfigurator.configure("Log4j.properties");
			
	    }
	    @AfterClass
	    public void tearDown()
	    {
	    	driver.quit();
	    }

	

}
