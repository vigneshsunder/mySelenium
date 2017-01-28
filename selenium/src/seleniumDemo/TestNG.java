package seleniumDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import data.ReadDataFromExcel;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestNG {
	WebDriver driver;
	WebDriverWait Wait;
	@BeforeTest
	public void initiate(){
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		Wait=new WebDriverWait(driver, 10);
		//WebDriver driver=new FirefoxDriver();
		
	}

	@Test(dataProvider="login")
	public void test1(String user, String pass) throws InterruptedException, IOException{
		Workflow s = new Workflow(driver);
		s.openPage();
		s.login(user,pass);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("icon-index")));
		String act = s.verify();
		Assert.assertEquals("Howdy, admi",act );
		s.logout();
	}
	@Test
	public void test2(){
		try{
		Assert.assertEquals(true, true);
		}catch(AssertionError e){
			Assert.fail();
		}
		System.out.println("Test 2 Executed");
		
	}
	@AfterTest
	public void close(){
		driver.quit();
	}
	
	@DataProvider(name="login")
	public Object[][] dataProviderMethod() throws IOException{
		ReadDataFromExcel excel = new ReadDataFromExcel();
		Object[][] a = excel.ReadExcel();
		return a;
	}

}
