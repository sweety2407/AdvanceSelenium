package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DwsLoginT {
	
	public  void DwsLogin(WebDriver driver) 
	{
		
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(className = "ico-login")
	WebElement login_link;
	
	private @FindBy(id="Email")
	WebElement email;
	
	private @FindBy(id="Password")
	WebElement password;
	
	private @FindBy(xpath="//input[@value='Log in']")
	WebElement login_button;
	
	public void login_link() {
		login_link.click();
		
	}
	public void username(String user)
	{
		email.sendKeys(user);
	}
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	public void login_button()
	{
		login_button.click();
	}


}
