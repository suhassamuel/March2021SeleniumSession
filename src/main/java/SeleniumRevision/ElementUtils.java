package SeleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public void doSendKey(By locator, String value)

	{
		getElement(locator).sendKeys(value);

	}
	
	
	public List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}


}
