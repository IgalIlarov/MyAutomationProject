package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "[id*='add-to-cart']")
	WebElement addToCartBtn;
	@FindBy(css = "#back-to-products")
	WebElement backToProductsBtn;
	
	public void clickAddToCart() {
		highlightElement(addToCartBtn, "yellow");
		sleep(300);
		click(addToCartBtn);
	}
	
	public void clickBackToProducts() {
		highlightElement(backToProductsBtn, "yellow");
		sleep(300);
		click(backToProductsBtn);
	}
}