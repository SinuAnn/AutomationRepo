package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(description = "Verify wheather  user can login with valid credentials",priority=1)
	public void verify_UserLoginwithValidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage"); 
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
boolean isdashboarddisplayed=loginPage.dashboardtiledisplayed();
Assert.assertTrue(isdashboarddisplayed,Messages.VALIDCREDENTIALERROR);
//String expected="Dashboard";
//String actual=loginPage.getdashboardtext();
//Assert.assertEquals(actual, expected,"User was unable to login with valid credentials");
	}

	@Test(description = "Verify wheather user can login with invalid username and valid password",priority=2)
	public void verifyUserLoginwith_InValidUsernameandvalidpassword() throws IOException

	{

		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
		boolean  isdashboarddisplayed=loginPage.dashboardtiledisplayed();
		Assert.assertFalse(isdashboarddisplayed,Messages.INVALIDUSERNAMEANDVAILDPASSWORD);
	}

	@Test(description = "Verify wheather usercan login with valid username and invalid password",priority=3)
	public void verifyUserLoginwith_ValidUsernameandInValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
		boolean isalertdisplayed=loginPage.alertdisplayed();
		Assert.assertTrue(isalertdisplayed, Messages.VALIDUSERNAMEANDINVAILDPASSWORD);
	}

	@Test(description = "Verify wheather user can login with invalid credentials",priority=4)
	public void verifyUserLoginwith_InValidCredentials() throws IOException {

		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
		boolean  isalertdisplayed=loginPage.alertdisplayed();
		Assert.assertTrue(isalertdisplayed,Messages.INVALIDCREDENTIALERROR);
	}

}
