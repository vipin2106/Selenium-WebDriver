package TestNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class WebdriverWaits {


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
			
			
			driver.get("https://www.olx.in/");
			driver.findElement(By.id("postNewAdLink")).click();
			WebDriverWait wait =new WebDriverWait(driver,120);
			wait.pollingEvery(2, TimeUnit.SECONDS);
			wait.ignoring(ElementNotFoundException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-title")));
			driver.findElement(By.id("add-title")).sendKeys("jdfbjdbvhwbvhweb");
			
			
			
			driver.findElement(By.id("choose-category-ilu")).click();
			WebDriverWait wait1 =new WebDriverWait(driver,120);
			wait1.pollingEvery(2, TimeUnit.SECONDS);
			wait1.ignoring(ElementNotFoundException.class);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("cat-1411")));
			driver.findElement(By.id("cat-1411")).click();
			
		}
		
		@AfterTest
		public void atAfter(){
			
			
		}
	}
