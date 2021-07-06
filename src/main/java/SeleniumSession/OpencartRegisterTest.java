package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpencartRegisterTest {

	
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		
		String broswerName = "chrome";
		
		WebDriver driver = br.initDriver(broswerName);
		
		String url = "https://demo.opencart.com/index.php?route=account/register";
		br.launchUrl(url);
		
		By firstname = By.id("input-firstname");
		By lastname = By.name("lastname");
		By email = By.xpath("//*[@id=\"input-email\"]");
		By telephone = By.cssSelector("#input-telephone");
		By password = By.id("input-password");
		By confirmpwd= By.id("input-confirm");
    	By subscribeNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		
	//	By subscribeNo =  By.tagName("No");
		
		ElementUtil ele = new ElementUtil(driver);
		
		ele.doSendKeys(firstname, "check");
		ele.doSendKeys(lastname, "again");
		ele.doSendKeys(email, "test@test.com");
		ele.doSendKeys(telephone, "111212121");
		ele.doSendKeys(password, "test");
		ele.doSendKeys(confirmpwd, "test");
		ele.doClick(subscribeNo);
		
		
		
		

	}

}
