package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {

	
	WebDriver driver;	
	
	@Test(priority=3, enabled=false)
	   public void atTest1() {
	      System.out.println("atTest1");
	   }

	   // test case 2
	   @Test(priority=2)
	   public void atTest2() {
	      System.out.println("atTest2");
	   }
	   
	   @Test(priority=1)
	   public void atTest3() {
	      System.out.println("atTest3");
	   }

	   @BeforeMethod
	   public void beforeMethod() {
	      System.out.println("in beforeMethod");
	   }

	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in afterMethod");
	   }

	  /* @BeforeClass
	   public void beforeClass() {
	      System.out.println("in beforeClass");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in afterClass");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("in afterTest");
	   }

	   @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("in beforeSuite");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("in afterSuite");
	   }
*/
	}
