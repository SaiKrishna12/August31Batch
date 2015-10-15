package day11;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	//setting priority to test case
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	
	@Test(priority=1)
	public void registratonTest()
	{
		System.out.println("this is for registration");
	}
	
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("This is for logout");
	}
	@BeforeMethod
	public void fun()
	{
		System.out.println("ABC");
	}
	
	
	

}
