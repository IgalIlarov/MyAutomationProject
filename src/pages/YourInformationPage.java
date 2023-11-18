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
		highlightElement(firstNameField, "yellow");
		sleep(300);
		fillText(firstNameField, firstName);
		highlightElement(lastNameField, "yellow");
		sleep(300);
		fillText(lastNameField, lastName);
		highlightElement(zipCodeField, "yellow");
		sleep(300);
		fillText(zipCodeField, zipCode);
	}
	
	public void clickContinue() {
		highlightElement(continueBtn, "yellow");
		sleep(300);
		click(continueBtn);
	}
}