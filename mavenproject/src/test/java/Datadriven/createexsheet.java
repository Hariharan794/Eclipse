package Datadriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createexsheet {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\mavenproject\\Excell\\students.xlsx");
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet("hari");
		
		Row row = sheet.createRow(04);
		
		Cell cell = row.createCell(3);
		cell.setCellValue("rocky");
		
		FileOutputStream write = new FileOutputStream(f);
		
		wb.write(write);
	}

}
