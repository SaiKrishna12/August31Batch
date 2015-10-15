package day29.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	@FindBy(linkText="SIGN-ON")
	WebElement signon;
	public void SIGNON()
	{
		signon.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement REGISTER;
	public void REGISTER()
	{
		REGISTER.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement SUPPORT;
	public void SUPPORT()
	{
		SUPPORT.click();
	}
	
	@FindBy(linkText="CONTACT")
	WebElement CONTACT;
	public void CONTACT()
	{
		CONTACT.click();
	}
	

}
