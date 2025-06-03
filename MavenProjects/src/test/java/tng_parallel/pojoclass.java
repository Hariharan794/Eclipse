package tng_parallel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoclass extends Baseclass {
	public pojoclass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUsername() {
		return username;
	}

}
