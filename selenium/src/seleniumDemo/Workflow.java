package seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Workflow {
	WebDriver d;

	Workflow(WebDriver driver) {
		d=driver;
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	void openPage(){
		d.get("http://demosite.center/wordpress/wp-login.php");
	}
	void login(String username, String password) throws IOException{
		d.findElement(By.id("user_login")).clear();
		d.findElement(By.id("user_login")).sendKeys(username);
		d.findElement(By.id("user_pass")).sendKeys(password);
		d.findElement(By.id("wp-submit")).click();
	}
	String verify(){
		String act=d.findElement(By.xpath("//a[@title='My Account']")).getText();
		return act;
	}
	void logout() throws InterruptedException{
		Actions action = new Actions(d);
		action.moveToElement(d.findElement(By.xpath("//a[@title='My Account']"))).perform();
		Thread.sleep(1000);
		action.moveToElement(d.findElement(By.xpath("//a[text()='Log Out']"))).click().perform();
	}


}
