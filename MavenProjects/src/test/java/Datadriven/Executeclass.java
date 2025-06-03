package Datadriven;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Executeclass extends Baseclass{
	public static void main(String[] args) throws IOException {
		openedgebrowseer();
		launchurl("https://www.facebook.com/login.php/");

		pojoclass pj = new pojoclass();
		WebElement username = pj.getUsername();
		sendkeys(username, readfromexcel("Book2", "sheet1", 2, 3));
	}

}
