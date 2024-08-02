package BaseClassVtiger;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Baseclass.JavaUtility;

public class BaseClass {public  static WebDriver driver;

@BeforeClass
public void preCondition() throws IOException {

	 String browser = JavaUtility.logindata("browser");
	 String url = JavaUtility.logindata("url");
if (browser.equals("chrome")) {
	driver=new ChromeDriver();
}
else if (browser.equals("edge")) {
	driver=new EdgeDriver();
}
else if (browser.equals("firefox")) {
	driver=new FirefoxDriver();
}
else {
	driver=new ChromeDriver();
}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
}

@BeforeMethod
public void login() throws IOException {
	String username = JavaUtility.logindata("username");
	String password = JavaUtility.logindata("password");
	
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");	
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
	driver.findElement(By.id("submitButton")).click();


//@AfterMethod
//public void logout() {
//	
//	.BaseClass.class
//	.
//	driver.findElement(By.className("ico-logout")).click();
//}
//
//@AfterClass
//public void pastCondition() {
//	driver.quit();

 }
}
