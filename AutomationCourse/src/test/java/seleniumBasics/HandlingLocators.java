package seleniumBasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base {
	public void verifyLocators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("button-one")); // locating using id
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("div"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.cssSelector("button[id='button-one']"));	
		driver.findElement(By.xpath("//button[@id='button_two']"));
		driver.findElement(By.xpath("//button[@class='navbar-toggler']"));	
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.findElement(By.xpath("//button [starts-with(text(),'Show')]"));
	   driver.findElement(By.xpath("//button[@id='button-one'and @type='button']"));
	driver.findElement(By.xpath("//button[@id='button-one'or@id='button-one-electronics']"));
	driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
	driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
	driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
	driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
	driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
	driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}
	public void browserCloseandQuit()
	{
		//driver.close();
		driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			HandlingLocators locators = new HandlingLocators();
			locators.initializeBrower();
			locators.verifyLocators();
			// locators.browserCloseandQuit();
		}
	}
}

