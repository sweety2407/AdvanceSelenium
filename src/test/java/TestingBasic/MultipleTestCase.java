package TestingBasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTestCase {
	@Test(priority = '2')// if there is no priority it will execute first @test
	public void dws() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test(priority = 0)
	public void csk() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void rcb() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(2000);
		driver.close();
	}
	

}
