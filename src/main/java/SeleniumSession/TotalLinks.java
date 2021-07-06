package SeleniumSession;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinks {
	/**
	 * get the total links get the text of all links but exclude the blank text
	 * 
	 */

	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();

		driver = br.initDriver("Chrome");
		br.launchUrl("https://www.amazon.ca/");

		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		System.out.println("total links: " + linkList.size());

		// 1.index based loop
		/*
		 * for (int i = 0; i < linkList.size(); i++) { String text =
		 * linkList.get(i).getText();
		 * 
		 * if (!text.isEmpty()) { System.out.println(text); } }
		 */

		// 2. for each
		/*
		 * for (WebElement e : linkList) { String text = e.getText();
		 * 
		 * if (!text.isEmpty()) { System.out.println(text); }
		 * 
		 * }
		 */

		// 3. stream : sequential

		long stTime = System.currentTimeMillis();
		linkList.stream().filter(e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));

		long endTime = System.currentTimeMillis();

		System.out.println("======== sequential =====================");
		System.out.println(endTime - stTime);
		System.out.println("=============================");

		// 4. stream.parallel

		long stTime1 = System.currentTimeMillis();

		linkList.parallelStream().filter(e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
		long endTime1 = System.currentTimeMillis();

		System.out.println("=========parallel ====================");
		System.out.println(endTime1 - stTime1);
		System.out.println("=============================");
	}

}
