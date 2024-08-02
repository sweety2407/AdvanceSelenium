package ProjectObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.Dws_Register;

public class Register_Dws {
	
    @Test
	public void main() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		Dws_Register ref=new Dws_Register(driver);
		ref.register_button();
		ref.radio1();
		ref.radio2();
		ref.firstName("Sweety");
		ref.lastName("Chillarge");
		ref.email("sweetygc@gmail.com");
		ref.password("arya@321");
		ref.cPassword("arya@321");
		ref.register();
		driver.close();

	}
}
