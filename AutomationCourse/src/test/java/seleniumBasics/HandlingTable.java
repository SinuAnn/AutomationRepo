package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{

	public void verifytable()
	{
	driver.navigate().to("https://money.rediff.com/indices/nse");	
	WebElement fulltable=driver.findElement(By.xpath("//table[@id='dataTable']"));
	System.out.println(fulltable.getText());
	WebElement tablerow =driver.findElement(By.xpath("//table[@id=\"dataTable\"]/tbody/tr[2]"));
	System.out.println(tablerow.getText());
//	WebElement tablerow2 =driver.findElement(By.xpath("//table[@id=\"dataTable\"]/tbody/tr[3]"));
	//System.out.println(tablerow2.getText());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingTable table = new HandlingTable();
table.initializeBrower();
table.verifytable();
//table.browserCloseandQuit();
	}

}
