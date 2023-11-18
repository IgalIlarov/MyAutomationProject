package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends BasePage{

	public CompletePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = ".complete-header")
	WebElement completeOrderLabel;
	
	//Validation
	public String getCompleteOrderText() {
		return getText(completeOrderLabel);
	}
}