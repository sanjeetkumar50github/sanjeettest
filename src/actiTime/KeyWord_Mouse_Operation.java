package actiTime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyWord_Mouse_Operation {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	Robot r=new Robot();
	//move the mouse by x and u coordinate
	
	r.mouseMove(300, 500);
	
	//press ALT keyword from the keyword
	r.keyPress(KeyEvent.VK_ALT);
	
	//press F key from keyboard
	r.keyPress(KeyEvent.VK_F);
	
	//Release F key from keyboard
	r.keyRelease(KeyEvent.VK_F);
	
	//Release Alt key from keyboard
	r.keyRelease(KeyEvent.VK_ALT);
	
	Thread.sleep(3000);
	//Press W key from keyboard to open a new private window
	r.keyPress(KeyEvent.VK_W);
	
	//Release W key from keyboard
	r.keyRelease(KeyEvent.VK_W);
	
	Thread.sleep(3000);
	// It will close only the current browser window
	//driver.close();
	// It will close all the browser windows opened by Selenium
	driver.quit();
}
}
