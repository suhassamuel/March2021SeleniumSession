package SeleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumSession.BrowserUtil;

public class SearchWithLoop_Assignment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil br = new BrowserUtil();
		driver = br.initDriver("Chrome");
		br.launchUrl("http://automationpractice.com");

		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(2000);
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='ac_results']//li"));

		for (WebElement ele : ls) {
			String s = ele.getText();
			if (s.equals("T-shirts > Faded Short Sleeve T-shirts")) {
				ele.click();
				break;
			}

		}

	}

}
