package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	public WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public List<WebElement> doGetElements(By locator) {
		return driver.findElements(locator);

	}

	public void verifyElementPresent(By locator) {
		List<WebElement> lstElements = doGetElements(locator);

		try {
			if (lstElements.size() == 0) {

				throw new Exception("ELEMENTNOTPRESENT");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/********** Dropdown utils for Select class *********************/

	public void doSelectDropdownByIndex(By locator, int index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}

	public void doSelectDropdownByValue(By locator, String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}

	public void doSelectDropdownByVisibleText(By locator, String text) {
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(text);
	}

	public List<String> doGetAllDropdownOptions(By locator) {
		List<String> optionTextList = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> Option = select.getOptions();
		for (WebElement e : Option) {
			String text = e.getText();
			optionTextList.add(text);
		}
		return optionTextList;
	}

	/**
	 * With using Select Class
	 * @param locator
	 * @param value
	 */
	public void doSelectValue(By locator, String value) {
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

	/**
	 * Without using Select Class
	 * @param locator
	 * @param value
	 */
	public void selectDropdownValue(By locator, String value) {
		List<WebElement> dropdownValues = doGetElements(locator);

		for (WebElement e : dropdownValues) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}

}
