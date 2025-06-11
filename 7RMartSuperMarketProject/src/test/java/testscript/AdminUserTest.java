package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {

	@Test(description = "Verify wheather user is able to add new adminuser in adminuser tile")
	public void verifyWhetherUserIsAbleToAddNewAdminUserOnAdminUserTile() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
		AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.clickOnAdminUserLink();
		adminuser.clickOnNewIcon();
		FakerUtility fackerutility = new FakerUtility();
		String adminusername = fackerutility.createRandomUsername();
		adminuser.enterUsernameOnUsernameField(adminusername);
		String adminpassword = fackerutility.createRandomPassword();
		adminuser.enterPasswordOnPasswordField(adminpassword);
		// String adminusername = ExcelUtility.getStringData(0, 0, "AdminUserPage");
		// String adminpassword = ExcelUtility.getStringData(0, 1, "AdminUserPage");
		adminuser.selectUserTypeFromUserTypeDropDownList();
		adminuser.clickOnSaveButton();
		boolean isadminuseralertdisplayed=adminuser.adminuseralertdisplayed();
	Assert.assertTrue(isadminuseralertdisplayed, "User is unable to add a new user");

	}

	@Test(description = "Verify wheather user is able to serach adminuser using username")
	public void verifywhetheruserisabletosearchadminusersfromadminusertileusingusername() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
		AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.clickOnAdminUserLink();
		adminuser.clickOnSearchButton();
		String adminusername = ExcelUtility.getStringData(0, 0, "AdminUserPage");
		adminuser.enterUsernameOnUsernameFieldOfSearchButton(adminusername);
		adminuser.selectUserTypeFromUserTypeDropDownlistOfSearchAdminUsers();
		adminuser.clickOnSearchButtonOfSearchAdminUsers();
		String expected="Orange";
		String actual=adminuser.getserachuser();
		Assert.assertEquals(actual,expected,"User was unable to serach adminuser ");
		
	}

	
	

}