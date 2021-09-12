import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\SELENIUM WORKSPACE\\fileHandling\\files\\ExcelRd.xlsx");
		
		if(file.exists()) {
			file.delete();
			file.createNewFile();
			
			
		}
		else
			file.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("sheet1");
		
		for(int i =0;i<=5;i++) {
			
		XSSFRow row	=sheet.createRow(i);
		
		row.createCell(0).setCellValue("vcentry" + i);
		
		String data = workbook.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
			
		workbook.createSheet(data)	;
		}
		workbook.write(fos);
		fos.close();
		System.out.println("write completed");
		
		
		
	}

}
