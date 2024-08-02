package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dws_GiftCard {
	public Dws_GiftCard(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	private @FindBy(xpath="(//a[contains(text(),'Gift Card')])[1]")
	WebElement gift_link;
	
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
	
	
	private @FindBy(xpath="//input[@class='recipient-name']")
	WebElement rname;
	
	private @FindBy(xpath="//input[@class='recipient-email']")
	WebElement remail;
	
	private @FindBy(xpath="//input[@class='sender-name']")
	WebElement name;
    
	private @FindBy(xpath="//input[@class='sender-email']")
	WebElement email;
	
	private @FindBy(xpath="//textarea[@class=\"message\"]")
	WebElement message;
	
	private @FindBy(xpath="//input[@class='qty-input']")
	WebElement quantity;
	
	private @FindBy(xpath="(//input[@value='Add to cart'])[1]")
	WebElement addtocart;
	
	private @FindBy(xpath="(//input[@value='Add to cart'])[3]")
	WebElement cart3;

	private @FindBy(xpath="(//input[@value='Add to cart'])[4]")
	WebElement cart4;
	
	public void link()
	{
		gift_link.click();
	}
	public void sort()
	{
		Select s=new Select(sortby);
		s.selectByIndex(3);
		
	}
	public void display()
	{
		Select s=new Select(display);
	s.selectByIndex(2);
		
	}
	public void view()
	{Select s=new Select(viewas);
	s.selectByIndex(1);
	
		
	}
	public void giftCart1()
	{
		cart1.click();
	}

	public void giftCart2(String recname,String recemail,String sname,String semail,String mess,String qty)
	{
		cart2.click();
		rname.sendKeys(recname);
		remail.sendKeys(recemail);
		name.sendKeys(sname);
		email.sendKeys(semail);
		message.sendKeys(mess);
		quantity.clear();
		quantity.sendKeys(qty);
		
	}
	public void giftCart3()
	{
		cart3.click();
	}
	public void giftCart4()
	{
		cart4.click();
	}

}
