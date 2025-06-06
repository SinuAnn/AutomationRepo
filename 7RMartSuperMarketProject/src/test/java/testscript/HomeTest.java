package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	@Test(description = "Verify wheather user is able to logout sucessfully")
	public void verifywhetheruserisabletologoutsucessfully() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminLink();
		homepage.clickOnLogoutLink();
	}
}
