package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {
	public static void main(String[] args) throws InterruptedException, IOException  {
//		Properties prop=new Properties();
//		FileInputStream fis=new FileInputStream("C:\\Users\\SWEETY\\eclipse-workspace\\oops\\OOPS\\com.crm.AdvanceSeleniumA6\\ConfigureFile\\LoginFunction.properties");
//		prop.load(fis);
//		String email=prop.getProperty("email");
//		System.out.println(email);
//		String password=prop.getProperty("password");
		
		String email=JavaUtility.logindata("email");
		String password=JavaUtility.logindata("password");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
  }
 
}
