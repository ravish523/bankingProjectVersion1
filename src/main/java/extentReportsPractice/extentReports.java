package extentReportsPractice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReports {
	
		public WebDriver driver;
		public ExtentHtmlReporter htmlReporter;
		public ExtentReports extent;
		public ExtentTest test;
		@BeforeTest
		public void setExtent()
		{
			htmlReporter =new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
			htmlReporter.config().setDocumentTitle("Automation Report");
			htmlReporter.config().setReportName("functional test Report");
			htmlReporter.config().setTheme(Theme.DARK);
			extent=new ExtentReports();
			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("Hostname", "Localhost");
			extent.setSystemInfo("OS", "Window");
			extent.setSystemInfo("Tester name", "Ravish kumar");
			extent.setSystemInfo("Browser", "Chrome");
			
		}
		@AfterTest
		public void endReport()
		{
			extent.flush();
		}
		@BeforeMethod
		public void setup() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\work1\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.nopcommerce.com/en/demo");
			 Thread.sleep(1000);
		}
		@Test
		public void noCommerceTitleTest()
		{
			test=extent.createTest("noCommerceTitleTest");
			String title=driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Store Demo - nopCommerce");	
		}
		@Test
		public void noCommerceLogoTest()
		{
			test=extent.createTest("noCommerceLogoTest");
			Boolean status=driver.findElement(By.xpath("//a[@class='mobile-logo']")).isDisplayed();
			Assert.assertTrue(status);
		}
		@Test
		public void noCommerceLoginTest()
		{
			test=extent.createTest("noCommerceLoginTest");
			Assert.assertTrue(true);
		}
		@AfterMethod
		public void tearDown(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.FAILURE)
			{
				test.log(Status.FAIL, "Test case is fail"+result.getName());
				test.log(Status.FAIL, "Test case is failed"+result.getThrowable());
				String screenshotPath=extentReports.getScreenshot(driver,result.getName());
				test.addScreencastFromPath(screenshotPath);
			}
			else if(result.getStatus()==ITestResult.SKIP)
			{
				test.log(Status.SKIP, "test case is skipped"+result.getName());
			}
			else if(result.getStatus()==ITestResult.SUCCESS)
			{
				test.log(Status.PASS, "test case is passed"+result.getName());
			}
			driver.quit();
		}
		public static String getScreenshot(WebDriver driver,String screenshotName) throws IOException
		{
			String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String destination=System.getProperty("user.dir")+"/Screenshot/"+dateName+".png";
			File finalDestination=new File(destination);
			FileUtils.copyFile(source, finalDestination);
			return destination;	
		}
}
