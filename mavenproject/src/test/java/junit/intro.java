package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class intro {
	@BeforeClass
	public static void bfrcls() {
		System.out.println("Start1");
	}
	@After
	public void aft() {
		System.out.println("start4");
	}
	@Test
	public void ts1() {
		System.out.println("start3.1");
	}
	@Test
	public void ts2() {
		System.out.println("start3.2");
	}
	@Before
	public void bfr() {
		System.out.println("Start2");
	}
	@AfterClass
	public static void aftcls() {
		System.out.println("start5");
	}

}
