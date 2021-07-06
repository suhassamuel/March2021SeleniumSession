package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		driver = br.initDriver("Chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// html tag = select
		// we have to user select class in selenium

		 WebElement indus = driver.findElement(By.id("Form_submitForm_Industry"));

		// WebElement country = driver.findElement(By.id("Form_submitForm_Country"));

		 Select sel = new Select(indus);

		 sel.isMultiple();
		 
		 
		// sel.selectByIndex(8);
		// sel.selectByValue("Electronics");
		// sel.selectByVisibleText("Healthcare");
		// Select count = new Select(country);
		// count.selectByVisibleText("India");

		By indust = By.id("Form_submitForm_Industry");
		By Contry = By.id("Form_submitForm_Country");

		getElement(indust);
		doSelectDropdownByIndex(indust, 8);

		getElement(Contry);
		doSelectDropdownByIndex(Contry, 2);

		/*getElement(Contry);
		doSelectDropdownByValue(Contry, "India");*/
		
		getElement(Contry);
		doSelectDropdownByVisibleText(Contry, "Canada");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSelectDropdownByIndex(By locator, int index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}

	public static void doSelectDropdownByValue(By locator, String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}
	
	public static void doSelectDropdownByVisibleText(By locator , String text)
	{
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(text);
	}

}
