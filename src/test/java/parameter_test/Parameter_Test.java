package parameter_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Test_Base;

public class Parameter_Test extends Test_Base
{	
	@Test
	@Parameters({"url", "email_id"})
	public void fbLoginTest(String url, String email_id)
	{
		initialization(url);

		// click on sign in -
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		// enter username -
		driver.findElement(By.name("email")).sendKeys(email_id);
		
		// click on continue -
		driver.findElement(By.id("continue")).click();
		
		// click on continue -
		driver.findElement(By.name("password")).sendKeys("ApneRolleAmazontma@1");
		
		// click on login button -
		driver.findElement(By.id("signInSubmit")).click();
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(10000);
		driver.quit();
	}
}