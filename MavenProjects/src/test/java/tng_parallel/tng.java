package tng_parallel;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tng extends Baseclass {
	@BeforeClass
	private void bfr() {
		openedgebrowseer();
		launchurl("https://www.facebook.com/login.php/");
	}
	@BeforeMethod
	private void bfrm() {
		getdate();
	}
	@Parameters({"Email","password"})
	@Test
	private void tc1(String val1,String val2) {
		pojoclass pj = new pojoclass();
		WebElement username = pj.getUsername();
		sendkeys(username,val1 );
		
		WebElement password = pj.getPassword();
		sendkeys(password, val2);
	}
	@AfterMethod
	private void aftm() {
		getdate();
	}
	@AfterClass(enabled=false)
	private void aft() {
		toclose();
	}

}
