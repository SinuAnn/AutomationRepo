package testscript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(description = "Verify wheather  user can login with valid credentials", priority = 1,groups= {"smoke"})
	public void verifyUserLoginwithValidCredentials() throws IOException {
		HomePage homepage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password).clickOnRemembermeCheckbox();
		homepage=loginPage.clickOnSignInButton();
		boolean isdashboarddisplayed = loginPage.dashboardtiledisplayed();
//Assert.assertTrue(isdashboarddisplayed,Messages.VALIDCREDENTIALERROR);
		String expected = "Dashboard";
		String actual = loginPage.getDashboardText();
		Assert.assertEquals(actual, expected, Messages.VALIDCREDENTIALERROR);

	}

	@Test(description = "Verify wheather user can login with invalid username and valid password", priority = 2)
	public void verifyUserLoginWithInValidUsernameandvalidpassword() throws IOException

	{

		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password).clickOnRemembermeCheckbox().clickOnSignInButton();
		boolean isalertdisplayed = loginPage.alertDisplayed();
		Assert.assertTrue(isalertdisplayed, Messages.INVALIDUSERNAMEANDVAILDPASSWORDERROR);
		//Assert.assertFalse(isalertdisplayed," Not able to display alertmessages ");
	}

	@Test(description = "Verify wheather usercan login with valid username and invalid password", priority = 3,retryAnalyzer = retry.Retry.class)
	public void verifyUserLoginWithValidUsernameandInValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password).clickOnRemembermeCheckbox().clickOnSignInButton();
		boolean isalertdisplayed = loginPage.alertDisplayed();

		Assert.assertTrue(isalertdisplayed, Messages.VALIDUSERNAMEANDINVAILDPASSWORDERROR);
	}

	@Test(description = "Verify wheather user can login with invalid credentials", priority = 4,groups= {"smoke"},dataProvider="logindata")
	public void verifyUserLoginWithInValidCredentials(String username,String password) throws IOException {

		//String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		//String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password).clickOnRemembermeCheckbox().clickOnSignInButton();
		boolean isalertdisplayed = loginPage.alertDisplayed();
		Assert.assertTrue(isalertdisplayed, Messages.INVALIDCREDENTIALERROR);
	}

	@DataProvider(name="logindata")
	 public Object[][]getDataFromDataProvider() throws IOException
	 {
	return new Object[][] { new Object[] {"test","test1"},new Object[] {"test1","test2"},new Object[] {
	ExcelUtility.getStringData(3, 0,"LoginPage"),ExcelUtility.getStringData(3, 1, "LoginPage")}} ;
			
		
	 

	
			
	
	 }
}
