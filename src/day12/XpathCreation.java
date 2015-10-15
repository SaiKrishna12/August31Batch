package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathCreation {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.eenadu.net/hyderabad-news.aspx");
	}
	@Test
	public void xpathTest()
	{
		driver.findElement(By.xpath("//a[@href='hyderabad-news-inner.aspx?item=break69']")).click();
	}

}
