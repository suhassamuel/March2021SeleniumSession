package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//By.xpath(xpathExpression)
		
		// Xpath: address of the element : mainly used when By.id or By.name 
		//1. Absolute Xpath : parent to child to child : 
		// e.g. /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
		//2. Relative xpath :use with some Xpath functions and attributes
		
		//     	//htmltag[@attr='value']
		// 		 //input[@id='input-email'] 
				// //input[@name='email']
		//     	//htmltag[@attr1='value' and @attr2='value']
		//		//htmltag[@attr1='value' or  @attr2='value']
		//	  //input[@name='email' and @id='input-email']
			// //input[@name='email' or @id='input-email']
			// //input[@value='Login']
		
		//text() : links, header,span, label
		//htmltag[text()='value']
		// where text() is a function so do NOT type @test()
		// //h2[text()='New Customer']  (https://demo.opencart.com/index.php?route=account/login)
		// //h3[text()='Group Calendar'] (https://classic.freecrm.com/index.html)
		

		// contains()  : can be applied with text() or any attribute 
		//htmltag[contains(@id,'value')]
		// //input[contains(@id,'input-email')]
		// //input[contains(@id,'email')]

		//dynamic attributes(id)
		// <input id = firstname_123>
		// <input id = firstname_456>
		// <input id = firstname_789>
		//input[contains(@id='firstname_')] 
		
		// contains with text()
		// //input[contains(text(),'firstname_')]
		// https://www.freshworks.com/
		// //h2[contains(text(),'Refreshing business')]
		//input[contains(text(),'firstname_') and contains(@attr,'value')]
		// //a[contains(text(),'Customer First')]
		// //a[contains(text(),'Customer First') and contains(@href,'first-summit')]
		
		//>> contains() used attr, comma i.e. @id, and for attr used @id = 
		//htmltag[@attr1='value' and contains(@attr2,'value')]
		//https://classic.freecrm.com/index.html
		//input[@type='submit' and contains(@class,'btn-small')]
		//input[@type='submit' and contains(@value,'Login')]
		
		//starts-with(): can be applied for any html tag , partial text only applys for link
		// https://www.freshworks.com/ 
		//h2[starts-with(text(),'Refreshing')]
		//https://demo.opencart.com/index.php?route=account/login
		//input[starts-with(@value,'Log')]
		
		//htmltag[contains(@attr1,'value') and starts-with(@attr2, 'value')]
		//https://demo.opencart.com/index.php?route=account/login
		//input[starts-with(@value,'Log') and contains(@value,'Login')]
		//input[starts-with(@value,'Log') and contains(@value,'Login') and @value='Login']
		
		//index point of view
		// (//input[@type='text'])[1]
		// it is called captured group () and provide index
		// (//input[@type='text'])[position()][1]
		// it is called captured group () and position
		// last() --> it goes to last element of the index
		// (//input[@type='text'])[last()]
		
		
		// to get the list of links from footer section.
		// //ul[@class='footer-nav']
		// (//ul[@class='footer-nav'])[1]//a
		// (//ul[@class='footer-nav'])[position()][1]//a
		// last link
		// (//ul[@class='footer-nav'])[position()][last()]//a
		// ((//ul[@class='footer-nav'])[position()][1]//a)[last()]
		// ((//ul[@class='footer-nav'])[position()][3]//a)[last()]
		
		for (int i=1;i<=4;i++)
		{
			String xpath = "((//ul[@class='footer-nav'])[position()]["+i+"]//a)[last()]";
			System.out.println(xpath);
		}
		
	 // form-control private-form__control login-email
		driver.findElement(By.className("//input[@class='form-control private-form__control login-email']"));
		
	// wrong one: beacuse multiple classes
		//driver.findElement(By.className("form-control private-form__control login-email"));
		
		driver.findElement(By.className("form-control"));
		
		// backward traversing
		// child to parent : //input[@id='username']/../../../../../../../../../..
		//input[@id='username']/parent::div
		
		//child to parent to parent : //input[@id='username']/../../../../../../../../../..
		// child to grandparent (ancestors) : //input[@id='username']/ancestor::div
		
		
		// parent to child
		//div[@class='form-group']/input[@type='text']
		//div[@class='form-group']/label[text()='E-Mail Address']
		//div[@class='form-group']/input[@name='email']
		
		
		//siblings
		
		
		
		
		
		
		
		
		
	}

}
