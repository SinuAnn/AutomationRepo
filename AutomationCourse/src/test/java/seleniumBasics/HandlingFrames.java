package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HandlingFrames  extends Base

{ 
	public void verifyFrames()
	{
	driver.navigate().to("https://demoqa.com/frames");
	List<WebElement>totalframes= driver.findElements(By.tagName("iframe"));
	System.out.println(totalframes.size());
	WebElement tframes=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(tframes);
	//WebElement t1frames=driver.findElement(By.xpath("//iframe[@id='frame2']"));
			//driver.switchTo().frame(t1frames);
	WebElement heading =driver.findElement(By.xpath("//h1[text()='Frames']"));
	System.out.println(heading.getText());
	//WebElement heading1=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
	//System.out.println(heading1.getText());
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingFrames frames=new HandlingFrames();
		frames.initializeBrower();
		//frames.browserCloseandQuit();
		frames.verifyFrames();
		
		
		
	}

}
