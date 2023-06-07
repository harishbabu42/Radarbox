package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import radarbox.Baseclass;

public class HomePage extends Baseclass {
	
	By zoomin=By.id("zoomin");
	By zoomout=By.id("zoomin");
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement zoominLink() {
		return driver.findElement(zoomin);
	}
	public WebElement zoomoutLink() {
		return driver.findElement(zoomout);
	}

}
