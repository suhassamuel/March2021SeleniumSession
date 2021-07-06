package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearchHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil br = new BrowserUtil();
		driver = br.initDriver("Chrome");
		br.launchUrl("https://www.google.com/");

		//By search = By.name("//input[@name='q']");
		
		By search = By.xpath("//input[@name='q']");


		driver.findElement(search).sendKeys("naveen automation labs");
		
		Thread.sleep(2000);
		
		List <WebElement> SuggestionList = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span"));

		System.out.println(SuggestionList.size());
		
		for(WebElement e : SuggestionList)
		{
			if (e.getText().equals("naveen automation labs udemy"))
			{
				e.click();
				
			}
		}
	}

}
