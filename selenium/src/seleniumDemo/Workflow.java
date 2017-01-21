package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Workflow {
	public WebDriver d;

	public Workflow(WebDriver driver) {
		d=driver;
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void openPage(){
		d.get("http://demosite.center/wordpress/wp-login.php");
	}
	public void login(){
		d.findElement(By.id("user_login")).sendKeys("admin");
		d.findElement(By.id("user_pass")).sendKeys("demo123");
		d.findElement(By.id("wp-submit")).click();
	}
	public void verify(String exp){
		String act=d.findElement(By.xpath("//a[@title='My Account']")).getText();
		if(exp.equals(act)){
			System.out.println("Passed");	
		}
		else{
			System.out.println("Failed");
		}
	}
	public void logout() throws InterruptedException{
		Actions action = new Actions(d);
		action.moveToElement(d.findElement(By.xpath("//a[@title='My Account']"))).perform();
		Thread.sleep(1000);
		action.moveToElement(d.findElement(By.xpath("//a[text()='Log Out']"))).click().perform();
	}


}