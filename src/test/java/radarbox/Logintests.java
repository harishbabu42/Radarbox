package radarbox;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import objects.LoginLink;

@SuppressWarnings("deprecation")
public class Logintests extends Baseclass {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() throws IOException
	{
		driver=initializeDriver();
	}
	
	@Test
	public void launchRadarbox() throws InterruptedException {
		
		String url=prop.getProperty("url");
		driver.get(url);
		Thread.sleep(4000);
		driver.manage().window().maximize();
	}
	
	@SuppressWarnings("deprecation")
	@Test(description="Testcase1")
	public void loginRadarboxwithInvalidData() throws InterruptedException
	{
		String ExpectedErrorMsg="These credentials do not match our records.";
		
		LoginLink l=new LoginLink(driver);
		l.loginLink().click();
		l.email().sendKeys(prop.getProperty("username"));
		l.password().sendKeys(prop.getProperty("password"));
		Thread.sleep(5000);
		l.signin().click();
		Thread.sleep(3000);
		String ActualErrorMsg = l.errorContent().getText();
		System.out.println("The Actual Error Message is "+ActualErrorMsg);
		Assert.assertEquals(ExpectedErrorMsg, ActualErrorMsg);		
	}
	
	@Test(description="Testcase2")
	public void resetpaswrodfromForgtPassword() throws InterruptedException
	{
		LoginLink l=new LoginLink(driver);
		l.loginLink().click();
		Thread.sleep(3000);
		l.forgotPassword().click();
		Thread.sleep(2000);
		l.email().sendKeys(prop.getProperty("email"));
		l.sendpasswordreset().click();
	}

}