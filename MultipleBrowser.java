package TestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleBrowser {

WebDriver driver;
	
	
	@BeforeTest
	public void atBefore(){

//==========================Firefox========================================	
		///driver=new FirefoxDriver();
		
//===================================Chrome =================================
		
	/*File file =new File("D:\\Study\\Selenium\\Driver\\drivers\\chromedriver_win32\\chromedriver.exe");			
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	driver= new ChromeDriver();*/	
//===================================IE =================================	
		
	/*	File file =new File("D:\\Study\\Selenium\\Driver\\drivers\\IEDriverServer_x64_2.53.1\\IEDriverServer.EXE");			
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		driver= new InternetExplorerDriver();*/
		
//===================================HTML UNIT DRIVER =================================		
		driver = new HtmlUnitDriver();
		
		
		driver.manage().window().maximize();
		
	}
	@Test
	public void atTest(){
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void atAfter(){
		
		
	}
}
