package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Independent_Dependent_Xpath_Seleniumsite_javaDownload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		driver.findElement(By.xpath("//td[text()='Java']/..//td[4]/a")).click();
		//also//td[1]/..//td[4]/a
		//also//td[1]/../td[4]/a
		//also//td[text()='Java']/..//a[text()='Download']
		//driver.close();

	}
}
