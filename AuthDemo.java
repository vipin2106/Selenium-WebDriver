package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AuthDemo {

WebDriver driver;
	
	
	@BeforeTest
	public void atBefore(){
	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void atTest(){
		driver.get("https://mukeshotwani:password1234@www.engprod-charter.net/");
        
	
	}
	
	@AfterTest
	public void atAfter(){
		
		
	}
}


