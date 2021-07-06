package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	public void dologin() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Test
	public void pageTitleTest() {
		dologin();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "My Account");
	}

	
}
