package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SanityTesting {
	public static void main(String[] args)
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://goair.in");
		WebElement fromDrop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> dropdown=fromDrop.findElements(By.tagName("option"));
		int a=myRandomNo(dropdown.size()-1);
		dropdown.get(a).click();
		String city=dropdown.get(a).getText();
		WebElement toDrop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
		if(toDrop.getText().contains(city))
		{
			System.out.println(city+" is not working properly");
		}
		else
		{
			System.out.println(city+" is  working properly");
		}
		driver.close();
	}
	
	public static int myRandomNo(int x)
	{
		
		double d=Math.random()*x;
		int a=(int)d;
		return a;
		
	}

}
