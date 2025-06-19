package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static int EXPLICITWAIT=10;
	public static int IMPLICITWAIT=10; {
		
	}
	public void waitUntilClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitUntilAlertIsPresent(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void waitUntilElementisSelected(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public void waitUntilElementIsVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitUntilUrlIsPresent(WebDriver driver)
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
	wait.until(ExpectedConditions.urlToBe("https://groceryapp.uniqassosiates.com/admin/login"));
	}
	
	public void waitUntilTextToBePresentInElementValue(WebDriver driver, WebElement element, String expectedtext)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.textToBePresentInElementValue(element,expectedtext));
		}
	public void waitUntilTitleMatches (WebDriver driver, String element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.titleIs(element));
		}
	public void fluentWaitElements(WebDriver driver, WebElement element, String attribute, String attributeValue, int total) 
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(total)) .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	fluentWait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue)); 
	}
	public void implicitWait(WebDriver driver) 
	{ 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITWAIT)); 
		}

	
	
}

