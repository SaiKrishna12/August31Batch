package day29;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day29.pom.WelcomeMercuryTours;

public class Testcase1 {
	@Test
	public void POMTestCase()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wm=PageFactory.initElements
				             (driver,WelcomeMercuryTours.class);
		wm.findAFlight("sai","pass@123");
		driver.navigate().back();
		wm.menu.REGISTER();
		
	}

}
