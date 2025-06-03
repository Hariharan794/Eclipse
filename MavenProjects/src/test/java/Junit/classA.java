package Junit;

import org.junit.Ignore;
import org.junit.Test;

public class classA {
	@Test
	@Ignore
	public void tc1() {
		System.out.println("testcase-1");
	}
	@Test
	public void tc2() {
		System.out.println("testcase-2");
	}

}
