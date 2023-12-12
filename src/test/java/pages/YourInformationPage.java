package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourInformationPage extends BasePage{

	public YourInformationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "#first-name")
	WebElement firstNameField;
	@FindBy(css = "#last-name")
	WebElement lastNameField;
	@FindBy(css = "#postal-code")
	WebElement zipCodeField;
	@FindBy(css = "#continue")
	WebElement continueBtn;
	
	public void fillInformationFields(String firstName, String lastName, String zipCode) {
		fillText(firstNameField, firstName);
		fillText(lastNameField, lastName);
		fillText(zipCodeField, zipCode);
	}
	
	public void clickContinue() {
		click(continueBtn);
	}
}