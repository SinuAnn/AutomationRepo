package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUserPage {
	public WebDriver driver;

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newicon;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernamefield;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordfield;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement usertypefield;
	@FindBy(xpath = "//i[@class='fa fa-save']")
	private WebElement savebutton;
	@FindBy(xpath = "//i[@class=' fa fa-search']")
	private WebElement searchbutton;
	@FindBy(xpath = "//input[@id='un']")
	private WebElement findusernamefield;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger']")
	private WebElement findserach;
	@FindBy(xpath = "//select[@id='ut']")
	private WebElement findusertypefield;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement adminuseralert;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//following::td[text()='Orange']")
	private WebElement userserach;

	

	

	public AdminUserPage clickOnNewIcon() {
		newicon.click();
		return this;

	}

	public AdminUserPage enterUsernameOnUsernameField(String adminusername) {
		usernamefield.sendKeys(adminusername);
		return this;
	}

	public AdminUserPage enterPasswordOnPasswordField(String adminpassword) {
		passwordfield.sendKeys(adminpassword);
		return this;
	}

	public AdminUserPage selectUserTypeFromUserTypeDropDownList() {
PageUtility selection=new PageUtility();
selection.selectbyIndex(usertypefield, 1);
		//Select dropdown = new Select(usertypefield);
		//dropdown.selectByIndex(1);
return this;
	}

	public AdminUserPage clickOnSaveButton() {
		WaitUtility wait = new WaitUtility();
		wait.waitUntilClickable(driver, savebutton);
		savebutton.click();
return this;
	}

	public AdminUserPage clickOnSearchButton() {
		searchbutton.click();
return this;
	}

	public AdminUserPage enterUsernameOnUsernameFieldOfSearchButton(String adminusernamesearch) {
		findusernamefield.sendKeys(adminusernamesearch);
return this;
	}

	public AdminUserPage clickOnSearchButtonOfSearchAdminUsers() {
		findserach.click();
return this;
	}

	public AdminUserPage selectUserTypeFromUserTypeDropDownlistOfSearchAdminUsers() {
		PageUtility selection=new PageUtility();
		selection.selectbyIndex(findusertypefield, 1);
		//Select usertype = new Select(findusertypefield);
		//usertype.selectByIndex(1);
		return this;
	}

	public boolean adminuserAlertDisplayed() {
		return adminuseralert.isDisplayed();
	}

	public String getSerachUser() {
		return userserach.getText();
	}

}