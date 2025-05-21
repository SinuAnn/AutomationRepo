package seleniumBasicsPractice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames{


	public WebDriver driver;
	
		public void initializeBrower() 
		{
			driver=new ChromeDriver();
			//driver.get("http://selenium.qabible.in/");
			driver.manage().window().maximize();
		}
		public void browserCloseandQuit()

		{
			//driver.close();
			driver.quit();
		}
	public void verifyframes()
	{
		driver.navigate().to("https://demoqa.com/frames");
		//WebElement totalframe1=driver.findElement(By.tagName("iframe"));
	//System.out.println(totalframe1.getSize());// frame size of specfic frame
	List<WebElement>iframes=driver.findElements(By.tagName("iframe"));
	System.out.println(iframes.size());
	//WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	//driver.switchTo().frame(frame1);
	WebElement frame2=driver.findElement(By.xpath("//iframe[@id=\"google_esf\"]"));
	driver.switchTo().frame(frame2);
	WebElement heading1=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
	System.out.println(heading1.getText());
	
	}
	public static void main(String[] args) {
		{
			Frames frame=new Frames();
			frame.initializeBrower();
			//frame.browserCloseandQuit();
			frame.verifyframes();
		}
	}
	}
	
