package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class extentreport {
	
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter();
		
		
	}
	
	
	
	
	@Test
	public void initialdemo()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKIT\\Downloads\\All Driver\\New folder\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://qa.avendorz.com/home");
		
	}
	
	
	
	

}
