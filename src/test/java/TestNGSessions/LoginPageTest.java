package TestNGSessions;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
	@Test
	public void registerLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
	}

	@Test
	public void rewardPointsTest() {

		Assert.assertTrue(driver.findElement(By.linkText("Reward Points")).isDisplayed());
	}

}
