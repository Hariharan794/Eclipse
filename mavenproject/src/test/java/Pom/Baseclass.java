package Pom;

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
	
	 static WebDriver driver;
	 static  Alert al;
	 
	
	public static void openedgebroswer() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	public static  void launchurl(String url) {
		driver.get(url);
	}
	
	
	public static void toclick(WebElement dri ) {
		dri.click();
	}
	public static void selectopition(WebElement slt,String value) {
		Select  s = new Select(slt);
		s.selectByValue(value);
	}
	public static void date() {
		Date d = new Date();
		System.out.println(d);
	}
	
	
	
	public static void sendkeys(WebElement send,String val) {

		send.sendKeys(val);
		
	}
	
	public static  void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static  void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
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
	public static String filltextbox(String name,String names,int rows,int cells) throws IOException {
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\mavenproject\\Excell\\"+name+".xlsx");
		
		FileInputStream read = new FileInputStream(f);
		
		Workbook wb =new XSSFWorkbook(read);
		
		Sheet sheet = wb.getSheet(names);
		
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
	

