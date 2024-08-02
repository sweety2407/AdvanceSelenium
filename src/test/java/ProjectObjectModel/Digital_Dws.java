package ProjectObjectModel;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pom.Dws_DigitalDownload;

public class Digital_Dws {
	
    @Test
	public void main()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	Dws_DigitalDownload ref=new Dws_DigitalDownload (driver);
	ref.digital_link();
	ref.sort();
	ref.display();
	ref.viewas();
	ref.album();
	ref.music1();
	ref.music2();
	driver.close();

	}
}
