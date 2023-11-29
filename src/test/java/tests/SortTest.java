package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SortTest extends BaseTest{
	
	@Test(description = "sort products from low to high price test")
	public void tc02_sortLowToHigh() {
		productsPage.sortLowToHigh();
		assertTrue(productsPage.isLowToHigh());
	}
		
	@Test(description = "sort products from Z to A test")
	public void tc03_sortZtoA() {
		productsPage.sortZtoa();
		assertTrue(productsPage.isZtoA());
	}
	
	@Test(description = "sort products from high to low price test")
	public void tc04_sortHighToLow() {
		productsPage.sortHighToLow();
		assertTrue(productsPage.isHighToLow());
	}
	
	@Test(description = "sort products from A to Z test")
	public void tc05_sortAtoZ() {
		productsPage.sortAtoZ();
		assertTrue(productsPage.isAtoZ());
	}
}