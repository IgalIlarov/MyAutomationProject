package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "[id*='remove']")
	WebElement removeBtn;
	@FindBy(css = "#continue-shopping")
	WebElement continueShoppingBtn;
	@FindBy(css = "#checkout")
	WebElement checkoutBtn;
	
	//Method that check if the product name is equal and click the remove btn 
	public void removeProduct(String productName) {
		List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item_name"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(productName)) {
				click(removeBtn);
				break;
			}
		}
	}
	
	public void clickContinueShoppingBtn() {
		click(continueShoppingBtn);
	}
	
	public void clickCheckout() {
		click(checkoutBtn);
	}
}