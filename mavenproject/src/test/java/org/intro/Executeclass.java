package org.intro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Executeclass extends Baseclass {
	public static void main(String[] args) throws IOException {
		openedgebroswer();
		launchurl("https://www.facebook.com/login.php/");
		
		WebElement element = driver.findElement(By.xpath("//input[@name='pass']"));
		sendkeys(element,filltextbox("details", "Data1", 2, 3));
		
		
		
	}

}
