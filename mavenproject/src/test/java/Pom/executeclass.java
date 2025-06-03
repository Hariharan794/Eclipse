package Pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class executeclass extends Baseclass {
	public static void main(String[] args) throws IOException {
		openedgebroswer();
		launchurl("https://www.facebook.com/login.php/");
		
		pojoclass pj = new pojoclass();
		WebElement username = pj.getUsername();
		sendkeys(username, "sdfghjkl;");
		
//		WebElement password = pj.getPassword();
//		sendkeys(password, filltextbox("Book1", "details", 2, 2));
//		
//		WebElement button = pj.getButton();
//		toclick(button);	
		
		WebElement click = pj.getClick();
		toclick(click);
		
	WebElement firstname = pj.getFirstname();
	sendkeys(firstname, "Rocky");
	
	WebElement ratiobutton = pj.getRatiobutton();
	toclick(ratiobutton);
	
	
	
	
	
	
	
	
	}

}
