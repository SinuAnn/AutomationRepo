package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;

public class ManageCategoryPage {
	public WebDriver driver;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")
	private WebElement managecategorylink;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newcategoryaddicon;
	@FindBy(xpath = "//input[@id='category'and@class='form-control']")
	private WebElement newcategoryfield;

	@FindBy(xpath = "//span[text()='discount']")
	private WebElement discount;
	@FindBy(xpath = "//input[@name='main_img']")
	private WebElement newcategoryfileuploadlink;
	@FindBy(xpath = "//input[@name='top_menu'and@value='no']")
	private WebElement checkboxmenu1;
	@FindBy(xpath = "//input[@name='show_home'and@value='no'] ")
	private WebElement checkboxmenu2;
	@FindBy(xpath = "//button[text()='Save'and @type='submit']")
	private WebElement newcategorysavebutton;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	private WebElement categorysearchlink;
	@FindBy(xpath = "//input[@name='un']")
	private WebElement categorynamesearchfield;
	@FindBy(xpath = "//button[@value='sr']")
	private WebElement categorysearchbutton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement addcategoryalert;
@FindBy(xpath="//h4[text()='Search List Categories']")private WebElement searchlist;

	public void clickOnManageCategoryLink() {
		managecategorylink.click();
	}

	public void clickOnNewCategoryAddIcon() {
		newcategoryaddicon.click();
	}

	public void enterNewnameOnCategoryField(String categoryname) {
		newcategoryfield.sendKeys(categoryname);
	}

	public void clickOnSelectGroupstoSelectGroup() {

		discount.click();

	}

	public void clickOnTheFileUploadLink() throws AWTException {

		newcategoryfileuploadlink.sendKeys(Constant.IMAGEDATAFILE);

	}

	public void clickOnCheckBoxRadioButton() {
		checkboxmenu1.click();
		checkboxmenu2.click();
	}

	public void toPageScrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
	}

	public void clickonTheNewCategorySaveButton() {
		// newcategorysavebutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", newcategorysavebutton);
	}

	public void clickonCategorySearchIcon() {
		categorysearchlink.click();
	}

	public void enterCategoryNameOnCategorySearchField(String categoryname) {
		categorynamesearchfield.sendKeys(categoryname);
	}

	public void clickOnCategorySearchButton() {
		categorysearchbutton.click();
	}

	
	public boolean addCategoryAlertDisplayed()
	{
		return addcategoryalert.isDisplayed();
}
	public boolean serachListCategory()
	{
		return searchlist.isDisplayed();
	}
}