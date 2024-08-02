package Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DwsScreenshot {
	public static WebDriver driver;
	@BeforeClass
	public void precondition()
	{
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("welcome to dws site");	
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("thank for your visit");
	}
	
	public void postcondition() {
		driver.quit();
	}

}
