package TestNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaptureScreenshotDemo {

	WebDriver driver;
	
	
	@BeforeTest
	public void atBefore(){
	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();

		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//=========================================Implicit wait================================			
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void atTest() throws Exception{
		
		
		driver.get("https://www.yahoo.com/");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\olx.jpg"));
		
		

		
	}
	
	@AfterTest
	public void atAfter(){
		
		
	}

}
