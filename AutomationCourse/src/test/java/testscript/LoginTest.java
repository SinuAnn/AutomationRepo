package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestNGBase;
import utilities.Excelutilities;

public class LoginTest extends TestNGBase {
@Test

	public void verify_UserLoginwithValidCredentials() throws IOException
	{
		//WebElement usernamefield=driver.findElement(By.xpath("//input[@id='user-name']"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordkey=driver.findElement(By.xpath("//input[@id='password']"));
	//passwordkey.sendKeys("secret_sauce");
	//WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
//	loginbutton.click();
	String username=Excelutilities.getStringData(0, 0, "LoginPage");
	String password=Excelutilities.getStringData(0, 1, "LoginPage");
	LoginPage loginpage =new LoginPage(driver);
	   loginpage.enterUsernameonUsernameField(username);
	   loginpage.enterpasswordonpasswordField(password);
	   loginpage.clickonloginbutton();
	
	}
@Test
public void verifyUserLoginwith_InValidUsernameandvalidpassword() throws IOException
{
	//WebElement usernamefield=driver.findElement(By.xpath("//input[@id='user-name']"));
	//usernamefield.sendKeys("standard_user1");
	//WebElement passwordkey=driver.findElement(By.xpath("//input[@id='password']"));
//passwordkey.sendKeys("secret_sauce");
//WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
//loginbutton.click();
	String username=Excelutilities.getStringData(1, 0, "LoginPage");
	String password=Excelutilities.getStringData(1, 1, "LoginPage");
	LoginPage loginpage =new LoginPage(driver);
loginpage.enterUsernameonUsernameField(username);
loginpage.enterpasswordonpasswordField(password);
loginpage.clickonloginbutton();


ublic class LoginPage {
	public WebDriver driver;
	 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement usernamefield;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement passwordkey;
	@FindBy(xpath="//input[@id='remember']")private WebElement rememberme; 
	@FindBy(xpath="//button[text()='Sign In']")private WebElement signin;
	public void  enterUsernameonUsernameField(String username)
	{
		usernamefield.sendKeys(username);
	}
	public void  enterpasswordonpasswordField(String password)
	{
		passwordkey.sendKeys(password);
	}
	public void  clickonremembermecheckbox()
	{
		rememberme.click();
	}
	
	public void  clickonsigninbutton()
	{
		signin.click();
	}
	}

}

@Test
public void verifyUserLoginwith_ValidUsernameandInValidPassword() throws IOException
{
	//WebElement usernamefield=driver.findElement(By.xpath("//input[@id='user-name']"));
	//usernamefield.sendKeys("standard_user");
	//WebElement passwordkey=driver.findElement(By.xpath("//input[@id='password']"));
//passwordkey.sendKeys("secret_sauce1");
//WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
//loginbutton.click();
	String username=Excelutilities.getStringData(2, 0, "LoginPage");
	String password=Excelutilities.getStringData(2, 1, "LoginPage");
	LoginPage loginpage =new LoginPage(driver);
loginpage.enterUsernameonUsernameField(username);
loginpage.enterpasswordonpasswordField(password);
loginpage.clickonloginbutton();
}

@Test
public void verifyUserLoginwith_InValidCredentials() throws IOException
{
	//WebElement usernamefield=driver.findElement(By.xpath("//input[@id='user-name']"));
//	usernamefield.sendKeys("standard_user1");
//	WebElement passwordkey=driver.findElement(By.xpath("//input[@id='password']"));
//passwordkey.sendKeys("secret_sauce1");
//WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
//loginbutton.click();
	String username=Excelutilities.getStringData(3, 0, "LoginPage");
	String password=Excelutilities.getStringData(3, 1, "LoginPage");
	LoginPage loginpage =new LoginPage(driver);
loginpage.enterUsernameonUsernameField(username);
loginpage.enterpasswordonpasswordField(password);
loginpage.clickonloginbutton();
}
}



