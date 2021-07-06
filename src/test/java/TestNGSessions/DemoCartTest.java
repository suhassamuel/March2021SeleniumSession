package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCartTest {
	// global pre conditions
	// pre conditions
	// test steps + validations ( act vs exp)
	// post steps
	public WebDriver driver;

	public void login()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	@BeforeSuite
	public void setupDB() {
	
		System.out.println("@BeforeSuite: Set up db");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("@BeforeTest :Create USers");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("@BeforeClass : Launch the browser");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	@BeforeMethod
	public void logintoApp() {
		System.out.println("login to app");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		login();

	}

	@Test
	public void accountPageTitleTest() {
		String title = driver.getTitle();

		System.out.println("Page title is:" + title);
		Assert.assertEquals(title, "My Account");
	}

	@Test
	public void logoutLinkTest() {
		// driver.findElement(By.xpath("//a[text()='Logout' and
		// @class='list-group-item']")).

		// boolean flag = driver.findElement(By.linkText("Logout")).isDisplayed();

		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}

	@Test
	public void searchBarTest() {

		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='search']")).isDisplayed());
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("@AfterClass : Closing the browser");
		driver.quit();
	}
	
}
