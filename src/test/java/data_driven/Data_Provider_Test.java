package data_driven;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Test_Base;
import utils.Test_Utils;

public class Data_Provider_Test extends Test_Base
{
	
	@BeforeMethod
	public void setUp()
	{
		initialization("https://www.facebook.com/");
	}
	
	@DataProvider
	public Iterator<Object[]> get_Test_Data()
	{
		ArrayList<Object[]> test_Data = Test_Utils.get_Data_From_Excel();
		return test_Data.iterator();
	}
	
	@Test(dataProvider = "get_Test_Data", priority = 1)
	public void fb_Test(String firstName, String lastName)
	{
		driver.findElement(By.xpath("//a[contains(text(), 'English (UK)')]")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
