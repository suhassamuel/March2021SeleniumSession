package SeleniumRevision;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementGeneric {

	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtils br = new BrowserUtils();

		driver = br.initDriver("Chrome");

		br.launchUrl("https://www.amazon.ca/");

		String text = br.getTitle();
		System.out.println(text);

		// List<WebElement> linkLists = driver.findElements(By.tagName("a"));

		By link = By.tagName("a");

		List<WebElement> linkLists = getElements(link);

		System.out.println("Total links : " + linkLists.size());

		List<WebElement> linkListtxt = getLinkList(link);

		System.out.println("Total link list: " + linkListtxt.size());
		
		System.out.println("Total link with text: " + getLinkTextList(link));
		
		System.out.println("Total link count"+getLinksCount(link));
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getLinksCount(By locator)
	{
		return  getLinkTextList(locator).size();
	}

	public static List<String> getLinkTextList(By locator) {
		List<WebElement> list = getElements(locator);

		List <String> textList = new ArrayList<String>();
		
		for (WebElement ele : list) {
			String st = ele.getText();

			if (!st.isEmpty())
			{
				textList.add(ele.getText());
			}
		}

		return textList;
	}

	public static List<WebElement> getLinkList(By locator) {

		return getElements(locator).stream().filter(e -> !e.getText().isEmpty()).collect(Collectors.toList());
	}
}
