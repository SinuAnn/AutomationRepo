package seleniumBasicsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop  extends Base1{

	public void dragandrop()
	{
		driver.navigate().to("https://demoqa.com/droppable"); 
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		 Actions actions= new Actions(driver);
		 actions.dragAndDrop(drag, drop).build().perform();
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DragAndDrop down=new DragAndDrop();
		down.initializeBrower();
		//down.browserCloseandQuit();
		down.dragandrop();
	}

}
