package test_driven_development;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basic_TestNG
{
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch ff");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("login to app");
	}
	
	@Test(priority = 1)
	public void compose_Main_Test()
	{
		System.out.println("Compose Mail Test");
	}
	
	@Test(priority = 3, enabled = false)
	public void delete_Mail_Test()
	{
		System.out.println("delete mail Test");
	}
	
	@Test(priority = 2)
	public void search_Mail_Test()
	{
		System.out.println("search_Mail_Test");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	
	@AfterClass
	public void quitBrowser()
	{
		System.out.println("quit browser");
	}
}
