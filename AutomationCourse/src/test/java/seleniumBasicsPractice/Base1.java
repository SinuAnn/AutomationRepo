package seleniumBasicsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	
	public WebDriver driver;
	
	public void initializeBrower() {
		
		driver=new ChromeDriver();
		driver.get("http://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	public void browserCloseandQuit()
	{
		//driver.close();
		driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base1 base=new Base1();
base.initializeBrower();
//base.browserCloseandQuit();

	}

}
