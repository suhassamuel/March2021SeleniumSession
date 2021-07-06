package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();

		driver = br.initDriver("Chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		br.doGetTitle();

		// 8 Locators 
		// 1. id
			/* 1.1
			 * driver.findElement(By.id("input-email")).sendKeys("suhas@gmail.com");
			 * driver.findElement(By.id("input-password")).sendKeys("test");
			 */
	
			// 1.2
			/*
			 * WebElement email = driver.findElement(By.id("input-email")); WebElement
			 * password = driver.findElement(By.id("input-password"));
			 * email.sendKeys("test"); password.sendKeys("testing");
			 */
	
			// 1.3. using By locator
			/* 
			By email = By.id("input-email");
			By password = By.id("input-password");
			
			driver.findElement(email).sendKeys("test");
			driver.findElement(password).sendKeys("2asdas");*/
	
			// 1.4.
	
			/*By email = By.id("input-email");
			By password = By.id("input-password");
			
			getElement(email).sendKeys("asdasd");
			getElement(password).sendKeys("asasdasasdsd");*/
			
			// 1.5. By locator with getElement() and sendkeys()  generic method
			By email = By.id("input-email");
			By password = By.id("input-password");
			
			doSendKeys(email, "qweqwe");
			doSendKeys(password, "asd");
		
			// 1.6. Maintain util class and move all the functions to that class
		
		
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
	}
	
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
		
	}

}
