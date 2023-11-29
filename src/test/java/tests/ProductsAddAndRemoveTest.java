package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductsAddAndRemoveTest extends BaseTest{
	
	private boolean cartClicked = false;
	
	@Test(dataProvider = "getData", description = "add products to cart test")
	public void tc02_addProducts(String productName) {
		int items = menuPage.getNumOfProducts();
		productsPage.chooseProduct(productName);
		productPage.clickAddToCart();
		productPage.clickBackToProducts();
		Assert.assertEquals(menuPage.getNumOfProducts(), items + 1);
	}
	
    @Test(dataProvider = "getData", description = "remove products from cart test")
    public void tc03_removeProducts(String productName) {
        int items = menuPage.getNumOfProducts();
        if (!cartClicked) {
            menuPage.clickCart();
            cartClicked = true;
        }
        cartPage.removeProduct(productName);
        Assert.assertEquals(menuPage.getNumOfProducts(), items - 1);
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