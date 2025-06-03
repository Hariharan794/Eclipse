package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class pojoclass extends Baseclass {
	//1.non-parameter constructor
	public pojoclass() {
		PageFactory.initElements(driver, this);
	}
	//2.private webElements
	@FindBy(id="email")
	private WebElement username;
	
	@FindBys({
		@FindBy(name="pass"),
		@FindBy(xpath="//input[@id='pass']")
	})
	private WebElement password;
	
	@FindAll({
		@FindBy(xpath="//button[@value='1']"),
		@FindBy(id="loginbuttn")
	})
	private WebElement button;
	
	@FindBy(xpath="//a[text()='Sign up for Facebook']")
	private WebElement click;
	
	
	@FindAll({
		@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"),
		@FindBy(name="firstname")
	})
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@id='sex'])[2]")
	private WebElement ratiobutton;
	
	@FindBy(name="birthday_day")
	private WebElement select;
	
	public WebElement getSelect() {
		return select;
	}

	public WebElement getRatiobutton() {
		return ratiobutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getClick() {
		return click;
	}

	public void setClick(WebElement click) {
		this.click = click;
	}

	//3.getters to access those private webElements outside the class
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return button;
	}

}
