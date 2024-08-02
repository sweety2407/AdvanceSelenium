package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Dws_HomePage {
	

	public Dws_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath="//input[@value='1']")
	WebElement excellent;
	
	private @FindBy(xpath="//input[@value='2']")
	WebElement good;
	
	private @FindBy(xpath="//input[@value='3']")
	WebElement poor;
	
	private @FindBy(xpath="//input[@value='4']")
	WebElement verybad;
	
	private @FindBy(xpath="//input[@value='Vote']")
	WebElement vote;
	
	public void radio1()
	{
		excellent.click();
	}
	public void radio2()
	{
		good.click();
		
	}
		public void radio3()
		{
			poor.click();
		}
		public void radio4()
		{
			verybad.click();
		}
		public void vote_button()
		{
			vote.click();
		}


}
