package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {

	@Test(description = "Verify wheather user is able to add new adminuser in adminuser tile",retryAnalyzer = retry.Retry.class)
	public void verifyWhetherUserIsAbleToAddNewAdminUserOnAdminUserTile() throws IOException {
		HomePage homepage;
		AdminUserPage adminpage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password).clickOnRemembermeCheckbox();
		homepage=loginPage.clickOnSignInButton();
		
		adminpage=homepage.clickOnAdminUserLink();
		adminpage.clickOnNewIcon();
		FakerUtility fackerutility = new FakerUtility();
		String adminusername = fackerutility.createRandomUsername();
		String adminpassword = fackerutility.createRandomPassword();
		adminpage.enterUsernameOnUsernameField(adminusername).enterPasswordOnPasswordField(adminpassword).selectUserTypeFromUserTypeDropDownList().clickOnSaveButton();
		// String adminusername = ExcelUtility.getStringData(0, 0, "AdminUserPage");
		// String adminpassword = ExcelUtility.getStringData(0, 1, "AdminUserPage");
		
		boolean isadminuseralertdisplayed=adminpage.adminuserAlertDisplayed();
	Assert.assertTrue(isadminuseralertdisplayed,Messages.ADDNEWADMINUSERERROR);

	}

	@Test(description = "Verify wheather user is able to serach adminuser using username and userType ")
	public void verifywhetheruserisabletosearchadminusersfromadminusertileusingusername() throws IOException {
		HomePage homepage;
		AdminUserPage adminpage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password).clickOnRemembermeCheckbox();
		homepage=loginPage.clickOnSignInButton();
		
		adminpage=homepage.clickOnAdminUserLink();
		adminpage.clickOnSearchButton();
		String adminusername = ExcelUtility.getStringData(0, 0, "AdminUserPage");
		adminpage.enterUsernameOnUsernameFieldOfSearchButton(adminusername).selectUserTypeFromUserTypeDropDownlistOfSearchAdminUsers().clickOnSearchButtonOfSearchAdminUsers();
		String expected="Orange";
		String actual=adminpage.getSerachUser();
		Assert.assertEquals(actual,expected,Messages.ADMINUSERSEARCHERROR);
		
	}

	
	

}