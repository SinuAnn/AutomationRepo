package seleniumBasics;

public class WebDriver_Methods extends Base
{
 public void handlingWebDriverMethods()
 {
	String url=driver.getCurrentUrl();
			System.out.println(url);
			String title=driver.getTitle();
			System.out.println(title);
			String pagesource=driver.getPageSource();
			System.out.println(pagesource);
			String handleId=driver.getWindowHandle();
		    System.out.println(handleId);
 }
 public void browserCloseandQuit()
	{
		//driver.close();
		driver.quit();
	}
 public static void main(String[] args) {
	 {
		 WebDriver_Methods driverMethods= new WebDriver_Methods();
		 driverMethods.initializeBrower();
		 driverMethods.handlingWebDriverMethods();
		// driverMethods.browserCloseandQuit();
				 
	 }
}
}
