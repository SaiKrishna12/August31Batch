package day15;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows2 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://bing.com");
	}
	@Test
	public void multipleWindowTest()
	{
		driver.findElement(By.linkText("Help")).click();
		switchWindow("//*[@id='privacyLabel']");
		switchWindow("//*[@id='psp_microsoft_services_agreement']");
		
	}
	
	public void switchWindow(String x)
	{
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath(x)).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		
		
		
	}


}
