package seleniumBasicsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseover extends Base1 {

	public void mouseaction()
	{
		WebElement others =driver.findElement(By.xpath("//a[@id='others']"));
		 Actions actions= new Actions(driver);
		 actions.moveToElement(others).build().perform();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mouseover over =new Mouseover();
		over.initializeBrower();
		//over.browserCloseandQuit();
		over.mouseaction();
	}

}
