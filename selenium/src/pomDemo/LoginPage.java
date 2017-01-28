package pomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver d;
	LoginPage(WebDriver driver){
		this.d = driver;
	}
	
	public WebElement username(){
		return d.findElement(By.id("user_login"));
	}
	public WebElement password(){
		return d.findElement(By.id("user_pass"));
	}
	public WebElement login(){
		return d.findElement(By.id("wp-submit"));
	}	

}
