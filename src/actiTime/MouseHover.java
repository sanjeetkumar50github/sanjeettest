package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.actimind.com");
		driver.manage().window().maximize();
		WebElement AOE = driver.findElement(By.linkText("AREAS OF EXPERTISE"));
		Actions actions=new Actions(driver);
		actions.moveToElement(AOE).perform();
	    WebElement ca = driver.findElement(By.linkText("CLOUD APPLICATIONS"));
	    ca.click();
	    //actions.moveToElement(ca).click().perform();
}
}
