package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;// web driver interface , driver - ref//
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
public static void main ( String [] args)
{
Base base= new Base();
base.initializeBrower();
base.browserCloseandQuit();
}}
