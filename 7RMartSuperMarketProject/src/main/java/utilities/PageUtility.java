package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	WebDriver driver;
	
	public void selectbyValue(WebElement element, String value)
	{ 
		Select object = new Select(element); 
		object.selectByValue(value);
	}

	public void selectbyIndex(WebElement element, int value)
	{ 
		Select object = new Select(element); 
		object.selectByIndex(value);
	}

	public void selectbyVisibleText(WebElement element, String text)
	{ 
		Select object = new Select(element); 
		object.selectByVisibleText(text);
	}

	public void deselectAllCheckboxSelected(WebElement element)
	{ 
		Select object = new Select(element); 
		object.deselectAll();
	}
	public void rightClickOnElement(WebElement element)
	{ 
		Actions action = new Actions(driver);
		action.clickAndHold(element).build().perform();
	}	
	
	public void dragAndDropAction (WebElement drag, WebElement drop)
	{
	Actions actions= new Actions(driver);
	 actions.dragAndDrop(drag, drop).build().perform();
	}
	
	public void selectCheckbox(WebElement checkbox) {
	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	}
	public void selectRadioButton(WebElement radioButton) {
	    if (!radioButton.isSelected()) {
	        radioButton.click();
	    }
	}
	
	
}