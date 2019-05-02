package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUNandPWDalignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement unTB = driver.findElement(By.id("username"));
		int un_x = unTB.getLocation().getX();
		int un_width = unTB.getSize().getWidth();
		int un_height = unTB.getSize().getHeight();
		WebElement pwTB = driver.findElement(By.name("pwd"));
		int pw_x = pwTB.getLocation().getX();
		int pw_width = pwTB.getSize().getWidth();
		int pw_height = pwTB.getSize().getHeight();
		if (un_x == pw_x && un_width==pw_width && un_height==pw_height) {
		System.out.println("Username and password text box are aligned");
		} else {
		System.out.println("Username and password text box are NOT aligned");
		}
		System.out.println(un_x);
		System.out.println(un_width);
		System.out.println(un_height);
		driver.close();
		
		}
		
		
} 
	
