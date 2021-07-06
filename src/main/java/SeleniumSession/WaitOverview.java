package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitOverview {
	
	public static void main(String[] args) throws InterruptedException {
		
		// wait - to sync between script and app
		
		// Static wait : Thread.sleep(5000); --> 5 sec pause
		
		//dynamic wait : total time : 10 sec : found in 2 sec -> left over time : 8 sec . ignored
		// 1. Implicitly wait : is a global wait : only for WebElement
		// 2. Explicitly wait : 
			// 2.1 : WebDriverWait (class)
			// 2.2 : FluentWait (class)
		// WebDriverWait  --> extends -->  FluentWait --->  Implements -> Wait (Interface)
		// Wait ( until(); ) 
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");;
		driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		
	}

}
