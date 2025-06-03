package org.intro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	  public static WebDriver driver;
	  public static  Alert al;
	
	public static void openedgebroswer() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	public static  void launchurl(String url) {
		driver.get(url);
	}
	
	
	public static void login(WebElement user,String val) {

		
		
	}
	
	

	public static void sendkeys(WebElement dri ,String val) {
		dri.sendKeys(val);
	}
	
	public static  void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static  void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static  void valuess() {
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		element.sendKeys("hariharan@234");
        String attribute = element.getAttribute("value");
        System.out.println(attribute);
        
        WebElement element2 = driver.findElement(By.xpath("//input[@id='pass']"));
        element2.sendKeys("233055");
        String attribute2 = element2.getAttribute("value");
        System.out.println(attribute2);
	}
	public static  void click() {
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	}
	public static  void sendsvalue() {
		WebElement element = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
        element.sendKeys("hari");
	}
	public void select() {
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(element);
		s1.selectByIndex(12);
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(element2);
		s2.selectByIndex(2);
		
		WebElement element3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(element3);
		s3.selectByValue("2000");
	}
	
	public static  void toClose() {
		driver.close();
	}
	
	public static  void alertok() {
	    al = driver.switchTo().alert();
		al.accept();
	}
	
	public static  void alertcancel() {
	    al = driver.switchTo().alert();
		al.dismiss();
	}
	public static String filltextbox(String name,String sheetname,int rows,int cells) throws IOException {
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\mavenproject\\Excell\\"+name+".xlsx");
		
		FileInputStream read = new FileInputStream(f);
		
		Workbook wb =new XSSFWorkbook(read);
		
		Sheet sheet = wb.getSheet(sheetname);
		
		Row row = sheet.getRow(rows);
		
		Cell cell = row.getCell(cells);
		int cellType = cell.getCellType();
		
		String data;
		
		if (cellType==1) {
			 data = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
//			System.out.println(dateCellValue);
			
			SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
			 data = s.format(dateCellValue);
//			System.out.println(format);
		}else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long)numericCellValue;
//			System.out.println(l);
			 data = String.valueOf(l);
		}
		return data;
	}
	
	}
	

