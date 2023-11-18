package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage{

	public MenuPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".shopping_cart_link")
	WebElement cartBtn;
	@FindBy(css = "#react-burger-menu-btn")
	WebElement menuBtn;
	@FindBy(css = "#logout_sidebar_link")
	WebElement logoutBtn;
	@FindBy(css = ".shopping_cart_badge")
	WebElement numOfProductsLabel;
	@FindBy(css = "#reset_sidebar_link")
	WebElement resetAppStateBtn;

	public void clickCart() {
		highlightElement(cartBtn, "yellow");
		sleep(300);
		click(cartBtn);
	}

	public void clickMenu() {
		highlightElement(menuBtn, "yellow");
		sleep(300);
		click(menuBtn);
	}

	public void clickLogout() {
		highlightElement(logoutBtn, "yellow");
		sleep(300);
		click(logoutBtn);
		sleep(500);
	}
	
	public void clickResetAppState() {
		highlightElement(resetAppStateBtn, "yellow");
		sleep(300);
		click(resetAppStateBtn);
	}

	//Validation
	public int getNumOfProducts() {
		int iNums = 0;
		try {
			String nums = getText(numOfProductsLabel);
			iNums = Integer.parseInt(nums);
		} catch (Exception e) {}
		return iNums;
	}
}