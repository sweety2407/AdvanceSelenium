package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dws_Register {
	public Dws_Register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath="//a[@class='ico-register']")
	WebElement register_button;
	
	
	private @FindBy(xpath="//input[@value='M']")
	WebElement male;
	
	private @FindBy(xpath="//input[@value='F']")
	WebElement female;
	
	private @FindBy(id="FirstName")
	WebElement fname;
	
	private @FindBy(id="LastName")
	WebElement lname;
	
	private @FindBy(id="Email")
	WebElement email;
	
	private @FindBy(id="Password")
	WebElement password;
	private @FindBy(id="ConfirmPassword")
	WebElement cpassword;
	
	private @FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement register;
	
	public void register_button()
	{
		register_button.click();
	}
	
	public void radio1()
	{
		male.click();
	}
	public void radio2()
	{
		female.click();
	}
	public void firstName(String namef)
	{
		fname.sendKeys(namef);
	}
	public void lastName(String namel)
	{
		lname.sendKeys(namel);
	}
	public void email(String mail)
	{
		email.sendKeys(mail);
	}
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	public void cPassword(String cpass)
	{
		cpassword.sendKeys(cpass);
	}
	public void register()
	{
		register.click();
	}


}
