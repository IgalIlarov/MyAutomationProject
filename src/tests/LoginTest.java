package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test
	public void tc01_incorrectLogin() {
		mp.clickMenu();
		mp.clickLogout();
		lp.fillLoginForm("standard_user", "12345");
		String actual = lp.getError();
		String expected = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actual, expected);
	}
}