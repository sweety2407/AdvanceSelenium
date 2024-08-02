package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dws_DigitalDownload {
	public Dws_DigitalDownload (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	WebElement digital_link;
	
	private @FindBy(id="products-orderby")
	WebElement sortby;
	
	private @FindBy(id="products-pagesize")
	WebElement display;
	
	private @FindBy(id="products-viewmode")
	WebElement viewas;
	
	private @FindBy(xpath="(//input[@value='Add to cart'])[1]")
	WebElement cart1;
	
	private @FindBy(xpath="(//input[@value='Add to cart'])[2]")
	WebElement cart2;
	
	private @FindBy(xpath="(//input[@value='Add to cart'])[3]")
	WebElement cart3;
	public void digital_link()
	{
		digital_link.click();
	}
	
	public void sort()
	{
		Select s=new Select(sortby);
		s.selectByIndex(2);
	}
		
	public void display()
		{
			Select s=new Select(display);
			s.selectByIndex(1);
		}
			
	public void viewas()
	 {
	 Select s=new Select(viewas);
	 s.selectByIndex(1);
	 }
				
	public void album() {
	cart1.click();
	  }
				
	public void music1()
	{
		cart2.click();
	}
				
	public void music2()
	{
		cart3.click();
	}



}
