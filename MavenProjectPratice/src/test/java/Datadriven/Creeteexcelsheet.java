package Datadriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Creeteexcelsheet {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\MavenProjectPratice\\Excel\\sample1.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet createSheet = wb.createSheet();
		Row createRow = createSheet.createRow(1);
		Cell createCell = createRow.createCell(1);
		createCell.setCellValue("Hariharan");
		
		FileOutputStream write = new FileOutputStream(f);
		wb.write(write);
		
		
	}

}
