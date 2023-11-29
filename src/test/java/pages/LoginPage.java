package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "#user-name")
	WebElement userNameField;
	@FindBy(css = "#password")
	WebElement passwordField;
	@FindBy(css = "#login-button")
	WebElement sighinBtn;
	@FindBy(css = ".title")
	WebElement titleLabel;
	@FindBy(css = "[data-test='error']")
	WebElement errorLabel;
	
	public void fillLoginForm(String username, String password) {
		waiting(300);
		fillText(userNameField, username, "yellow");
		fillText(passwordField, password, "yellow");
		click(sighinBtn, "yellow");
	}
	
	//Validation
	public boolean isProductsPage() {
		if (getText(titleLabel).equalsIgnoreCase("products")) {
			return true;
		}
		return false;
	}
	
	public String getError() {
		return getText(errorLabel);
	}
}