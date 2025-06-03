package tng_suite;

import org.testng.annotations.Test;

public class classB {
	@Test
	private void tc1() {
		System.out.println("Aswin");
	}
	@Test(invocationCount=2)
	private void tc2() {
		System.out.println("Balaji");
	}
	@Test
	private void tc3() {
		System.out.println("Manikandan");
	}

}
