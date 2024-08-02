package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertTrue {
	@Test
	public void main() throws InterruptedException {
		String excepted_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url=driver.getCurrentUrl();
		assertEquals(excepted_url,actual_url);
		WebElement search_field=driver.findElement(By.id("small-searchterms"));
		search_field.sendKeys("mobile",Keys.ENTER);
		WebElement advance_search = driver.findElement(By.id("As"));
		advance_search.click();
		Thread.sleep(2000);
		assertTrue(advance_search.isSelected(),"element is selected");
		Thread.sleep(2000);
//		assertFalse(advance_search.isSelected());
		WebElement auto_search = driver.findElement(By.id("Isc"));
		auto_search.click();
		Thread.sleep(2000);
		driver.close();
		
	}


}
