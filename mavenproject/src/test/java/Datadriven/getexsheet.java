package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getexsheet {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\mavenproject\\Excell\\Book1.xlsx");
		
		FileInputStream read = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(read);
		
		Sheet sheet = wb.getSheet("Details");
		
//		Row r = sheet.getRow(3);
		
//		Cell c = r.getCell(2);        //get a one Row value
//		System.out.println(c);
		
		                              //get one row of all cell values
//		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
//			Cell cell = r.getCell(i);
//			System.out.println(cell);
//			
//		}                                         
		                                 //get in all data's
//		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//			Row row = sheet.getRow(i);
//			
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//				Cell cell = row.getCell(j);
//				System.out.println(cell);
//			}
//			
//		}
		                                  //find a cell type
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell c1 = row.getCell(j);
				int Type = c1.getCellType();    //(1---string , 0---numbers/date)
				
				if (Type==1) {
					String data = c1.getStringCellValue();
					System.out.println(data);	
				}
				else if (DateUtil.isCellDateFormatted(c1)) {
					Date d1 = c1.getDateCellValue();
					System.out.println(d1);
					
					SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
					String format = sim.format(d1);
					System.out.println(format);
				}
					else {
						double numericCellValue = c1.getNumericCellValue();
						System.out.println("double:"+numericCellValue);
						long l = (long)numericCellValue;
						System.out.println("long:"+l);
						
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
						
						
					}
					
					
					
					
					
				}
				
				
				
				
				
			}
		
		
		
		
		
		
		
		
	}

}
