package TestNg1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Avenger {
	@Test(groups = "smoke")
	public void bike() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bajajauto.com/bikes/avenger");
		Thread.sleep(2000);
		driver.close();
	}

}
