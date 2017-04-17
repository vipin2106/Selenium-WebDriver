package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClassDemo {

WebDriver driver;
	
	
	@BeforeTest
	public void atBefore(){
	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void atTest(){
		
	Actions act = new Actions(driver);
	driver.get("https://www.flipkart.com/");
	act.moveToElement(driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a")));
		act.build().perform();
	
	}
	
	@AfterTest
	public void atAfter(){
		
		
	}
}


















//a[contains(@href, '/men/')]

