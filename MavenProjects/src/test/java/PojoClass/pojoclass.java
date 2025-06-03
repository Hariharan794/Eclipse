package PojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoclass extends Baseclass {					
	//1.non-parameter constructor
	
	public pojoclass() {
		PageFactory.initElements(driver, this);
	}
	
	//2.private WebElement
	@FindBy(xpath="//input[@name='email']")
	private WebElement useername;
	
	@FindAll({
		@FindBy(xpath="//input[@id='pass']"),
		@FindBy(name="pass")
	})
	private WebElement password;
	
	@FindBy(xpath="//a[text()='Sign up for Facebook']")
	private WebElement click;
	
	//3.getters to access those private webElement outside the Class

	public WebElement getUseername() {
		return useername;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClick() {
		return click;
	}
	

}
