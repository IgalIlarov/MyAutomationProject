package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ChooseProductsAndResetCartTest extends BaseTest{
	
	@Test(dataProvider = "getData", description = "add to cart test")
	public void tc02_addToCart(String productName) {
		int items = menuPage.getNumOfProducts();
		productsPage.chooseProductFromProductsPage(productName);
		Assert.assertEquals(menuPage.getNumOfProducts(), items + 1);
	}
		
	@Test(description = "reset cart state test")
	public void tc08_clickResetAppState() {
		int items = menuPage.getNumOfProducts();
		menuPage.clickMenu();
		menuPage.clickResetAppState();
		Assert.assertEquals(menuPage.getNumOfProducts(), items - items);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] myData = {
				{"sauce labs backpack"},
				{"sauce Labs Bike Light"},
				{"sauce Labs Bolt T-Shirt"},
				{"sauce Labs Fleece Jacket"},
				{"sauce Labs Onesie"},
				{"test.allTheThings() T-Shirt (Red)"},
		};
		return myData;
	}
}