package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpencartTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		
	   WebDriver driver =	br.initDriver("Chrome");
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		System.out.println(br.doGetTitle());
		
		ElementUtil ele = new ElementUtil(driver);
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ele.doSendKeys(email, "qq");
		ele.doSendKeys(password, "zzz");

	}

}
