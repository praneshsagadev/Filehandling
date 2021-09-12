package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		File file = new File("D:\\SELENIUM WORKSPACE\\fileHandling\\files\\Excel07.xlsx");
		
		if(!file.exists()) {
			
			file.createNewFile();
		}

		FileOutputStream fos = new FileOutputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("sheet1");
		
		XSSFRow row = sheet.createRow(0);
		
		XSSFCell cell = row.createCell(0);
		
		cell.setCellValue("volvo");
		
		workbook.write(fos);
		fos.close();
		
		System.out.println("write completed");
		

	}

}
