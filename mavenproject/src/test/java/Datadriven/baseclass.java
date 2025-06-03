package Datadriven;

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

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class baseclass {
	static WebDriver driver;
	private static String data;

	public static void openedgebrowser() {
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
	public static  void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println();

	}
	public static void sendkeys(WebElement dri, String val) {
		dri.sendKeys(val);
	}
	public static String filltextbox(String filename,String sheetname,int row,int cell ) throws IOException {
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\mavenproject\\Excell\\"+filename+".xlsx");
		FileInputStream read = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(read);
		Sheet sheet = wb.getSheet(sheetname);
		Row row1 = sheet.getRow(row);
		Cell cell1 = row1.getCell(cell);
		int cellType = cell1.getCellType();
//		-----------------------------------------
//		String data;
//		if (cellType==1) {
//			data = cell1.getStringCellValue();
//			System.out.println(data);
//		}
//		else if (DateUtil.isCellDateFormatted(cell1)) {
//			Date dateCellValue = cell1.getDateCellValue();
//			SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
//			data = sim.format(dateCellValue);
//			System.out.println(data);
//			
//		}
//		else {
//			double numericCellValue = cell1.getNumericCellValue();
//			long l =(long)numericCellValue;
//			System.out.println(l);
//			data = String.valueOf(l);
//		}
//		return data;
//		----------------------------------------------
		String data;
		if (cellType==1) {
			data = cell1.getStringCellValue();
			System.out.println(data);
		}
		else {
			double numericCellValue = cell1.getNumericCellValue();
			long l =(long)numericCellValue;
			data = String.valueOf(l);
		}
		return data;
		
	}

}
