package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		// this will start the chrome driver server
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ripple\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		// session id generated when initialized the driver
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		System.out.println(driver.getCurrentUrl());
		driver.quit(); // this will make driver's session id null
		 
		//driver.close(); // this will keep the session id but will make it invalid
		System.out.println(driver.getTitle());
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println( driver.getTitle());
	}

}
