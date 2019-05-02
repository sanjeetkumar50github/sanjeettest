package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveValuePresentInUsernameTextBoxOfActitimeApplication {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("ajit");
		Thread.sleep(2000);
		String value = driver.findElement(By.id("username")).getAttribute("value");
		System.out.println("Value present inside the text box is : "+value);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("againEnteredAjit");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE); 
		//this line will actually delete the value if there is no space in the text entered
		// if there is a space between two words in the username field, we have to use the below lines of
		//code
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a") ;
		driver.findElement(By.id("username")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		}
		
}
