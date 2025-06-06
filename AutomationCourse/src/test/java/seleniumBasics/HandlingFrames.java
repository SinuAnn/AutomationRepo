package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HandlingFrames  extends Base

{ 
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		//WebElement totalframe1=driver.findElement(By.tagName("iframe"));
	//System.out.println(totalframe1.getSize());// frame size of specfic frame
	List<WebElement>iframes=driver.findElements(By.tagName("iframe"));
	System.out.println(iframes.size());
	/*WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(frame1);
	WebElement heading1=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
	System.out.println("h1");
	System.out.println(heading1.getText());*/
	
	WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
	driver.switchTo().frame(frame2);
	WebElement heading =driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
	//System.out.println("h2");
	System.out.println(heading.getText());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingFrames frames=new HandlingFrames();
		frames.initializeBrower();
		//frames.browserCloseandQuit();
		frames.verifyFrames();
		
		
		
	}

}
