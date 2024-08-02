package ProjectObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.Dws_GiftCard;

public class GiftCart_Dws {
	
	@Test
	public void main()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	Dws_GiftCard ref=new Dws_GiftCard(driver);
	ref.link();
	ref.sort();
	ref.display();
	ref.view();
	ref.giftCart1();
	ref.giftCart2("Shital","shitalarikar2001@gmail.com", "sweety", "sweetygc10@gmail.com","helloo.. please receive your gift", "5");
	ref.giftCart3();
	ref.giftCart4();

	}
}
