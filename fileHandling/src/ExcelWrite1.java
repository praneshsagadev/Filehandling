import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite1 {

	public static void main(String[] args) throws IOException {
		
		File file =new File ("D:\\SELENIUM WORKSPACE\\fileHandling\\files\\ExcelWrite1.xlsx");
		
		if(!file.exists()) {
			
			file.createNewFile();
			
		}
		
		FileOutputStream fos = new FileOutputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Pranesh");
		
//		XSSFRow row = sheet.createRow(0);
//		
//		XSSFCell cell = row.createCell(0);
//		
//		cell.setCellValue("Ajith");
		int k=1;
		for(int i=0;i<3;i++){
	  		XSSFRow row =sheet.createRow(i);
	  	
	  		
	  		for(int j=0;j<=3;j++){
	  	
		  			row.createCell(j).setCellValue("Vcentry" + k);	
		  			k++;
	  		     }
	  		
	  		}
		
		
		
		workbook.write(fos);
		fos.close();
		System.out.println("write completed");
		
		
		
		

	}

}
