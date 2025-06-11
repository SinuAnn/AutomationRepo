package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	@Test(description = "Verify wheather user is able to add new news in Managenews tile")
	public void verifyWhethertheUsercanaddNewNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnRemembermeCheckbox();
		loginpage.clickOnSignInButton();
		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.clickOnManageNewsLink();
		managenews.clickOnNewManageNewsIcon();
		String newnews = ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		managenews.enterNewsonNewManageNewsField(newnews);
		managenews.clickOnNewnewsSaveIcon();
		boolean isnewnewsaddalertisdisplayed=managenews.addnewsalertdisplayed();
		Assert.assertTrue(isnewnewsaddalertisdisplayed, "User is unable to add  new news");
	}

	@Test(description = "Verify wheather user is able to search news and reset in Managenews tile")
	public void verifywhetherUserCanSearchNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.clickOnManageNewsLink();
		managenews.clickManageNewsSearchIcon();
		String newnews = ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		managenews.enterNewsOnManageNewsSearchField(newnews);
		managenews.clickOnManageNewsSearchButton();
		boolean issearchnewsdisplayed=managenews.serachmanagenews();
		Assert.assertTrue(issearchnewsdisplayed, "User is unable to search news");

	}

}
