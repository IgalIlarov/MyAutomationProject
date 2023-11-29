package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test(description = "incorrect login test")
	public void tc01_incorrectLogin() {
		menuPage.clickMenu();
		menuPage.clickLogout();
		loginPage.fillLoginForm("standard_user", "12345");
		String actual = loginPage.getError();
		String expected = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actual, expected);
	}
}