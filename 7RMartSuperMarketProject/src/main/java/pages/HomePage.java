package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")
	private WebElement adminlink;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")
	private WebElement logoutlink;
	@FindBy(xpath = "//b[text()='7rmart supermarket']")
	private WebElement title;
	@FindBy(xpath = "//i[@class='fas fa-arrow-circle-right']")
	private WebElement adminuserlink;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")
	private WebElement managecategorylink;
	@FindBy(xpath = ("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and@class='small-box-footer']"))
	private WebElement manageNewsLink;
	
	
	
	public HomePage clickOnAdminLink() {
		adminlink.click();
		return this;
	}

	public LoginPage clickOnLogoutLink() {
		logoutlink.click();
		return new LoginPage(driver);
	}
	public AdminUserPage clickOnAdminUserLink() {
		adminuserlink.click();
		return  new AdminUserPage(driver);
	}
	public ManageCategoryPage clickOnManageCategoryLink() {
		managecategorylink.click();
		return new ManageCategoryPage(driver);
	}
		public ManageNewsPage clickOnManageNewsLink()
		{
			manageNewsLink.click();
			return new ManageNewsPage(driver);	
			
		}
	
	public boolean titleDisplayed() {
		return title.isDisplayed();
	}
}
