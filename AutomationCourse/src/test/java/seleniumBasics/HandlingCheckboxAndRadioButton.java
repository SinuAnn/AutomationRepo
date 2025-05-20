package seleniumBasics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckboxAndRadioButton extends Base {

	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkbox1.click();
	System.out.println(checkbox1.isSelected());
	}
	public void radioButton() {
	 driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='blue']"));
		radiobutton.click();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingCheckboxAndRadioButton checkbox = new HandlingCheckboxAndRadioButton();
		checkbox.initializeBrower();
//checkbox.browserCloseandQuit();
		checkbox.verifyCheckBox();
		//checkbox.radioButton();

	}
	
	}

