package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityTestConcept {

	@Test (priority=2)
	public void test_1() {
		System.out.println("test_1");
	}

	@Test(priority=1)
	public void test_2() {
		System.out.println("test_2");
	}

	@Test(priority=3)
	public void test_3() {
		System.out.println("test_3");
	}

	@Test(priority=4)
	public void test_4() {
		System.out.println("test_4");
	}

	@Test(priority=5)
	public void test_5() {
		System.out.println("test_5");
	}

	@Test //(priority=6)
	public void test_6() {
		System.out.println("test_6");
	}
	@Test (enabled=false)
	public void test_7() {
		System.out.println("test_7");
	}

	@Test (enabled=false)
	public void test_8() {
		System.out.println("test_8");
	}


}
