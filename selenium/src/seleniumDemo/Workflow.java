package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Workflow {
	public WebDriver d;

	public Workflow(WebDriver driver) {
		d=driver;
	}
	public void openPage(){
		d.get("http://demosite.center/wordpress/wp-login.php");
	}
	public void login(){
		d.findElement(By.id("user_login")).sendKeys("admin");
		d.findElement(By.id("user_pass")).sendKeys("demo123");
		d.findElement(By.id("wp-submit")).click();
	}
	public void logout(){
		//d.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']/a")).
		boolean a= d.findElement(By.xpath("//a[text()='Log Out']")).isEnabled();
		System.out.println(a);
		//d.findElement(By.xpath("//*[@id='wp-admin-bar-logout']/a")).click();
	}


}
