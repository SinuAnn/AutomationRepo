package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
	public WebDriver driver;

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//i[@class='fas fa-arrow-circle-right']")
	private WebElement adminuserlink;
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
	@FindBy(xpath = "//i[@class='ace-icon fa fa-sync-alt']")
	private WebElement resetfield;

	public void clickOnAdminUserLink() {
		adminuserlink.click();

	}

	public void clickOnNewIcon() {
		newicon.click();

	}

	public void enterUsernameOnUsernameField(String adminusername) {
		usernamefield.sendKeys(adminusername);
	}

	public void enterPasswordOnPasswordField(String adminpassword) {
		passwordfield.sendKeys(adminpassword);
	}

	public void selectUserTypeFromUserTypeDropDownList() {

		Select dropdown = new Select(usertypefield);
		dropdown.selectByIndex(1);

	}

	public void clickOnSaveButton() {
		savebutton.click();

	}

	public void clickOnSearchButton() {
		searchbutton.click();

	}

	public void enterUsernameOnUsernameFieldOfSearchButton(String adminusernamesearch) {
		findusernamefield.sendKeys(adminusernamesearch);

	}

	public void clickOnSearchButtonOfSearchAdminUsers() {
		findserach.click();

	}

	public void selectUserTypeFromUserTypeDropDownlistOfSearchAdminUsers() {

		Select usertype = new Select(findusertypefield);
		usertype.selectByVisibleText("Staff");
	}

	public void clickOnReset() {
		resetfield.click();

	}
}