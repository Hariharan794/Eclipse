package Junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoclass extends Baseclass {
	public pojoclass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Sign up for Facebook']")
	private WebElement click;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement date;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement month;
	
	@FindBy(name="birthday_year")
	private WebElement year;
	
	

	public WebElement getClick() {
		return click;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}
	
	
}
