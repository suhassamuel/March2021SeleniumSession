package SeleniumSession;



public class amazonTest {

	public static void main(String[] args) {

		String browserName = "chrome";

		BrowserUtil br = new BrowserUtil();

	    br.initDriver(browserName);

     	br.launchUrl("https://www.amazon.ca/");

		String title = br.doGetTitle();
		System.out.println("Title is: " + title);

		br.closeBrowser();

	}

}
