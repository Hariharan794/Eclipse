package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class junit extends Baseclass {
	
	@Before
	public void bfr() {
		Dat();
		
	}
	@BeforeClass
	public static void bfrcls() {
		openedgebrowseer();
		launchurl("https://www.facebook.com/login.php/");
	}
	@After
	public void aft() {
		Dat();
	}
	
	@AfterClass
	@Ignore
	public static void aftcls() {
		close();
	}
	
	@Test
	public void tc1() {
		pojoclass pj = new pojoclass();
		WebElement click = pj.getClick();
		click.click();
		
		WebElement firstname = pj.getFirstname();
		sendkeys(firstname, "Bhai");
		
		WebElement date = pj.getDate();
		day(date, 4);
		
				
	}

}
