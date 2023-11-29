package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest{
	
	@Test(dataProvider = "getData", description = "add products to cart test")
	public void tc02_addToCart(String productName) {
		int items = menuPage.getNumOfProducts();
		productsPage.chooseProductFromProductsPage(productName);
		Assert.assertEquals(menuPage.getNumOfProducts(), items + 1);
	}
		
	@Test(description = "checkout order test")
	public void tc05_checkout() {
		menuPage.clickCart();
		cartPage.clickCheckout();
		yourInformaionPage.fillInformationFields("Igal", "Ilarov", "12345");
		yourInformaionPage.clickContinue();
		overviewPage.clickFinish();
		String actual = completePage.getCompleteOrderText();
		String expected = "Thank you for your order!";
		Assert.assertEquals(actual, expected);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] myData = {
				{"sauce Labs Bike Light"},
				{"sauce Labs Fleece Jacket"},
				{"test.allTheThings() T-Shirt (Red)"},
		};
		return myData;
	}
}