package tng_intro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class priority {
	@BeforeMethod
	private void bfrm() {
		System.out.println("Testcase-2");
	}
	@Test(priority=-1)
	private void tc1() {
		System.out.println("A");
	}
	@Test(priority=0)
	private void tc2() {
		System.out.println("D");
	}
	@Test(priority=3)
	private void tc3() {
		System.out.println("c");
	}
	@Test(priority=5)
	private void tc4() {
		System.out.println("B");
	}
	@BeforeClass
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
