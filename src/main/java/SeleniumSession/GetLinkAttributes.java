package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetLinkAttributes {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();

		driver = br.initDriver("Chrome");

		br.launchUrl("https://www.amazon.ca/");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		System.out.println("Total links : " + linkList.size());

		// Exclude all blank href and null href
		for (WebElement e : linkList) {

			String st = e.getAttribute("href");

			try {
				if (!st.contains("null") == true && !st.isEmpty()) {
					System.out.println(st);
				}

			} catch (Exception e2) {

			}

		}

		System.out.println("======================");

		List<WebElement> lstImage = driver.findElements(By.tagName(("img")));

		System.out.println(lstImage.size());

		for (WebElement e1 : lstImage) {
			String srcVal = e1.getAttribute("src");
			String srcAlt = e1.getAttribute("alt");

			System.out.println(srcVal + srcAlt);
		}

	}

	public static List<WebElement> doGetElements(By locator) {
		return driver.findElements(locator);

	}

	public static void verifyElementPresent(By locator) {
		List<WebElement> lstElements = doGetElements(locator);

		try {
			if (lstElements.size() == 0) {

				throw new Exception("ELEMENTNOTPRESENT");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
