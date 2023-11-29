package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CompletePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.ProductsPage;
import pages.YourInformationPage;
import utils.Utils;
import pages.MenuPage;
import pages.OverviewPage;

public class BaseTest{
	WebDriver driver;
	CartPage cartPage;
	ProductPage productPage;
	ProductsPage productsPage;
	LoginPage loginPage;
	MenuPage menuPage;
	YourInformationPage yourInformaionPage;
	OverviewPage overviewPage;
	CompletePage completePage;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utils.readProperty("url"));
		cartPage = new CartPage(driver);
		productPage = new ProductPage(driver);
		productsPage = new ProductsPage(driver);
		loginPage = new LoginPage(driver);
		menuPage = new MenuPage(driver);
		yourInformaionPage = new YourInformationPage(driver);
		overviewPage = new OverviewPage(driver);
		completePage = new CompletePage(driver);
	}

	@Test(description = "correct login test")
	public void tc01_login() {
		loginPage.fillLoginForm(Utils.readProperty("user"), Utils.readProperty("password"));
		Assert.assertTrue(loginPage.isProductsPage());
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}