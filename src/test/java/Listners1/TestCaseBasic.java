package Listners1;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.DWSbase;
import Baseclass.DwsBaseListneners;
@Listeners(com.crm.Listeners1.BasicListener.class)

public class TestCaseBasic  extends DwsBaseListneners{

	@Test
	public void main1() throws IOException{
		String expected_result="https://demowebshop.tricentis.com/";
		String actual_result=driver.getCurrentUrl();
		assertEquals(expected_result, actual_result);
		}
	
	@Test
	public void main2()throws IOException {
		String expected_result="https://demowebshop.tricentis.com";
		String actual_result=driver.getCurrentUrl();
		assertEquals(expected_result, actual_result);

	}
}
