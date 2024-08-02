package ExtentReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class LoginFunctionWithCurrentCredential {
	@Test
	public void CorrectCredential() throws InterruptedException {
		    // create spark reporter
				ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/loginfunction.html");
				
				//configure the spark reporter
				spark.config().setDocumentTitle("SampleReport");
				spark.config().setReportName("Sweety");
				spark.config().setTheme(Theme.DARK);
				
				//create the extent report
				ExtentReports report=new ExtentReports(); 
				
				//configure the extent report 
				report.setSystemInfo("Os", "windows-10");
				report.setSystemInfo("Browser", "chrome-100");
				
				//attch the spark reporter  to the extent report
				report.attachReporter(spark);
				ExtentTest test=report.createTest("Correctcredentials");
				
		      WebDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement community_poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if (community_poll.isDisplayed()) {
			test.log(Status.INFO, "community_poll is displayed");
			
		}
		else {
			test.log(Status.INFO, "community_poll is not displayed");
		}
		report.flush();
	}

}
