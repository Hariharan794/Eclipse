package Datadriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class executeclass extends baseclass{
	public static void main(String[] args) throws IOException {
				
		openedgebrowser();
		launchurl("https://www.facebook.com/login.php/");
		gettitle();
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		sendkeys(element, filltextbox("details", "sheet1", 2, 3));
		
	}

}
