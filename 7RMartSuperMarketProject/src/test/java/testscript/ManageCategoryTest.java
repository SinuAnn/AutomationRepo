package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import retry.Retry;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	@Test(description = "Verify wheather the user is able to add new categeory details in Managecategory tile",retryAnalyzer =retry.Retry.class)
	public void verifyWhetherTheUserCanEnterTheNewCategoryDetails() throws IOException, AWTException {
		HomePage homepage;
		ManageCategoryPage managecategorypage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password).clickOnRemembermeCheckbox();
		homepage=loginpage.clickOnSignInButton();
		
		managecategorypage= homepage.clickOnManageCategoryLink();
		managecategorypage.clickOnNewCategoryAddIcon();
		String category = ExcelUtility.getStringData(0, 0, "ManageCategoryPage");
		managecategorypage.enterNewnameOnCategoryField(category).clickOnSelectGroupstoSelectGroup().toPageScrolldown()
		.clickOnTheFileUploadLink().clickOnCheckBoxRadioButton()
		.toPageScrolldown().clickonTheNewCategorySaveButton();
		boolean isaddcategoryalertdisplayed=managecategorypage.addCategoryAlertDisplayed();
		Assert.assertTrue(isaddcategoryalertdisplayed,Messages.ADDNEWCATEGORYERROR );
	}

	@Test(description = "Verify wheather user is able to search  categeory details  Managecategory tile")
	public void verifywhetherUsercanSearchTheCategoryDetails() throws IOException {
		HomePage homepage;
		ManageCategoryPage managecategorypage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username).enterPasswordOnPasswordField(password)
		.clickOnRemembermeCheckbox();
		homepage=loginpage.clickOnSignInButton();
		
		managecategorypage=homepage.clickOnManageCategoryLink();
		managecategorypage.clickonCategorySearchIcon();
		String newcategorysearchname = ExcelUtility.getStringData(0, 0, "ManageCategoryPage");
		managecategorypage.enterCategoryNameOnCategorySearchField(newcategorysearchname).clickOnCategorySearchButton();
		boolean issearchlistcategoryisdisplayed=managecategorypage.serachListCategory();
		Assert.assertTrue(issearchlistcategoryisdisplayed,Messages.CATEGORYSERACHERROR);
	}

}
