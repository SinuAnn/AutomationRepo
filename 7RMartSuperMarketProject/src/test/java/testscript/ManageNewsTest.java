package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	@Test(description = "Verify wheather user is able to add new news in Managenews tile")
	public void verifyWhethertheUsercanaddNewNews() throws IOException {
		HomePage homepage;
		ManageNewsPage managenews;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password).clickOnRemembermeCheckbox();
		homepage=loginpage.clickOnSignInButton();
		
		managenews=homepage.clickOnManageNewsLink();
		managenews.clickOnNewManageNewsIcon();
		String newnews = ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		managenews.enterNewsonNewManageNewsField(newnews).clickOnNewnewsSaveIcon();
		boolean isnewnewsaddalertisdisplayed=managenews.addNewsAlertDisplayed();
		Assert.assertTrue(isnewnewsaddalertisdisplayed,Messages.ADDNEWNEWSERROR);
	}

	@Test(description = "Verify wheather user is able to search news and reset in Managenews tile")
	public void verifywhetherUserCanSearchNews() throws IOException {
		HomePage homepage;
		ManageNewsPage managenews;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password).clickOnRemembermeCheckbox();
		homepage=loginpage.clickOnSignInButton();
		
		managenews=homepage.clickOnManageNewsLink();
		managenews.clickManageNewsSearchIcon();
		String newnews = ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		managenews.enterNewsOnManageNewsSearchField(newnews).clickOnManageNewsSearchButton();
		boolean issearchnewsdisplayed=managenews.serachManageNews();
		Assert.assertTrue(issearchnewsdisplayed,Messages.NEWSSERACHERROR);

	}

}
