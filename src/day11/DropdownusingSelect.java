package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownusingSelect {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver(fp);
		driver.get("http://amazon.in");
	}
	@Test
	public void dropdownTest() throws InterruptedException
	{
		//id of the dropdown
		WebElement drop=driver.findElement(By.id
				                         ("searchDropdownBox"));
		Select sel=new Select(drop);
		/*sel.selectByVisibleText("Baby");
		sel.selectByValue("search-alias=baby");
		sel.selectByIndex(1)*/
		Thread.sleep(4000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	

}
