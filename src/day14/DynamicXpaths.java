package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicXpaths {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
	}
	@Test
	public void xpathTest()
	{
		driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_144307')]/div/ol/li[6]/a")).click();
		
	}

}
