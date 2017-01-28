package pomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWeb {
	
	public WebDriver driver;
	public LoginPage login;
	
	@BeforeTest
	void initiate(){
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		login = new LoginPage(driver);
	}
	
	@Test
	void loginTest(){
		driver.get("http://demosite.center/wordpress/wp-login.php");
		login.username().sendKeys("admin");
		login.password().sendKeys("demo123");
		login.login().click();
	}
	
	@AfterTest
	void close(){
		driver.close();
	}
		


}
