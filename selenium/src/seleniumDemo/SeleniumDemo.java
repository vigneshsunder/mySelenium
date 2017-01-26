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
		s.login();
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("icon-index")));
		s.verify("Howdy, admin");
		s.logout();
		driver.quit();
	}
}
