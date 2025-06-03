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
import org.jsoup.helper.DataUtil;

public class Excelread1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\mavenproject\\Excell\\Book2.xlsx");
		
		FileInputStream read = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(read);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				
				if (cellType==1) {
					String l = cell.getStringCellValue();
					System.out.println(l);
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					System.out.println(dateCellValue);
					
					SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
					String format = sim.format(dateCellValue);
					System.out.println(format);					
				}else {
					double numericCellValue = cell.getNumericCellValue();
					long l =(long) numericCellValue;
					System.out.println(l);
					
//					String valueOf = String.valueOf(l);
//					System.out.println(valueOf);
				}
			} 
		}
		
		
	}

}
