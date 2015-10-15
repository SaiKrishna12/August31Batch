package day30;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginusingLog4j {

	private static Logger log=Logger.getLogger(LoginusingLog4j.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser Launched");
		driver.get("http://yahoomail.com");
		log.info("Opened yahoomail");
		driver.findElement(By.name("username")).sendKeys("saikrishna");
		log.info("Entered username");
		driver.findElement(By.id("login-passwd")).sendKeys("pass@123");
		log.info("entered password");
		driver.findElement(By.id("login-signin")).click();
		log.error("Clicked on login");
		

	}

}
