package TestNgg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Cat {
	
	@Test
	public void name()
	{
		System.out.println("Cat test method");
	}
	
	@AfterTest
	public void data1()
	{
		System.out.println("Cat - After Test");
	}
	
	@AfterSuite 
	public void data2()
	{
		System.out.println("Cat - After Suite");
	}
}
