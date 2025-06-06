package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAction extends Base
{
	public void verifyRightclick()
	{ 
	WebElement home =driver.findElement(By.xpath("//a[text()='Home']"));
	 Actions actions= new Actions(driver);//Actions is a predefined class
	 actions.contextClick(home).build().perform();//contextclick is used for right click functions
	 
}
	public void verifyMouseOver()
	{
	//	WebElement others =driver.findElement(By.xpath("//a[@id='progress-bars']"));
		WebElement others =driver.findElement(By.xpath("//a[@id='others']"));
	 Actions actions= new Actions(driver);
	 actions.moveToElement(others).build().perform();
	}
	 public void verifyDraganddrop()
	 {
		driver.navigate().to("https://demoqa.com/droppable"); 
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		 Actions actions= new Actions(driver);
		 actions.dragAndDrop(drag, drop).build().perform();
		 
	 }
	 public void keyBoardAction () throws AWTException
	 {
		Robot robot=new Robot(); 
	robot.keyPress(KeyEvent.VK_CONTROL);// opening new tab
robot.keyPress(KeyEvent.VK_T);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_T);	
		
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingMouseAction action = new HandlingMouseAction();
				action.initializeBrower();
	//action.verifyRightclick();
//action.verifyMouseOver();
//action.verifyDraganddrop();
	try {
		action.keyBoardAction();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
