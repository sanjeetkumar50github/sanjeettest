package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelectedorNot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement KeepMeLogIN_Checkbox = driver.findElement(By.name("remember"));
		//select the checkbox
		KeepMeLogIN_Checkbox.click();
		//Using the isSelected() method, it checks whether the checkbox is selected or
		//not : if it is already selected, it return true and if not selected, then it returns
		//false/
		if (KeepMeLogIN_Checkbox.isSelected()) {
		System.out.println("Checkbox is selected");
		}else{
		System.out.println("Checkbox is NOT selected");
		}
}
}
