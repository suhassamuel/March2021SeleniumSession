package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCard {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/new-zealand-in-england-2021-1249202/england-vs-new-zealand-2nd-test-1249211/full-scorecard");
	//	driver.manage().window().maximize();
		
		System.out.print("Joe Root: ");
		System.out.print(getWicketTakerName("Joe Root")+":");
		
		/*List<String> ss = getdetails("Joe Root");
		
		for(String s : ss)
		{
			System.out.print(s+ " ");
		}*/
		
	

		getdetails("Joe Root").stream().forEach(e->System.out.print(e+" "));
				
		System.out.println("-----------");
		System.out.print("Matt Henry: ");
		
		getBowlingDetails("Matt Henry").stream().forEach(e ->System.out.print(e+" "));
	}

	public static String getWicketTakerName(String batsman) {
		return driver
				.findElement(By.xpath(
						"(//a[text()='" + batsman + "'])[3]/parent::td/following-sibling::td[@class='text-left']/span"))
				.getText();

	}

	public static List<String> getdetails(String batsman) {
		// (//a[text()='Joe Root'])[3]/parent::td/following-sibling::td
		
		List<String> scoreValList = new ArrayList<>();
		List<WebElement> scoreList = driver
				.findElements(By.xpath("(//a[text()='"+batsman+"'])[3]/parent::td/following-sibling::td"));
		
		for (int i=1;i<scoreList.size();i++)
		{
			String st= scoreList.get(i).getText();
			scoreValList.add(st);
		}
		return scoreValList;

	}
		

	
	public static List<String> getBowlingDetails(String BowlerName)
	{
		// (//a[text()='Matt Henry'])[3]/parent::td/following-sibling::td
		
		List<String> BolwingStatsVal = new ArrayList<String>();
		
		List<WebElement> BolwingStats = driver.findElements(By.xpath("(//a[text()='Matt Henry'])[3]/parent::td/following-sibling::td"));
		
		
		for(int i=0;i<BolwingStats.size();i++)
		{
			String st = BolwingStats.get(i).getText();
			
			if (!st.isEmpty()) 
			{
				BolwingStatsVal.add(st);
			}
			
		}
		return BolwingStatsVal;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
