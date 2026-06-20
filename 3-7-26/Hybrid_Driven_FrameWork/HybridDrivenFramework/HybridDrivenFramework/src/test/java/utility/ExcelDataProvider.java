package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	String filePath = "C:\\SeleniumJavaProgram\\HybridDrivenFramework\\TestData\\devansh.xlsx";
	
	public ExcelDataProvider() throws FileNotFoundException{
		try {
		FileInputStream file = new FileInputStream(filePath);
		wb = new XSSFWorkbook(file);
		}catch(Exception e) {
			System.out.println("Some error occureed in Excel Data provider" +e.getMessage());
		}
		
	}
	
	public String getStringData(int sheetIndex, int row, int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String sheetIndex, int row, int column) {
		return wb.getSheet(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumerical(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
