package Datadriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoclass extends Baseclass {
	public pojoclass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

}
