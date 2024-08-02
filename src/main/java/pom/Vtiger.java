package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtiger {
	public Vtiger(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private @FindBy(linkText = "Organizations")
	WebElement organisation;
	private @FindBy(xpath="//img[@alt='Create Organization...']")
	WebElement createOrg;
	private @FindBy(name = "accountname")
	WebElement organisationName;
	public void clickOrganisation() {
		organisation.click();
	}
	public void clickCreateOrg() {
		createOrg.click();
	}
	public void orgName(String name) {
		organisationName.sendKeys(name);
	}
}
