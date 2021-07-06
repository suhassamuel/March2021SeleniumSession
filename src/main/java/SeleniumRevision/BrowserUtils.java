package SeleniumRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	WebDriver driver;

	public WebDriver initDriver(String browser) {

		switch (browser.toLowerCase()) {
		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;

		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			break;

		default:

			System.out.println("please pass the correct browser");
			break;
		}
		return driver;
	}

	public void launchUrl(String url) {
		if (url.isEmpty()) {
			System.out.println("url is empty");
	
		}

		if (url.contains("http") || url.contains("https")) {

			driver.get(url);
		}

	}

	public String getTitle() {
		return driver.getTitle();
	}

}
