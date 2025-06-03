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

public class Getexcelsheet {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\MavenProjectPratice\\Excel\\Book2.xlsx");
		FileInputStream read = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(read);
		Sheet sheet = wb.getSheet("sheet1");
		
//		--------------------------------------				//get one value
		
//		Row row = sheet.getRow(2);
//		Cell cell = row.getCell(1);
//		System.out.println(cell);
		
		
//	------------------------------------------------		//get one row of all values	
		
//		Row row = sheet.getRow(2);
//		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
//			Cell cell = row.getCell(i);
//			System.out.println(cell);
//		}
		
		
//		-----------------------------------------------			//one sheet of all values
		
//		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//			Row row = sheet.getRow(i);
//			
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//				Cell cell = row.getCell(j);
//				System.out.println(cell);
//			}
//		}
		
//		----------------------------------------			//get types
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
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
				System.out.println(data);
			}
		}
		
		
		
	}
	

}
