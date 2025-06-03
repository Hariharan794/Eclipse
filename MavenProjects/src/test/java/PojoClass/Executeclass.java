package PojoClass;

import org.openqa.selenium.WebElement;

public class Executeclass extends Baseclass {
	public static void main(String[] args) {
		openedgebrowseer();
		launchurl("https://www.facebook.com/login.php/");
		gettitle();
		getcurrenturl();
		
		pojoclass pj = new pojoclass();
		WebElement useername = pj.getUseername();
		sendkeys(useername, "Hariharan");
		
		WebElement password = pj.getPassword();
		sendkeys(password, "132003");
		
		WebElement click = pj.getClick();
		click.click();
		
		
		
		
	}

}
