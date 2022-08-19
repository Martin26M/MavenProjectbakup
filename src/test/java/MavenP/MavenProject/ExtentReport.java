package MavenP.MavenProject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReport {
	

	
	
	
	@BeforeTest
	
	
	public void config()
	{
		
		String file = System.getProperty(("user.dir")+"\\reports\\index.html");
		
		ExtentReport report = new ExtentReport();
		
		

		
		
	}
	
	
	@BeforeMethod
	
	
	public void config1()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		
		
	}
	
	@Test
	public void Testing()
	{
		
		
		
		
		
		
	}
	
	
	

}
