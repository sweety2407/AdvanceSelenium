package ShoppersStack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException, IOException {
//		String email=JavaUtility1.logindata("email");
//		String password=JavaUtility1.logindata("password");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("loginBtn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Create Account")).click();
	Thread.sleep(2000);	
	driver.findElement(By.id("First Name")).sendKeys("firstname");
	Thread.sleep(2000);
	driver.findElement(By.id("Last Name")).sendKeys("LastName");
	Thread.sleep(2000);
	driver.findElement(By.id("Female")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Phone Number")).sendKeys("phoneNumber");
	Thread.sleep(2000);
	driver.findElement(By.id("Email Address")).sendKeys("EmailAddress");
	Thread.sleep(2000);
	driver.findElement(By.id("Password")).sendKeys("password");
	Thread.sleep(2000);
	driver.findElement(By.id("Confirm Password")).sendKeys("confirmpassword");
	Thread.sleep(2000);
	driver.findElement(By.id("Terms and Conditions")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Register")).click();
	
	
	}	
	
}

