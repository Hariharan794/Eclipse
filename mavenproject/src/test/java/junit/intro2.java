package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import Pom.Baseclass;
import Pom.pojoclass;

public class intro2 extends Baseclass {
	@BeforeClass
	public static void bfrcls() {
		openedgebroswer();
		launchurl("https://www.facebook.com/login.php/");
	}
	@Before
	public void bfr() {
		date();
	}
	@Test
	public void ts() {
		gettitle();
		getcurrenturl();
		pojoclass pj = new pojoclass();
		WebElement username = pj.getUsername();
		sendkeys(username, "Hariharan");
		Assert.assertTrue("check userName", true);
		WebElement password = pj.getPassword();
		sendkeys(password, "2003");

	}
	@After
	public void aft() {
		date();
	}
	@AfterClass
	public static void aftcls() {
		toClose();
	}

}
