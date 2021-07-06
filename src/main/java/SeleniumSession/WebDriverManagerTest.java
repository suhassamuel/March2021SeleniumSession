package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		String title = driver.getTitle();

		System.out.println("Title is: " + title);

		if (title.equals("Google")) {
			System.out.println("Title is correct.. wow");
		} else {
			System.out.println("Title is Incorrect");
		}

	}

}
