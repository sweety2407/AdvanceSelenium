package ExtentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	@Test
 public void Basicreport() {
		// create spark reporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/sampleReport.html");
		
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
		ExtentTest test=report.createTest("BasicReport");
		test.log(Status.INFO,"report is successfully created ");
		report.flush();
 }
}
