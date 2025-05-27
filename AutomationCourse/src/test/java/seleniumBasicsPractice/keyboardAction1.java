package seleniumBasicsPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class keyboardAction1 extends Base1
{
	

	public void Action() throws AWTException 
	
	{
		driver.navigate().to("https://demo.guru99.com");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		keyboardAction1 press=new keyboardAction1();
		press.initializeBrower();
		//press.browserCloseandQuit();
		try {
			press.Action();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
