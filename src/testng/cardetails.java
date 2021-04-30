package testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cardetails {
    @BeforeClass
    public void testclass()
    {
	System.out.println("execute before class");
    }
	@Test
	public void nameofcar()
	{
		System.out.println("jaguar");
	}
	
	
	@Test
	public void beforeexecution()
	{
		System.out.println("i will execute before swite");
		
	}
	
	
	@Test  
	public void carcolorofcar( )
	{
		System.out.println("wite");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void carlenghtofcar()
	{
		System.out.println("25feet");
	}
	
	@Test
	public void onerfcar()
	{
		System.out.println("ankit");
	}

	@Test 
	public void executeafter()
	{
		System.out.println("i will execute after the suite");
		
	}
	@DataProvider
	public Object[][] getdata()
	{  //1st combination- user name and password - good credit history
	   //2nd combination- user name and password - bad histrory
	   //3rd fraud history
		     //make multi-dimentional object array
		
		Object[][] data=new Object[3][2];          //3 comibinations and 2 values (like username and password)
		//1st set
		data[0][0]="set first username";
		data[0][1]="set first password";
		
		//2nd set
		data[1][0]="set second username";
		data[1][1]="set second password";	
		
		//3rd set
		data[2][0]="set third username";
		data[2][1]="set third password";
		
		return data;
	}
	
	
	@Test (dataProvider="getdata")
	public void testdtaaprovider(String username,String password)
	{
		System.out.println("test data provider is working fine");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	
}
