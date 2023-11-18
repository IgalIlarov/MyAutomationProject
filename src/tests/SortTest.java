package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SortTest extends BaseTest{
	
	@Test
	public void tc02_sortLowToHigh() {
		psp.sortLowToHigh();
		assertTrue(psp.isLowToHigh());
	}
		
	@Test
	public void tc03_sortZtoA() {
		psp.sortZtoa();
		assertTrue(psp.isZtoA());
	}
	
	@Test
	public void tc04_sortHighToLow() {
		psp.sortHighToLow();
		assertTrue(psp.isHighToLow());
	}
	
	@Test
	public void tc05_sortAtoZ() {
		psp.sortAtoZ();
		assertTrue(psp.isAtoZ());
	}
}