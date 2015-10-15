package day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImplicitWait {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.24hourfitness.com/not-yet-member.html");
	}
	@Test
	public void waitTest()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[2]/a")).click();
		
	}
	
	
	
	
	
	

}
