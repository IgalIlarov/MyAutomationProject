package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import net.bytebuddy.asm.Advice.Return;

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
		sleep(300);
		highlightElement(userNameField, "yellow");
		sleep(300);
		fillText(userNameField, username);
		highlightElement(passwordField, "yellow");
		sleep(300);
		fillText(passwordField, password);
		highlightElement(sighinBtn, "yellow");
		sleep(300);
		click(sighinBtn);
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