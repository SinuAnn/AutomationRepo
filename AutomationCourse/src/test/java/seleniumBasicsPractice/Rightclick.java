package seleniumBasicsPractice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Rightclick extends Base1
{
public void verifyrightclick()
{
driver.navigate().to("https://www.amazon.in/");

WebElement sells=driver.findElement(By.xpath("//a[text()='Sell']"));
Actions action=new Actions(driver);
action.contextClick(sells).build().perform();// contextclick - right click, build- complie,perform-execute.
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
{
	
Rightclick click =new Rightclick();
click.initializeBrower();
//click.browserCloseandQuit();
click.verifyrightclick();
	}

	}}
