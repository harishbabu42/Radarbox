package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import radarbox.Baseclass;

public class CreateAccount extends Baseclass{
	
	WebDriver driver;
	By loginlink =By.id("login-btn");
	By createaccount=By.xpath("//*[text()='Create a free account']");
	By name=By.name("name");
	By email =By.name("email");
	By password=By.name("password");
	By confirmpassword=By.name("password_confirmation");
	By agreecheckbox=By.xpath("/html/body/div[7]/div/div/div/form/div[1]/label/input");
	By submit=By.xpath("//*[text()='Create Account']");
	
	public CreateAccount(WebDriver driver)
	{
	   this.driver=driver;	
	}
	
	public WebElement loginLink() {
		return driver.findElement(loginlink);
	}
	public WebElement name() {
		return driver.findElement(name);
	}
	public WebElement creatAccount() {
		return driver.findElement(createaccount);
	}
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement confirmpassword() {
		return driver.findElement(confirmpassword);
	}
	public WebElement agreechekbox() {
		return driver.findElement(agreecheckbox);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}



}
