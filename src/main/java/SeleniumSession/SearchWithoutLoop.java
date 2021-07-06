package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchWithoutLoop {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil br = new BrowserUtil();
		driver = br.initDriver("Chrome");
		br.launchUrl("http://automationpractice.com/");

			
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(4000);

 // //div[@class='ac_results']//li[text()='T-shirts > Faded Short Sleeve T-shirts']
		
		
		selectValueFromSuggList("T-shirts > Faded Short Sleeve T-shirts");
	}
	public static void selectValueFromSuggList(String value) throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='ac_results']//li[text()='" + value + "']")).click();
				
		Thread.sleep(2000);
		//	String st= driver.findElement(By.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4']")).getText();
		String st = driver.findElement(By.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4']/h1")).getText();
				
		if(st.contains("Faded Short Sleeve T-shirts"))
		{
			System.out.println("verified");
		}
		else
		{
			System.out.println("ohh no");
		}
	}

}
