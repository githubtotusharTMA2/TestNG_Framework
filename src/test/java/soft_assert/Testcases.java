package soft_assert;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases
{
	
	// hard assertion : hard validation : if a test assertion is getting failed --> immediately test case will be marked as failed and test case will be terminated.
	// soft assertion : soft validation : if a soft assertion is getting failed --> test case will not be marked as passed as well as next lines will be executed
	// assertAll() : to mark the test case as failed, if any soft assertion is getting failed.
	
	@Test
	public void test1()
	{
		SoftAssert soft_Assert = new SoftAssert();
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);
		
		System.out.println("Enter Username");
		System.out.println("Enter password");
		System.out.println("Click on sign in button");
		
		Assert.assertEquals(true, true);
		
		System.out.println("Valiate home page");
		
		soft_Assert.assertEquals(true, false, "HOME PAGE TITLE IS MISSING"); // soft assertion
		
		System.out.println("go to deal page");
		System.out.println("create a deal");
		
		System.out.println("go to contacts page");
		System.out.println("create a contact");
		
		soft_Assert.assertAll();
	}
	
	@Test
	public void test2()
	{
		SoftAssert soft_Assert = new SoftAssert();
		System.out.println("Logout");
		soft_Assert.assertEquals(true, true);
		soft_Assert.assertAll();
	}
	
	@AfterClass
	public void tearDown()
	{

	}
}
