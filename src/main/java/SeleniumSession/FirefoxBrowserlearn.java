package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class FirefoxBrowserlearn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ripple\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		
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
