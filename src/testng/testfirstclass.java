package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testfirstclass {
	
	
	@Test 
	public void demo()
	{
		System.out.println("execute first test");
		
	}

	
	@Test  
	public void carcolorofcar( )
	{
		System.out.println("white");
	}
	
	@Test 
	public void testsecond()
	{
		System.out.println("execute second code");
	}
	

}
