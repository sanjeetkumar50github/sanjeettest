package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptoscrollUpAnDown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(" http://seleniumhq.org/download ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
		//scroll down on the webpage
			
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(3000);
		}
		for (int i = 1; i < 10; i++) {
		//scroll up on the webpage
			
		js.executeScript("window.scrollBy(0, -1000)");
		Thread.sleep(3000);
		}
}
}
