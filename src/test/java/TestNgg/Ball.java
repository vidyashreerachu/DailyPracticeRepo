package TestNgg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ball {
	
	@BeforeTest
	public void data1()
	{
		System.out.println("Ball - Before Test");
	}
	
	@Test
	public void name()
	{
		System.out.println("Ball test method");
	}

}
