package SeleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtils br = new BrowserUtils();

		driver = br.initDriver("Chrome");

		br.launchUrl("https://www.amazon.ca/");

		String text = br.getTitle();
		System.out.println(text);

		List<WebElement> linkLists = driver.findElements(By.tagName("a"));

		System.out.println("Total number of links: " + linkLists.size());

	/*	for (int i = 0; i < linkLists.size(); i++) {
			String st = linkLists.get(i).getText();

			if (!st.isEmpty()) {
				System.out.println(st);
			}

		}*/
		
		
		
		for(WebElement e : linkLists)
		{
			if(!e.getText().isEmpty())
			{
			System.out.println(e.getText());
			}
		}

	}

}
