package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id='user-name']")private WebElement usernamefield;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordkey;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginbutton; 
	
	public void  enterUsernameonUsernameField(String username)
	{
		usernamefield.sendKeys(username);
	}
	public void  enterpasswordonpasswordField(String password)
	{
		passwordkey.sendKeys(password);
	}
	public void  clickonloginbutton()
	{
		loginbutton.click();
	}
}
