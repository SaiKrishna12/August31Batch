package day14;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckElementPresence {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void elementPresenceTest()
	{
		String str=driver.getPageSource();
		if(str.contains("Rajinikanth"))
		{
			System.out.println("Element present");
		}
		else
		{
			System.out.println("Element not found");
		}
		
		
		
	}

}
