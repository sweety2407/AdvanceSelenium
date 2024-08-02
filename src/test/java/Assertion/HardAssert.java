package Assertion;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void main() {
		String excepted_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url=driver.getCurrentUrl();
		assertEquals(excepted_url,actual_url);
		WebElement search_field=driver.findElement(By.id("small-searchterms"));
		search_field.sendKeys("mobile",Keys.ENTER);
		
		
	}

}
