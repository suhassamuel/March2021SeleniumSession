package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownHandleWithoutSelectclass {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		driver = br.initDriver("Chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		/*
		 * By indust = By.id("Form_submitForm_Industry"); By Contry =
		 * By.id("Form_submitForm_Country");
		 */

		/*List<WebElement> indu = driver.findElements(By.xpath("//select[@id=\"Form_submitForm_Industry\"]/option"));

		for(WebElement e : indu)
		{
			if(e.getText().equals("Education"))
			{
				e.click();
				break;
			}
		}*/
		
		
		By indusOption= By.xpath("//select[@id=\"Form_submitForm_Industry\"]/option");
		String value= "Education";
		selectDropdownValue(indusOption,value);
		
	}
	
	public static void selectDropdownValue(By locator, String value)
	{
		List<WebElement> dropdownValues = driver.findElements(locator);

		for(WebElement e : dropdownValues)
		{
			if(e.getText().equals(value))
			{
				e.click();
				break;
			}
		}	
	}

}
