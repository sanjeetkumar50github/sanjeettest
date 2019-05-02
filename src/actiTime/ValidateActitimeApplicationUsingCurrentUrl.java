package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateActitimeApplicationUsingCurrentUrl {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(4000);
		String ecpected="submit";
		String actual=driver.getCurrentUrl();
		System.out.println(actual);
		if (actual.contains( ecpected)) {
		System.out.println("Home page is displayed");
		}else{
	System.out.println("Home page is NOT displayed");
	}
		Thread.sleep(2000);
		driver.close();
		
}
}
