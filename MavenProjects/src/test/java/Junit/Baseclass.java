package Junit;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

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
	public static void close() {
		driver.close();
	}
	public static String readfromexcel(String Filename,String sheetname,int row1,int cell1 ) throws IOException {
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\MavenProjectPratice\\Excel\\"+Filename+".xlsx");
		FileInputStream read = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(read);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(row1);
		Cell cell = row.getCell(cell1);
		
				int cellType = cell.getCellType();			//string -- 1 , 0 -- numeric/date
				
				String data;
				
				if (cellType==1) {
				    data = cell.getStringCellValue();
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
					data = sim.format(dateCellValue);
					
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					long l =(long)numericCellValue;
					System.out.println(l);
					
				    data = String.valueOf(l);
					
					
				}
//				System.out.println(data);
				return data;
			}
	public static void Dat() {
		Date d = new Date();
		System.out.println(d);
	}
	public static void day(WebElement ref,int val) {
		Select s1 = new Select(ref);
		s1.selectByIndex(val);

	}

		
	
	
	
}	


