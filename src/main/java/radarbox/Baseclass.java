package radarbox;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;

public class Baseclass {
	
	protected WebDriver driver;
	protected Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\data.properties");
		prop=new Properties();
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		System.out.print("Browser Name: "+browsername);
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
		    driver = (WebDriver) new OperaDriverManager();
		}
		if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		}
		if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		}
				
		return driver;
		
	}

}
