package junit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class baseclass {
	 public static WebDriver driver;
	 
	public static void openedgebrowser() {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();

	}
	public static void launchurl(String url) {
		driver.get(url);

	}
	public static void gettitle(String title) {
		title= driver.getTitle();
		System.out.println(title);

	}
	public static void sendkeys(WebElement driver, String val) {
		driver.sendKeys(val);

	}
	public static void toclick(WebElement cli) {
		cli.click();
	}
	public static void sltopitiondate(WebElement dri,int val) {
		Select s = new Select(dri);
		s.selectByIndex(val);
	}
	public static void sltopitionyear(WebElement dri,String val) {
		Select s = new Select(dri);
		s.selectByValue(val);
	}
	public static void contains(WebElement dri) {
		System.out.println(dri.getText());
	}
	public static void navigate(String val) {
		driver.navigate().to(val);
	}
	public static void snap(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\mavenproject\\snap\\"+name+".png");
		FileUtils.copyFile(screenshotAs, f);
	}
	
	
	

}
