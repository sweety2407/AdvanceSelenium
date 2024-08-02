package Listners1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Baseclass.DwsBaseListneners;

public class TestCaseBasic2  extends DwsBaseListneners{
	@Test
	public void main1() {
		String expected_url="https://demowebshop.tricentis.com/";
		String actual_url=driver.getCurrentUrl();
		assertEquals(expected_url, actual_url);
	}

	public void main2() {
		String expected_url="https://demowebshop.tricentis.com/";
		String actual_url=driver.getCurrentUrl();
		assertEquals(expected_url, actual_url);
	}
//	public void main3() {
//		String expected_url="";
//		String actual_url=driver.getCurrentUrl();
//		assertEquals(expected_url, actual_url);
//	}
}
