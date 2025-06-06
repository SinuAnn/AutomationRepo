package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;// web driver interface , driver - ref//
	public void initializeBrower() {
	
		driver=new ChromeDriver();//chrome driver is the default browserclass for chrome
		driver.get("http://selenium.qabible.in/");
		driver.manage().window().maximize();//to maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// to implicit wait
	}
	public void browserCloseandQuit()
	{
		//driver.close(); //to close current tab
		driver.quit();//to close all tab in window
	}
public static void main ( String [] args)
{
Base base= new Base();
base.initializeBrower();
base.browserCloseandQuit();
}}
