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
@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboardtile;
@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement invaidcredentialalertmessage ;
	public void enterUsernameonUsernameField(String username) {
		usernamefield.sendKeys(username);
	}

	public void enterPasswordOnPasswordField(String password) {
		passwordkey.sendKeys(password);
	}

	public void clickOnRemembermeCheckbox() {
		remembermebutton.click();
	}

	public void clickOnSignInButton() {
		siginbutton.click();
	}
	public boolean dashboardtiledisplayed()
	{
		return dashboardtile.isDisplayed();
	}
	public String getdashboardtext()
	{
		return dashboardtile.getText();
	}
	public boolean alertdisplayed()
	{
		return invaidcredentialalertmessage.isDisplayed();
	}
	
}
