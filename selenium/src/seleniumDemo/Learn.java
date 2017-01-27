package seleniumDemo;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
/*		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();*/
		
		
/*		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value='Go!']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();*/
		
		
/*		driver.get("https://www.facebook.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("u_0_1")));
		driver.findElement(By.id("u_0_1")).sendKeys("Vignesh");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Sunder");
		Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		day.selectByVisibleText("23");
		Select mon = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		mon.selectByVisibleText("Jan");
		if (driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).isSelected()==false){
			driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		}
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).submit();
		driver.findElement(By.id("birthday-help")).click();
		String exp = driver.findElement(By.id("u_3_0")).getText();
		System.out.println(exp);
		driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div/div[2]/a")).click();*/
		
		
/*		driver.get("file:///C:/Users/Vignesh/Desktop/ENG%2043_2%20(3.5%20ov,%20JE%20Root%201_,%20YS%20Chahal%202_7)%20_%20Live%20Scorecard%20_%20ESPN%20Cricinfo.html");
		WebElement myTable = driver.findElement(By.xpath("//*[@id='full-scorecard']/div[2]/div/table[1]"));
		System.out.println(myTable.isDisplayed());
		int row = myTable.findElements(By.tagName("tr")).size();
		int col = myTable.findElement(By.xpath("//tr[2]")).findElements(By.tagName("td")).size();
		System.out.println(row);
		System.out.println(col);
		for(int i=2; i<=row-3; i=i+2){
			if(!(myTable.findElement(By.xpath("//tr["+i+"]")).getClass().equals("dismissal-detail"))){
				for(int j= 1; j<=col; j++){
					String a = myTable.findElement(By.xpath("//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(a);
					System.out.print("  ");
				}
				System.out.println("");
			}
		}*/
		
		
		
		driver.get("https://www.google.com");
		try{
			if(driver.findElement(By.id("vig")).isDisplayed()){
			System.out.println("Element Present");
			}
		}catch(NoSuchElementException e){
			System.out.println("Element Not Present");
		}
		

	}

}
