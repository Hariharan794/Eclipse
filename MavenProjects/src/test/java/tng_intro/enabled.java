package tng_intro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class enabled {
	@BeforeMethod
	private void bfrm() {
		System.out.println("Testcase-2");
	}
	@Test
	private void tc1() {
		System.out.println("Testcase-3");
	}
	@BeforeClass(enabled=false)
	private void bfrcls() {
		System.out.println("Testcase-1");
	}
	@AfterClass
	private void aftcls() {
		System.out.println("Testcase-5");
	}
	@AfterMethod
	private void aftm() {
		System.out.println("Testcase-4");
	}

}
