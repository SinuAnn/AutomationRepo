package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	@Test(description = "Verify wheather the user is able to add new categeory details in Managecategory tile")
	public void verifyWhetherTheUserCanEnterTheNewCategoryDetails() throws IOException, AWTException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnRemembermeCheckbox();
		loginpage.clickOnSignInButton();
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.clickOnManageCategoryLink();
		managecategorypage.clickOnNewCategoryAddIcon();
		String category = ExcelUtility.getStringData(0, 0, "ManageCategoryPage");
		managecategorypage.enterNewnameOnCategoryField(category);
		managecategorypage.clickOnSelectGroupstoSelectGroup();
		managecategorypage.toPageScrolldown();
		managecategorypage.clickOnTheFileUploadLink();
		managecategorypage.clickOnCheckBoxRadioButton();
		managecategorypage.toPageScrolldown();
		managecategorypage.clickonTheNewCategorySaveButton();
		boolean isaddcategoryalertdisplayed=managecategorypage.addcategoryalertdisplayed();
		Assert.assertTrue(isaddcategoryalertdisplayed, "User is unable to add a new category");
	}

	@Test(description = "Verify wheather user is able to search  categeory details  Managecategory tile")
	public void verifywhetherUsercanSearchTheCategoryDetails() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnRemembermeCheckbox();
		loginpage.clickOnSignInButton();
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.clickOnManageCategoryLink();
		managecategorypage.clickonCategorySearchIcon();
		String newcategorysearchname = ExcelUtility.getStringData(0, 0, "ManageCategoryPage");
		managecategorypage.enterCategoryNameOnCategorySearchField(newcategorysearchname);
		managecategorypage.clickOnCategorySearchButton();
		boolean issearchlistcategoryisdisplayed=managecategorypage.serachlistcategory();
		Assert.assertTrue(issearchlistcategoryisdisplayed,"User is unable to find search list category");
	}

}
