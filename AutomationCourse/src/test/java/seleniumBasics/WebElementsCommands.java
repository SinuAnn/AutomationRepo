package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementsCommands extends Base {

	public void handlingwebelements() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("Hello");
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		//System.out.println(showmessagebutton.isDisplayed());
		System.out.println(showmessagebutton.isEnabled());
		
		WebElement yourmessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourmessage.getText());
		messagebox.clear();
		WebElement valuea = driver.findElement(By.id("value-a"));// to find tag using attribute value.
		System.out.println(valuea.getTagName());
		//WebElement buttontwo=driver.findElement(By.id("button-two"));
		//System.out.println(buttontwo.getTagName());
System.out.println(showmessagebutton.getCssValue("background-color"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebElementsCommands elements = new WebElementsCommands();
		elements.initializeBrower();

		elements.handlingwebelements();
		// elements.browserCloseandQuit();
	}

}
