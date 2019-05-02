package actiTime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlertPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.actimind.com");
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert alert = driver.switchTo().alert();
		System.err.println(alert.getText());
		Thread.sleep(3000);
		alert.sendKeys("my name is sanjeet kumar");
		alert.accept();
		System.out.println(alert.getText());
		alert.dismiss();
}
}
