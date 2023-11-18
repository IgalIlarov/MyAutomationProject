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
	CartPage cp;
	ProductPage pp;
	ProductsPage psp;
	LoginPage lp;
	MenuPage mp;
	YourInformationPage yip;
	OverviewPage op;
	CompletePage cop;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utils.readProperty("url"));
		cp = new CartPage(driver);
		pp = new ProductPage(driver);
		psp = new ProductsPage(driver);
		lp = new LoginPage(driver);
		mp = new MenuPage(driver);
		yip = new YourInformationPage(driver);
		op = new OverviewPage(driver);
		cop = new CompletePage(driver);
	}

	@Test
	public void tc01_login() {
		lp.fillLoginForm(Utils.readProperty("user"), Utils.readProperty("password"));
		Assert.assertTrue(lp.isProductsPage());
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}