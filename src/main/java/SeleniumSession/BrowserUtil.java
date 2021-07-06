package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This method is initialized the driver on the basis of given browser name
 * 
 * @param BrowserName
 * @return this will return driver
 *
 */

public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method is used to init the driver
	 * @param BrowserName
	 * @return driver
	 */
	public WebDriver initDriver(String BrowserName) {
		switch (BrowserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

			break;

		default:
			System.out.println("Please pass right browser name..");
			break;
		}

		return driver;

	}
	/**
	 * This method is used to launch the url
	 * @param url
	 */
	
	public void launchUrl(String url)
	{
		
		
		if(url.isEmpty())
		{
			System.out.println("url is empty");
			return;
		}
		if(url.contains("http")|| url.contains("https"))
		{
			driver.get(url);
		}
		
	}
	
/**
 * This method is used to get the title name
 * @return title of the page (String)
 */
	public String doGetTitle()
	{
	
		return driver.getTitle();
	}
	
	
/**
 * This method is used to get page current URL	
 * @return current URL	(String)
 */
	 public String getPageCurrentUrl()
	 {
		 return driver.getCurrentUrl();
		 
	 }
	 
	 public void closeBrowser()
	 {
		 driver.close();
	 }
	 
	 
	 public void quitBrowser()
	 {
		 driver.quit();
	 }

}
