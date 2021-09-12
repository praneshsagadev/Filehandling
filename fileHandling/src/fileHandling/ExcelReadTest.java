package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadTest {

	

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			File file = new File("D:\\SELENIUM WORKSPACE\\fileHandling\\lib\\Excel.xlsx");

			if(!file.exists()) {
				
				file.createNewFile();
			}
			
			FileInputStream fis= new FileInputStream(file);
			
			XSSFWorkbook workbook= new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int row= sheet.getPhysicalNumberOfRows();
			int col= sheet.getRow(0).getPhysicalNumberOfCells();
			
//			int row1= sheet.getLastRowNum()+1;
//			int col1=sheet.getRow(0).getLastCellNum();
//			
			
			System.out.println("Row "+row);
			System.out.println("Col "+col);
			
//			System.out.println("Row1 "+row1);
//			System.out.println("Col1 "+col1);
//			
//		XSSFRow row1=	sheet.getRow(0);
//		row1.getCell(0);
	//	
		
			for(int i=0; i<row; i++){   
				
				for(int j=0; j<col; j++){
					if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING)
					{
					
					String data =sheet.getRow(i).getCell(j).getStringCellValue(); 
					System.out.println("value "+data);
					}
					else{
						 int data =(int) sheet.getRow(i).getCell(j).getNumericCellValue(); 
						 System.out.println("value " +data);
					}
					 
					
				}
				}
			}
	}
