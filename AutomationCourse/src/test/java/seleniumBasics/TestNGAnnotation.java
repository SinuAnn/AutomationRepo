package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@Test
	
	public void testcase()
	{
	System.out.println("Test Case");	
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}
	@BeforeTest
	public void beforeText()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After TEST");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("Afterclass");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite");
	}
}
