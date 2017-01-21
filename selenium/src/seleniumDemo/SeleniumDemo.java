package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Vignesh/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		

	}

}
