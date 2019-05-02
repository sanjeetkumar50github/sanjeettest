package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrinttheTooltipTextOfTheCheckboxPresentOnTheLoginPage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//find the Keep me Logged in Checkbox
	WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	//get the tooltip text using getAttribute() method and store in a variable
	String tooltipText = Checkbox.getAttribute("title");
	System.out.println(tooltipText);
	driver.close();
}
}
