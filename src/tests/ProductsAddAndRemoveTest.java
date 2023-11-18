package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsAddAndRemoveTest extends BaseTest{
	
	@Test
	public void tc02_addProducts() {
		int items = mp.getNumOfProducts();
		psp.chooseProduct("sauce labs backpack");
		pp.clickAddToCart();
		pp.clickBackToProducts();
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc03_addProducts() {
		int items = mp.getNumOfProducts();
		psp.chooseProduct("sauce Labs Bike Light");
		pp.clickAddToCart();
		pp.clickBackToProducts();
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc04_addProducts() {
		int items = mp.getNumOfProducts();
		psp.chooseProduct("sauce Labs Bolt T-Shirt");
		pp.clickAddToCart();
		pp.clickBackToProducts();
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc05_addProducts() {
		int items = mp.getNumOfProducts();
		psp.chooseProduct("sauce Labs Fleece Jacket");
		pp.clickAddToCart();
		pp.clickBackToProducts();
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc06_addProducts() {
		int items = mp.getNumOfProducts();
		psp.chooseProduct("sauce Labs Onesie");
		pp.clickAddToCart();
		pp.clickBackToProducts();
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc07_addProducts() {
		int items = mp.getNumOfProducts();
		psp.chooseProduct("test.allTheThings() T-Shirt (Red)");
		pp.clickAddToCart();
		pp.clickBackToProducts();
		Assert.assertEquals(mp.getNumOfProducts(), items + 1);
	}
	
	@Test
	public void tc08_removeProducts() {
		int items = mp.getNumOfProducts();
		mp.clickCart();
		cp.removeProduct("sauce labs backpack");
		Assert.assertEquals(mp.getNumOfProducts(), items - 1);
	}
	
	@Test
	public void tc09_removeProducts() {
		int items = mp.getNumOfProducts();
		cp.removeProduct("Sauce Labs Bike Light");
		Assert.assertEquals(mp.getNumOfProducts(), items - 1);
	}
	
	@Test
	public void tc10_removeProducts() {
		int items = mp.getNumOfProducts();
		cp.removeProduct("Sauce Labs Bolt T-Shirt");
		Assert.assertEquals(mp.getNumOfProducts(), items - 1);
	}
	
	@Test
	public void tc11_removeProducts() {
		int items = mp.getNumOfProducts();
		cp.removeProduct("Sauce Labs Fleece Jacket");
		Assert.assertEquals(mp.getNumOfProducts(), items - 1);
	}
	
	@Test
	public void tc12_removeProducts() {
		int items = mp.getNumOfProducts();
		cp.removeProduct("Sauce Labs Onesie");
		Assert.assertEquals(mp.getNumOfProducts(), items - 1);
	}
	
	@Test
	public void tc13_removeProducts() {
		int items = mp.getNumOfProducts();
		cp.removeProduct("Test.allTheThings() T-Shirt (Red)");
		cp.clickContinueShoppingBtn();
		Assert.assertEquals(mp.getNumOfProducts(), items - 1);
	}
}