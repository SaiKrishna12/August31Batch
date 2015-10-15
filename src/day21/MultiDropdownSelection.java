package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiDropdownSelection {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		
	}
	@Test
	public void dropdownTest()
	{
		driver.switchTo().frame("iframeResult");
		WebElement drop=driver.findElement(By.name("cars"));
		Select sel=new Select(drop);
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Saab");
		driver.findElement(By.xpath("html/body/form/input")).click();
	}

}
