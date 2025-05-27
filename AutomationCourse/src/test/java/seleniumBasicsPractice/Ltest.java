package seleniumBasicsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Ltest extends TestNGBase1 {

	
	@Test
	public void verifyuserloginwithvaildcreditials()
	{
		WebElement usernamef =driver.findElement(By.xpath("//input[@name='user-name']"));
		usernamef.sendKeys("standard_user");
		
	WebElement passwordkey=driver.findElement(By.xpath("//input[@name='password']"));
	passwordkey.sendKeys("secret_sauce");
	WebElement loginbutton =driver.findElement(By.xpath("//input[@class='btn_action']"));
	loginbutton.click();
	//WebElement loginbutton1 =driver.findElement(By.xpath("//input[@value=\"LOGIN\"]"));
	//loginbutton1.click();
	}
	
}
