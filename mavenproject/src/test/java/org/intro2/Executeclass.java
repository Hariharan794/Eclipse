package org.intro2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Executeclass extends Bassclass {
	public static void main(String[] args) {
		openbrowser();
		launch("https://www.facebook.com/login.php/");
		getTitle();
		getcurrenturl();
		
	    
	}

}
