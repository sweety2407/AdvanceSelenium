package Baseclass;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

public class DWSbase {
	
	public static WebDriver driver;
	public static void preCondition(String browser)
	{
//		String browser =javaUtility.loginData("browser");
//        String url=javaUtility.loginData("url");
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equals("edge")) 
		{
			driver=new EdgeDriver();
		}
		else if (browser.equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	public static void logIn() throws InterruptedException 
	{
//		String username=JavaUtility.logindata("username");    
//		String password=javaUtility.logindata("password");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("sweety1111@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("sweety1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	public static void logOut()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	
	public static void postCondition()
	{
		driver.findElement(By.className("log out")).click();
	}
	
	public static void closeWindow()
	{
		driver.quit();
	}

}
