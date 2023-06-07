package radarbox;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.HomePage;

public class HomePageTests extends Baseclass {
	
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
	
	@Test(description="test4")
	public void testZoomin() throws IOException
	{
		HomePage hp=new HomePage(driver);
		//Take screenshot before zoomin
		
		File beforezoomin=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(beforezoomin, new File(System.getProperty("user.dir")+"\\Screenshots\\beforezoomin.png"));
		
		hp.zoominLink().click();
		
		//Take screenshot before zoomin
		File afterzoomin=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(afterzoomin, new File(System.getProperty("user.dir")+"\\Screenshots\\afterzoomin.png"));
	}
	
	public void testZoomout() throws IOException
	{
		HomePage hp=new HomePage(driver);
		//Take screenshot before zoomout
		
		File beforezoomout=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(beforezoomout, new File(System.getProperty("user.dir")+"\\Screenshots\\beforezoomout.png"));
		
		hp.zoomoutLink().click();
		
		//Take screenshot before zoomout
		File afterzoomout=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(afterzoomout, new File(System.getProperty("user.dir")+"\\Screenshots\\afterzoomout.png"));
	}
	

}
