package AutomationTestingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationAllTestingConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\work1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//Alert.......................................
		/*
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().accept();
		String cnftext=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(cnftext);
		//driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		*/
		//Date Picker................
		/*
		String reqmonth="October 2020";
		String reqdate="20";
		driver.findElement(By.xpath("//h2[contains(text(),'Date Picker')]")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
		
		
		while(true)
		{
			String datetitle=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if(datetitle.equals(reqmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		driver.findElement(By.xpath("//a[contains(text(),"+reqdate+")]")).click();
		*/
		//dropdown..................
		WebElement drop1=driver.findElement(By.xpath("//select[@id='speed']"));
		Select t1=new Select(drop1);
		t1.selectByVisibleText("Medium");
		
		//driver.findElement(By.xpath("//select[@id='files']")).click();
		WebElement drop2=driver.findElement(By.xpath("//select[@id='files']"));
		Select t2=new Select(drop2);
		t2.selectByVisibleText("DOC file");
		
		WebElement drop3=driver.findElement(By.xpath("//select[@id='number']"));
		Select t3=new Select(drop3);
		t3.selectByVisibleText("4");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
