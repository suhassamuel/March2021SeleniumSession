package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

	static WebDriver driver;

	public static void main(String[] args) {

		String Browser = "fireFox";

		switch (Browser.toLowerCase()) {
		case "chrome":

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ripple\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();

			break;

		case "firefox":

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\ripple\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");

			driver = new FirefoxDriver();

			break;
		default:
			System.out.println("no browser found");
			break;
		}

		driver.get("https://www.google.com/");

		String title = driver.getTitle();

		System.out.println("Title is: " + title);

		if (title.equals("Google")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is Incorrect");
		}

	}

}
