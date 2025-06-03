package tng_suite;

import org.testng.annotations.Test;

public class classC {
	@Test
	private void tc1() {
		System.out.println("Diva");
	}
	@Test(enabled=false)
	private void tc2() {
		System.out.println("Guna");
	}
	@Test
	private void tc3() {
		System.out.println("DhilliPrasath");
	}

}
