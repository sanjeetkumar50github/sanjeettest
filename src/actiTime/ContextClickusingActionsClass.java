package actiTime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickusingActionsClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement actitimeinc = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
	//actitimeinc.click();
	
	Actions actions=new Actions(driver);
	actions.contextClick(actitimeinc).perform();
	Thread.sleep(5000);

	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
    r.keyRelease(KeyEvent.VK_T);
    //driver.quit();
}
}
