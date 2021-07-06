package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ripple\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		
		System.out.println("Title is: "+title);
		
		if(title.equals("Google"))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is Incorrect");
		}

	
		
	}

}
