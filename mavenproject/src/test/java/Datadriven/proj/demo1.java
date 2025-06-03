package Datadriven.proj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\shiva\\eclipse-workspace\\mavenproject\\Excell\\details.xlsx");
		Workbook wb =new XSSFWorkbook();
		Sheet sheet = wb.createSheet("Data1");
				
		Row r1 = sheet.createRow(0);
		Cell cell = r1.createCell(0);
		Cell cell2 = r1.createCell(1);
		Cell cell3 = r1.createCell(2);
		Cell cell4 = r1.createCell(3);
		
		Row r2 = sheet.createRow(1);
		Cell cell5 = r2.createCell(0);
		Cell cell6 = r2.createCell(1);
		Cell cell7 = r2.createCell(2);
		Cell cell8 = r2.createCell(3);
		
		Row r3 = sheet.createRow(2);
		Cell cell9 = r3.createCell(0);
		Cell cell10 = r3.createCell(1);
		Cell cell11= r3.createCell(2);
		Cell cell12 = r3.createCell(3);
		
		Row r4 = sheet.createRow(3);
		Cell cell13 = r4.createCell(0);
		Cell cell14 =r4.createCell(1);
		Cell cell15= r4.createCell(2);
		Cell cell16 =r4.createCell(3);
		
		Row r5 = sheet.createRow(4);
		Cell cell17 = r5.createCell(0);
		Cell cell18 =r5.createCell(1);
		Cell cell19= r5.createCell(2);
		Cell cell20 =r5.createCell(3);
		
		Row r6 = sheet.createRow(5);
		Cell cell21 = r6.createCell(0);
		Cell cell22 = r6.createCell(1);
		Cell cell23 = r6.createCell(2);
		Cell cell24 = r6.createCell(3);
		
		
		cell.setCellValue("S.No");
		cell2.setCellValue("Name");
		cell3.setCellValue("Jod");
		cell4.setCellValue("PhoneNo");
		
		cell5.setCellValue("1.");
		cell6.setCellValue("Hari");
		cell7.setCellValue("12/03/2003");
		cell8.setCellValue("9012582514");
		
		cell9.setCellValue("2.");
		cell10.setCellValue("Haran");
		cell11.setCellValue("13/08/2001");
		cell12.setCellValue("9011454114");
		
		cell13.setCellValue("3.");
		cell14.setCellValue("Rocky");
		cell15.setCellValue("3/09/2000");
		cell16.setCellValue("8711454114");
		
		cell17.setCellValue("4.");
		cell18.setCellValue("Ajith");
		cell19.setCellValue("22/01/2005");
		cell20.setCellValue("9043128021");
		
		cell21.setCellValue("5.");
		cell22.setCellValue("Dhana");
		cell23.setCellValue("13/08/2000");
		cell24.setCellValue("9845745862");
		
		FileOutputStream write = new FileOutputStream(f);
	    wb.write(write);
			
	}

}
