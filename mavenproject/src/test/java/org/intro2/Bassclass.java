package org.intro2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bassclass {
	 static WebDriver driver;
	
	public static void openbrowser() {
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	}
	public static void launch(String url) {
		driver.get(url);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void fillbox(WebElement ref , String val) {
		ref.sendKeys(val);
	}

}
