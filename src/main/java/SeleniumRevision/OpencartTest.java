package SeleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpencartTest {

	public static void main(String[] args) {

		BrowserUtils br = new BrowserUtils();

		String browser = "chrome";
		WebDriver driver = br.initDriver(browser);

		String url = "https://demo.opencart.com/index.php?route=account/login";

		br.launchUrl(url);
		System.out.println(br.getTitle());
		
		
		ElementUtils ele = new ElementUtils(driver);
		
		By email = By.id("input-email");
		
		By pwd = By.id("input-password");
		
		ele.doSendKey(email, "test..");
		ele.doSendKey(pwd, "checking");
	}

}
