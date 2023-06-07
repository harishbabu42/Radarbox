package radarbox;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import objects.CreateAccount;
import objects.LoginLink;

public class CreateAccountTest extends Baseclass{
	
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
	@Test(description="Testcase3")
	public void loginRadarboxwithInvalidData() throws InterruptedException
	{
		CreateAccount ca=new CreateAccount(driver);
		ca.loginLink().click();
		ca.creatAccount().click();
		ca.name().sendKeys(prop.getProperty("name"));
		ca.email().sendKeys(prop.getProperty("email"));
		ca.password().sendKeys(prop.getProperty("password"));
		ca.confirmpassword().sendKeys(prop.getProperty("password"));
		ca.agreechekbox().click();
		ca.submit().click();
		
	}

}
