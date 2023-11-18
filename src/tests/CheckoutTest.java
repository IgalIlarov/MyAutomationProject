package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest{
	
	@Test
	public void tc02_addToCart() {
		int items = mp.getNumOfProducts();
		psp.chooseProductFromProductsPage("Sauce Labs Fleece Jacket");
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc03_addToCart() {
		int items = mp.getNumOfProducts();
		psp.chooseProductFromProductsPage("Sauce Labs Bolt T-Shirt");
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc04_addToCart() {
		int items = mp.getNumOfProducts();
		psp.chooseProductFromProductsPage("Sauce Labs Backpack");
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc05_checkout() {
		mp.clickCart();
		cp.clickCheckout();
		yip.fillInformationFields("Igal", "Ilarov", "12345");
		yip.clickContinue();
		op.clickFinish();
		String actual = cop.getCompleteOrderText();
		String expected = "Thank you for your order!";
		Assert.assertEquals(actual, expected);
	}
}