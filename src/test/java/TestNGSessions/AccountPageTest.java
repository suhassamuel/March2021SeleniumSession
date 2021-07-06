package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountPageTest {

	public WebDriver driver;

	public void dologin() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		dologin();
	}

	@Test
	public void pageTitleTest() {
		String title = driver.getTitle();

		Assert.assertEquals(title, "My Account");

	}

	@Test
	public void accountHeaderTest() {

		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed());
	}

	@Test
	public void logoutLinkTest() {

		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}

	@Test
	public void searchBarTest() {

		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='search']")).isDisplayed());
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
