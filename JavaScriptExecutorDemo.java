package TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {

WebDriver driver;
	
	
	@BeforeTest
	public void atBefore(){
	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void atTest(){
		driver.get("http://www.guru99.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("history.go(0)");
	/*	String s=(String) js.executeScript("return document.title");
	
        System.out.println(s);*/
		
		//js.executeScript("window.scrollBy(0,150)");
		
		//js.executeScript("arguments[0].click();", );
        
	
	}
	
	@AfterTest
	public void atAfter(){
		
		
	}
}


