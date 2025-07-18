package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernamefield;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordkey;
	@FindBy(xpath = "//label[@for='remember']")
	private WebElement remembermebutton;
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement siginbutton;
	@FindBy(xpath = "//p[text()='Dashboard']")
	private WebElement dashboardtile;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement invaidcredentialalertmessage;

	public LoginPage enterUsernameonUsernameField(String username) {
		usernamefield.sendKeys(username);
		return this;
	}

	public LoginPage enterPasswordOnPasswordField(String password) {
		passwordkey.sendKeys(password);
		return this;//
	}

	public LoginPage clickOnRemembermeCheckbox() {
		remembermebutton.click();
		return this;
	}

	public HomePage clickOnSignInButton() {
		siginbutton.click();
		return new HomePage(driver);
	}

	public boolean dashboardtiledisplayed() {
		return dashboardtile.isDisplayed();
	}

	public String getDashboardText() {
		return dashboardtile.getText();
	}

	public boolean alertDisplayed() {
		return invaidcredentialalertmessage.isDisplayed();
	}

}
