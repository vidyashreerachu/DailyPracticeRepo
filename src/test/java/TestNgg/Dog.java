package TestNgg;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Dog {
	
	@BeforeSuite
	public void data()
	{
		System.out.println("Dog - Before Suite");
	}
	
	@Test
	public void name()
	{
		System.out.println("Dog test method");
	}

}
