package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	//AAA
	@Test
	public void loginTest()
	{
		System.out.println("loginTest");
		//int i = 9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void homepageTest()
	{
		System.out.println("homepageTest");
	}
	@Test(dependsOnMethods="loginTest")
	public void cartPageTest()
	{
		System.out.println("cartPageTest");
	}

}
