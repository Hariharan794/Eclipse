package Junit.intro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class classA {
	@Before
	public void bfr() {
		System.out.println("start");
	}
	@After
	public void afr() {
		System.out.println("stop");
	}
	@BeforeClass
	public static void bfrcls() {
		System.out.println("get ready");
	}
	@AfterClass
	public static void aftcls()	 {
		System.out.println("time off");
	}
	@Test
	public void tc1() {
		System.out.println("Run");
	}

}
