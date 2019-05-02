package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeepMeLoginIsAcheckBoxOrNot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String elementType = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("type");
		System.out.println(elementType);
//		if (elementType.equalsIgnoreCase("checkbox")) {
//		System.out.println("it is a checkbox");
//		}else{
//		System.out.println("it is NOT a checkbox");
		//}
}
}
