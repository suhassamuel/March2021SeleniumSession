package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	static  WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		//a[text()='Shailesh Kumar']/parent::td
		//a[text()='Shailesh Kumar']/..
		
		//driver.findElement(By.xpath("//a[text()='Shailesh Kumar']/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
		selectContact("Shailesh Kumar");
		selectContact("Aliss Jeyhun");
		
		   //a[text()='Shailesh Kumar']/parent::td/preceding-sibling::td/input[@type='checkbox']
		  //a[text()='Shailesh Kumar']/../preceding-sibling::td/input[@type='checkbox']
		  //a[text()='Shailesh Kumar']/../preceding-sibling::td/input[@type='checkbox']
		  //a[text()='Shailesh Kumar']/parent::td/preceding-sibling::td/input[@name='contact_id']
		
		//	selectCompanyName("Shailesh Kumar");
		
		System.out.println(selectCompanyName("Shailesh Kumar"));
		System.out.println(selectCompanyName("Aliss Jeyhun"));
		
		getDetails("Shailesh Kumar");
	}
	
	public static void selectContact(String name)
	{
		driver.findElement(By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
				
	}
	
	public static String selectCompanyName(String name)
	{
	
		return driver.findElement(By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	
	public static List<String> getDetails(String name)
	{
		// //a[text()='Shailesh Kumar']/parent::td/following-sibling::td
		
		List<String> st = new ArrayList<String>();
		
		
		 st.add(driver.findElement(By.xpath("//a[text()='Shailesh Kumar']/parent::td/following-sibling::td")).getText());
		 
		 return st;
		
	}

}
