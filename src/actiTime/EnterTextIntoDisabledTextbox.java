package actiTime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextIntoDisabledTextbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.get("file:///D:/disable/Disablebox.html");
		//Typecast the driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		//enter " admin " in first textbox using javascript
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		// clear the value in second textbox using javascript
		js.executeScript("document.getElementById('t2').value=''");
		//enter " manager " in second textbox using javascript
		js.executeScript("document.getElementById('t2').value='manager'");
		//change the second text box to button type using Javascript
		//js.executeScript("document.getElementById('t2').type='button'");
}
}
