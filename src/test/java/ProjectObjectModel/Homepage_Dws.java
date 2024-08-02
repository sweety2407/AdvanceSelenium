package ProjectObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.Dws_HomePage;

public class Homepage_Dws {
	
    @Test
	public void main()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	Dws_HomePage ref=new Dws_HomePage(driver);
	ref.radio1();
	ref.radio2();
	ref.radio3();
	ref.radio4();
	ref.vote_button();
	driver.close();
		
	}

}
