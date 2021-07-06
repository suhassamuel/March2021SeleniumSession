package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount=5)
	public void registration()
	{
		System.out.println("registration");
	}
}
