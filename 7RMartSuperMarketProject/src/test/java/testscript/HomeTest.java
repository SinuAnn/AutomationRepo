package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	@Test(description = "Verify wheather user is able to logout sucessfully")
	public void verifywhetheruserisabletologoutsucessfully() throws IOException {
		HomePage homepage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password).clickOnRemembermeCheckbox();
		homepage=loginPage.clickOnSignInButton();
		
		homepage.clickOnAdminLink();
		loginPage=homepage.clickOnLogoutLink();
		boolean istitledisplayed=homepage.titleDisplayed();
		Assert.assertTrue(istitledisplayed,Messages.HOMEPAGEERROR);
		
	}
}
