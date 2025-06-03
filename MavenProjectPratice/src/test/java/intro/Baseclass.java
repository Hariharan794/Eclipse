package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	static WebDriver driver;

	public static void openedgebrowseer() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	public static void launchurl(String url) {
		driver.get(url);
	}
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void sendkeys(WebElement ref,String val) {
		ref.sendKeys(val);
	}
	public static void toclick(WebElement ref) {
		ref.click();
	}
	
	
	

}
