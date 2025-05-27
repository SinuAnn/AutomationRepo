package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	public WebDriver driver;// web driver interface , driver - ref//
	@BeforeMethod
	public void initializeBrower() {
	
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void browserCloseandQuit()
	{
		//driver.close();
		driver.quit();
	}
	
	

		
}
