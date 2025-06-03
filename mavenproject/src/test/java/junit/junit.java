package junit;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class junit extends baseclass {
	@BeforeClass
	public static void bfrcls() {
		openedgebrowser();
		launchurl("https://www.facebook.com/login.php/");

	}

	@Before
	public void bfr() {
		Date d = new Date();
	}

	@Test
	public void ts() throws IOException {
		pojoclass pj = new pojoclass();
		WebElement click = pj.getClick();
		click.click();

		WebElement firstname = pj.getFirstname();
		sendkeys(firstname, "Hari");

		WebElement opition = pj.getOpition();
		opition.click();

		WebElement date = pj.getDate();
		sltopitiondate(date, 12);

		WebElement month = pj.getMonth();
		sltopitiondate(month, 2);

		WebElement year = pj.getYear();
		sltopitionyear(year, "2000");

		WebElement text = pj.getText();
		sendkeys(text, "Rocky bhai");

		WebElement contain = pj.getContain();
		contains(contain);

		navigate("https://www.flipkart.com/");

		WebElement instext = pj.getInstext();
		sendkeys(instext, "laptop 5g i5");

		WebElement search = pj.getSearch();
		search.click();

		WebElement insearch = pj.getInsearch();
		insearch.click();
		
		snap("hjk");

	}

	@After
	public void afr() {
		Date d = new Date();

	}
//	@AfterClass
//	public static void aftcls() {
//		Date d = new Date();
//	}

}
