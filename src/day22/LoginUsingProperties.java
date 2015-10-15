package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUsingProperties {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\Aug31Batch\\Selenium\\Login.properties");
		Properties pr=new Properties();
		pr.load(f);
		driver.findElement(By.id(pr.getProperty("txtUsername"))).sendKeys("gandham.saikrishna");
		driver.findElement(By.id(pr.getProperty("btnNext"))).click();
		driver.findElement(By.id(pr.getProperty("txtPassword"))).sendKeys("pass@123");
		driver.findElement(By.id(pr.getProperty("btnSignin"))).click();
		
	}

}
