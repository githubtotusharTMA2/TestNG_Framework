package TestNG_Listener_Concept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Custom_Listener.class)
public class Screenshot_Test extends Base
{
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void take_Sreenshot_Test1()
	{
		Assert.assertEquals(false, true);
		
	}
	
	@Test
	public void take_Sreenshot_Test2()
	{
		Assert.assertEquals(false, true);
		
	}
	
	@Test
	public void take_Sreenshot_Test3()
	{
		Assert.assertEquals(false, true);
		
	}
}
