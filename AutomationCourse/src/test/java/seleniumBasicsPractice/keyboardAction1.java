package seleniumBasicsPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class keyboardAction1 
{
	public void base()
	{
	WebDriver driver=new ChromeDriver();//call the driver
	driver.manage().window().maximize();//maxmize
	driver.get("http://selenium.qabible.in/");//call url
	}
	public void Action() throws AWTException
	{
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
			
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		keyboardAction1 press=new keyboardAction1();
		press.base();
		try {
			press.Action();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
