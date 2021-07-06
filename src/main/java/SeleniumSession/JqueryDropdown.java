package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JqueryDropdown {

	static WebDriver driver;

	public static void main(String[] args) {

		// justAnInputBox
		BrowserUtil br = new BrowserUtil();
		driver = br.initDriver("Chrome");
		br.launchUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		By choices = By.cssSelector("span.comboTreeItemTitle");

		// single selection
		// selectChoice(choices,"choice 2");

		// multiple selection
		//selectChoice(choices, "choice 1", "choice 2", "choice 2 1");

		// All selections
		selectChoice(choices, "automation_all");

	}

	public static void selectChoice(By locator, String... option) {
		List<WebElement> choiceList = driver.findElements(locator);
		System.out.println(choiceList.size());

		if (!option[0].equalsIgnoreCase("automation_all")) {

			for (int i = 0; i < choiceList.size(); i++) {
				String st = choiceList.get(i).getText();
				/*
				 * if (st.equals("choice 2")) { choiceList.get(i).click(); break; }
				 */
				for (int j = 0; j < option.length; j++) {
					if (st.equals(option[j])) {
						choiceList.get(j).click();
						break;
					}
				}
			}
		}
		else
		{
			try {
				for(WebElement e: choiceList)
				{
					e.click();
				}
				
			} catch (Exception e) {
				System.out.println("All options selected");
			}
			
		}
	}
}
