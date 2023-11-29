package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage{

	public OverviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "#finish")
	WebElement finishBtn;
	
	public void clickFinish() {
		scrollPage();
		click(finishBtn, "yellow");
	}
}