package seleniumBasics;

public class HandlingNavigationCommands extends Base 
{
 public void verifyNavigationCommand()
 {
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 HandlingNavigationCommands navigate =new HandlingNavigationCommands();
	 navigate.initializeBrower();
	 navigate.verifyNavigationCommand();
	 
	}

}
