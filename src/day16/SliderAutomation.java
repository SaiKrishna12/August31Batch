package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderAutomation {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void sliderTest()
	{
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		int x=slider.getLocation().x;
		int y=slider.getLocation().y;
		System.out.println(x+"---"+y);
		action.dragAndDropBy(slider,50,y).build().perform();
		
		//action.doubleClick(Webelement).build().perform();
	}

}
