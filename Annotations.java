package TestNG;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

WebDriver driver;
	
	
	@BeforeTest
	public void atBefore(){
	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void atTest(){
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("")).click();
		
		new Select(driver.findElement(By.id("day"))).selectByIndex(20);
		new Select(driver.findElement(By.id("month"))).selectByValue("3");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1990");
	
	String s=driver.findElement(By.id("")).getText();
	
	System.out.println(s);
	
	}
	
	@AfterTest
	public void atAfter(){
		
		
	}
}
