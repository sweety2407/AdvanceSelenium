package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Baseclass.DWSbase;

public class GiftCart extends DWSbase{
	
//	public Static void readExcel()
//	Static String rName;
//	Static String rEmail;
//	Static String yName;
//	Static String yEmail;
//	Static String message;
//	Static String count;
//	
//	 fis=new FileInputStream();
//	Workbook wb=WorkbookFactory.create(fis);
//	Sheet sheet=wb.getSheet("Sheet1");
//	rName=sheet.getRow(0).getCell(0).toString();
//	rEmail=sheet.getRow(1).getCell(0).toString();
//	yName=sheet.getRow(2).getCell(0).toString();
//	YEmail=sheet.getRow(3).getCell(0).toString();
//	message=sheet.getRow(4).getCell(0).toString();
//	count=sheet.getRow(5).getCell(0).toString();
	
	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome");
		logIn();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
//		readExcel();
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Vedant");  // Receiver name
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("ved_0108@gmail.com");//Receiver mail
		WebElement your_name = driver.findElement(By.id("giftcard_2_SenderName"));
		your_name.clear();
		your_name.sendKeys("Sweety");//sender name
		WebElement your_email = driver.findElement(By.id("giftcard_2_SenderEmail"));
		your_email.clear();
		your_email.sendKeys("sweety1111@gmail.com");//sender mail
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("hiii");
		WebElement quntity = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
		
		quntity.clear();
		quntity.sendKeys("2");
        driver.findElement(By.id("add-to-cart-button-2")).click();
		
		driver.findElement(By.className("ico-cart")).click();
		
		WebElement gift_card = driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card'] "));
//		WebElement gift_card = driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card'])[2]"));
		
		if(gift_card.isDisplayed())
		{
			System.out.println("gift card is added successfully");
		}
		else
		{
			System.out.println("gift card is not added in shopping cart");
		}
		
		Thread.sleep(2000);
		logOut();
//    closeAllWindow();


	}
}
