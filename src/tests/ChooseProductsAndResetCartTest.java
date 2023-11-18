package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChooseProductsAndResetCartTest extends BaseTest{
	
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
	public void tc05_addToCart() {
		int items = mp.getNumOfProducts();
		psp.chooseProductFromProductsPage("Sauce Labs Bike Light");
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc06_addToCart() {
		int items = mp.getNumOfProducts();
		psp.chooseProductFromProductsPage("Sauce Labs Onesie");
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc07_addToCart() {
		int items = mp.getNumOfProducts();
		psp.chooseProductFromProductsPage("Test.allTheThings() T-Shirt (Red)");
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc08_clickResetAppState() {
		int items = mp.getNumOfProducts();
		mp.clickMenu();
		mp.clickResetAppState();
		Assert.assertEquals(mp.getNumOfProducts(), items - items);
	}
}