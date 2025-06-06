package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {

	@Test(description="Verifying user is able to add new adminuser in adminusertile" )
	public void verifyWhetherUserIsAbleToAddNewAdminUserOnAdminUserTile() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminLink();
		
		AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.clickOnAdminUserLink();
		adminuser.clickOnNewIcon();
		FakerUtility fackerutility =new FakerUtility();
		String adminusername=fackerutility.createRandomUsername();
		String adminpassword=fackerutility.createRandomPassword();
		//String adminusername = ExcelUtility.getStringData(0, 0, "AdminUserPage");
		//String adminpassword = ExcelUtility.getStringData(0, 1, "AdminUserPage");
		adminuser.enterUsernameOnUsernameField(adminusername);
		adminuser.enterPasswordOnPasswordField(adminpassword);
		adminuser.selectUserTypeFromUserTypeDropDownList();
		adminuser.clickOnSaveButton();

	}

	@Test(description="Verifying user is able to serach  newly added admin in adminuser tile using username")
	public void verifywhetheruserisabletosearchadminusersfromadminusertileusingusername() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
		
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminLink();
		AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.clickOnAdminUserLink();
		//adminuser.clickonnewicon();
		adminuser.clickOnSearchButton();
		//FakerUtility fackerutility =new FakerUtility();
		//String adminusername=fackerutility.createRandomSearch();
		String adminusername = ExcelUtility.getStringData(0, 0, "AdminUserPage");
		adminuser.enterUsernameOnUsernameFieldOfSearchButton(adminusername);
		adminuser.clickOnSearchButtonOfSearchAdminUsers();
	}

	@Test(description="Verifying user is able to serach  newly added admin in adminuser tile using usertype")
	public void verifywhetheruserisabletosearchadminusersfromadminusertileusingusertype() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminLink();
		AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.clickOnAdminUserLink();
		adminuser.clickOnNewIcon();
		adminuser.clickOnSearchButton();
		String adminusername = ExcelUtility.getStringData(1, 0, "AdminUserPage");
		adminuser.selectUserTypeFromUserTypeDropDownlistOfSearchAdminUsers();
		adminuser.clickOnSearchButtonOfSearchAdminUsers();

	}

	@Test(description="Verifying user is able to reset the  adminuser tile")

	public void verifyWhetheruserisabletoresetadminuserdetails() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnRemembermeCheckbox();
		loginPage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminLink();
		AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.clickOnAdminUserLink();
		adminuser.clickOnNewIcon();
		adminuser.clickOnSearchButton();
		adminuser.selectUserTypeFromUserTypeDropDownlistOfSearchAdminUsers();
		adminuser.clickOnSearchButtonOfSearchAdminUsers();
		adminuser.clickOnReset();
	}
}