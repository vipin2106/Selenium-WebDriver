package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrameDemo {

WebDriver driver;
	
	
	@BeforeTest
	public void atBefore(){
	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void atTest(){
		
		driver.get("https://www.facebook.com/");
        driver.switchTo().frame("iframe2");
        
        
	
	}
	
	@AfterTest
	public void atAfter(){
		
		
	}
}

