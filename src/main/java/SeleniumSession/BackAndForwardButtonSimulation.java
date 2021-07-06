package SeleniumSession;

import org.openqa.selenium.WebDriver;

public class BackAndForwardButtonSimulation {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.ca/");

		System.out.println("url title: "+driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println("Now url title is:"+driver.getTitle());
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println("Page refreshed... ");
	}

}
