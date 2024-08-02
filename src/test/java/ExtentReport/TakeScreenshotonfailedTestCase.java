package ExtentReport;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.DwsScreenshot;
@Listeners(com.crm.Listeners1.ScreenshotFailed.class)

public class TakeScreenshotonfailedTestCase extends DwsScreenshot{
	
	@Test
	public void loginfunction()
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
}
