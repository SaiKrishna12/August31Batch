package day2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://bing.com");
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			Thread.sleep(30000);
			try
			{
				//xpath of 'privacy and cookies' in second window
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("abc");

	}

}
