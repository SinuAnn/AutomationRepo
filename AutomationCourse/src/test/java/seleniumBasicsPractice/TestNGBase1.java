package seleniumBasicsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase1 {
	
	public WebDriver driver;
	@BeforeMethod
	public void in_Browzer()
	{
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}
            public void colse_quit()
            {
            	//driver.close();
            	driver.quit();
            }
            @AfterMethod
            public static void main(String arg[])
            		{
            	TestNGBase1 testbase =new TestNGBase1();
            	
            	testbase.in_Browzer();
            	//testbase.colse_quit();
            			
            		}
}


