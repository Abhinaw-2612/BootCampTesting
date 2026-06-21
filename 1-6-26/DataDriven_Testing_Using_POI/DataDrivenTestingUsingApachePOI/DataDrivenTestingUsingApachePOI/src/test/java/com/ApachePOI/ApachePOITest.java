package com.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOITest {
	String filePath = "C:\\XLXSFile\\devansh.xlsx";
	
	public void main(String[] args) throws IOException {
		File src = new File(filePath);
		
		FileInputStream fs = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		
		for(Row row: sheet) {
			for(Cell cell: row) {
				System.out.println(cell.toString() + " ");
				
			}
			System.out.println("");
		}
		
		wb.close();
	}

}
