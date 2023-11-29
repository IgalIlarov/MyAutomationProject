package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".product_sort_container")
	WebElement sortBtn;
	@FindBy(css = "[value='az']")
	WebElement azBtn;
	@FindBy(css = "[value='za']")
	WebElement zaBtn;
	@FindBy(css = "[value='lohi']")
	WebElement loHiBtn;
	@FindBy(css = "[value='hilo']")
	WebElement hoLoBtn;
	@FindBy(css = ".active_option")
	WebElement titleLabel;

	public void sortAtoZ() {
		click(sortBtn, "yellow");
		waiting(500);
		click(azBtn, "yellow");
		waiting(500);
	}

	public void sortZtoa() {
		click(sortBtn, "yellow");
		waiting(500);;
		click(zaBtn, "yellow");
		waiting(500);
	}

	public void sortLowToHigh() {
		click(sortBtn, "yellow");
		waiting(500);
		click(loHiBtn, "yellow");
		waiting(500);
	}

	public void sortHighToLow() {
		click(sortBtn, "yellow");
		waiting(500);
		click(hoLoBtn, "yellow");
		waiting(500);
	}

	// Method that check the name of the product and click on him if the name is equal
	public void chooseProduct(String productName) {
		List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item_name"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(productName)) {
				click(el, "yellow");
				break;
			}
		}
	}
	
	//Method that run on a list and click "add to cart" on a chosen products
	public void chooseProductFromProductsPage(String productName) {
		List<WebElement> areaList = driver.findElements(By.cssSelector(".inventory_item_description"));
		for (WebElement areaElement : areaList) {
			WebElement titleElement = areaElement.findElement(By.cssSelector(".inventory_item_name"));
			if (titleElement.getText().equalsIgnoreCase(productName)) {
				WebElement el = areaElement.findElement(By.cssSelector("[id^='add-to-cart']"));
				click(el, "yellow");
				break;
			}
		}
	}
	
	//Validation
	public boolean isAtoZ() {
		if (getText(titleLabel).equalsIgnoreCase("Name (A to Z)")) {
			return true;
		}
		return false;
	}
	
	public boolean isZtoA() {
		if (getText(titleLabel).equalsIgnoreCase("Name (Z to A)")) {
			return true;
		}
		return false;
	}
	
	public boolean isLowToHigh() {
		if (getText(titleLabel).equalsIgnoreCase("Price (low to high)")) {
			return true;
		}
		return false;
	}
	
	public boolean isHighToLow() {
		if (getText(titleLabel).equalsIgnoreCase("Price (high to low)")) {
			return true;
		}
		return false;
	}
}