package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownGetAllOptions {

	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		driver = br.initDriver("Chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By indust = By.id("Form_submitForm_Industry");
		By Contry = By.id("Form_submitForm_Country");

		/*
		 * Select sel = new Select(getElement(indust)); List<WebElement> indus_Option =
		 * sel.getOptions(); System.out.println(indus_Option.size());
		 * 
		 * for (int i = 0; i < indus_Option.size(); i++) {
		 * System.out.println(indus_Option.get(i).getText());
		 * 
		 * }
		 */

		/*
		 * Select sel1 = new Select(getElement(Contry)); List<WebElement> Country_Option
		 * = sel1.getOptions(); System.out.println(Country_Option.size());
		 * 
		 * System.out.println("for each============="); for(WebElement e :
		 * Country_Option ) { System.out.println(e.getText()); }
		 */
		doGetAllDropdownOptions(indust);
		doGetAllDropdownOptions(Contry);

		if (doGetAllDropdownOptions(indust).size() == 21) {
			System.out.println("test pass");
		}

		if (doGetAllDropdownOptions(indust).contains("Education")) {
			System.out.println("test pass");
		}

		doSelectValue(indust, "Education");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> doGetAllDropdownOptions(By locator) {
		List<String> optionTextList = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> Option = select.getOptions();
		for (WebElement e : Option) {
			String text = e.getText();
			optionTextList.add(text);
		}
		return optionTextList;
	}

	public static void doSelectValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> Option = select.getOptions();
		for (WebElement e : Option) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}
}
