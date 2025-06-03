package tng_suite;

import org.testng.annotations.Test;

public class classA {
	@Test
	private void tc1() {
		System.out.println("Rocky bhai");
	}
	@Test
	private void tc2() {
		System.out.println("Hariharan");
	}
	@Test(priority=-1)
	private void tc3() {
		System.out.println("Dhana");
	}
	
}
