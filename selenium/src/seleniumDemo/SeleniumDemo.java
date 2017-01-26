package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo {

	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait Wait=new WebDriverWait(driver, 10);
		//WebDriver driver=new FirefoxDriver();
		Workflow s = new Workflow(driver);
		
		s.openPage();
		s.login("admin","demo123");
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("icon-index")));
		String act = s.verify();
		if(act.equals("Howdy, admin")){
			System.out.println("Passed");	
		}
		else{
			System.out.println("Failed");
		}
		s.logout();
		driver.quit();
	}
}
