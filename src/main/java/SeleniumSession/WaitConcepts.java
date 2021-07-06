package SeleniumSession;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConcepts {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("www.amazon.ca");

		WebDriverWait wait = new WebDriverWait(driver, 4);

		WebElement search = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fdsdf")));

		System.out.println(search);
		driver.findElement(By.id("fdsdf")).sendKeys("macbook");
		driver.findElement(By.id("fdsdf")).submit();

	}

}
