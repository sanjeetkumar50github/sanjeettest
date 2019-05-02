package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DiffwaysofClickingonaButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com");
		String xp = "//button[.='Sign in']";
		//1. using click() method
		//driver.findElement(By.xpath(xp)).click();
		//2. using sendkeys
		driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
		//3. using submit() method
		//this method will work only and only if if the element has an attribute called type= 'submit'/
		//driver.findElement(By.xpath(xp)).submit();
}
}