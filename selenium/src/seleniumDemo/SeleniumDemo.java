package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:/Vignesh/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		Workflow s = new Workflow(driver);
		s.openPage();
		s.login();
		Thread.sleep(3000);
		s.logout();
	}
}
