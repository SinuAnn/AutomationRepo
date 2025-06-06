package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(description = "Verify wheather  user can login with valid credentials")
	public void verify_UserLoginwithValidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();

	}

	@Test(description = "Verify wheather user can login with invalid username and valid password")
	public void verifyUserLoginwith_InValidUsernameandvalidpassword() throws IOException

	{

		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
	}

	@Test(description = "Verify wheather usercan login with valid username and invalid password")
	public void verifyUserLoginwith_ValidUsernameandInValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
	}

	@Test(description = "Verify wheather user can login with invalid credentials")
	public void verifyUserLoginwith_InValidCredentials() throws IOException {

		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
	}

}
