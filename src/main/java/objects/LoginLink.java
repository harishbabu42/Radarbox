package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import radarbox.Baseclass;

public class LoginLink extends Baseclass {
	
	WebDriver driver;
	By loginlink =By.id("login-btn");
	By email =By.name("email");
	By password=By.name("password");
	By signin=By.xpath("/html/body/div[6]/div/div/div/form/div[2]/button");
	By errorid=By.xpath("//*[@id='content']/div");
	By forgotpassword=By.xpath("//*[text()='Forgot your password?']");
	By sendpasswordreset=   By.xpath("//*[text()='Send Password Reset Link']");
	public LoginLink(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement loginLink() {
		return driver.findElement(loginlink);
	}
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement signin() {
		return driver.findElement(signin);
	}
	public WebElement errorContent() {
		return driver.findElement(errorid);
	}
	public WebElement forgotPassword() {
		return driver.findElement(forgotpassword);
	}

	public WebElement sendpasswordreset() {
		return driver.findElement(sendpasswordreset);
	}

}
