package TestNgg;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Apple {

	//@BeforeClass
	public void data11()
	{
		System.out.println("Apple - Before class");
	}
	
	//@BeforeMethod
	public void data1()
	{
		System.out.println("Apple - Before method");
	}
	
	// (invocationCount = 3)
	// (priority=-1)
	// (timeOut=5000)
	// (enabled=false)
	// (description = "this is n TC")
	
	
	@Test()
	public void name()
	{
		System.out.println("Apple test method - n");
	
	}
	
	// @Test(retryAnalyzer = Retry.class)
	
	@Test(groups="smoke")
	public void mame()
	{
		System.out.println("Apple test method - m");
		//Assert.assertTrue(false);
	}
	
	//@Test(dependsOnMethods= {"name"})
	// (dependsOnGroups= {"smoke"})
	// (dependsOnGroups= {"smoke"}, alwaysRun = true)
	
	@Test
	public void fame()
	{
		System.out.println("Apple test method - f");
	}
	
	@Parameters({"url","name"})
	@Test
	public void lame(String url, String name)
	{
		System.out.println("Apple test method - l");
		System.out.println(url);
		System.out.println(name);
	}
	
	//@AfterMethod
	public void data2()
	{
		System.out.println("Apple - After method");
	}
	
	
	//@AfterClass
	public void data22()
	{
		System.out.println("Apple - After class");
	}
}
