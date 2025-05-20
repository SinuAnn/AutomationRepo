package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base {
	
	public void verifyalert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
	WebElement click=driver.findElement(By.xpath("//button[@id='alertButton']"));
		click.click();
		Alert alret=driver.switchTo().alert();
		alret.accept();
		
	}

	public void verifyconfirmalert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
	WebElement clickme=driver.findElement(By.xpath("//button[@id='confirmButton']"));
	clickme.click();
	Alert alret=driver.switchTo().alert();
	alret.accept();
	}
	
	public void verifypromtalert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
	WebElement clickme=driver.findElement(By.xpath("//button[@id='promtButton']"));
	clickme.click();
	Alert alret=driver.switchTo().alert();
	alret.sendKeys("Sinu");
	alret.accept();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingAlert alert =new HandlingAlert();
		alert.initializeBrower();
		//alert.browserCloseandQuit();
		//alert.verifyalert();
		//alert.verifyconfirmalert();
		alert.verifypromtalert();
	}

}
