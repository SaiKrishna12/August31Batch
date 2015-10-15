package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting1 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		String exptitle="Gmail";
		String acttitle=driver.getTitle();
		if(exptitle.equals(acttitle))
		{
			System.out.println("Gmail link working correctly");
		}
		else
		{
			System.out.println("Gmail link not working correctly");
		}
		driver.close();
	}
}



