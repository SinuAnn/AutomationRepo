package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {

	public WebDriver driver;

	public ManageNewsPage(WebDriver driver)// constructor initialize
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newmanagenewsicon;
	@FindBy(xpath = "//textarea[@id='news'and@class='form-control']")
	WebElement newmanagenewsfield;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement newmanagenewssaveicon;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	WebElement managenewssearchicon;
	@FindBy(xpath = "//input[@name='un']")
	WebElement managenewssearchfield;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement managenewssearchbutton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement addnewsalert;
	@FindBy(xpath="//h4[text()='Search Manage News']")private WebElement searchnews;
	

	public ManageNewsPage clickOnNewManageNewsIcon() {
		newmanagenewsicon.click();
		return this;
	}

	public  ManageNewsPage  enterNewsonNewManageNewsField(String newnews) {
		newmanagenewsfield.sendKeys(newnews);
		return this;
	}

	public  ManageNewsPage  clickOnNewnewsSaveIcon() {
		newmanagenewssaveicon.click();
		return this;
	}

	public  ManageNewsPage  clickManageNewsSearchIcon() {
		managenewssearchicon.click();
		return this;
	}

	public  ManageNewsPage  enterNewsOnManageNewsSearchField(String news) {
		managenewssearchfield.sendKeys(news);
		return this;
	}

	public  ManageNewsPage  clickOnManageNewsSearchButton() {
		managenewssearchbutton.click();
		return this;
	}

	public boolean addNewsAlertDisplayed()
	{
		return addnewsalert.isDisplayed();
}
	public boolean serachManageNews()
	{
		return searchnews.isDisplayed();
	}
}
