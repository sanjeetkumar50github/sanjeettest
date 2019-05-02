package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewLicenseIsLinkIsAOrNot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String tagName = driver.findElement(By.id("licenseLink")).getTagName();
		if (tagName.equals("a")) {
		System.out.println("View LIcence is a link");
		} else{
		System.out.println("View LIcence is NOT a link");
		}
		driver.close();
}
}
