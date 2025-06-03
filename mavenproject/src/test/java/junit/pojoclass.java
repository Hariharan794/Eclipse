package junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class pojoclass extends baseclass {
	public pojoclass() { // non-parameter conStuctor
		PageFactory.initElements(driver, this);
	}

	// xPath
	@FindBy(xpath = "//a[text()='Sign up for Facebook']")
	private WebElement click;

	@FindBy(name = "firstname")
	private WebElement firstname;

	@FindBy(xpath = "(//input[@id='sex'])[2]")
	private WebElement opition;

	@FindBy(xpath = "//select[@name='birthday_day']")
	private WebElement date;

	@FindBy(id = "month")
	private WebElement month;

	@FindBy(xpath = "//select[@id='year']")
	private WebElement year;

	@FindBy(name = "reg_email__")
	private WebElement text;

	@FindBy(xpath = "//p[contains(text(),'By clicking ')]")
	private WebElement contain;

	@FindBy(xpath = "//input[@class='Pke_EE']")
	private WebElement instext;

	@FindBy(xpath = "//button[@class='_2iLD__']")
	private WebElement search;

	@FindBy(xpath = "(//div[@class='KzDlHZ'])[6]")
	private WebElement insearch;

	@FindBy(xpath = "(//div[text()='₹54,990'])[1]")
	private WebElement pic;

	public WebElement getPic() {
		return pic;
	}

	public WebElement getInsearch() {
		return insearch;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getInstext() {
		return instext;
	}

	public WebElement getContain() {
		return contain;
	}

	public WebElement getText() {
		return text;
	}

	public void setText(WebElement text) {
		this.text = text;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getOpition() {
		return opition;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getClick() {
		return click;
	}

}
