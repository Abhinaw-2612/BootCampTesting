package com.Helper;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtils {

    public static Object[][] getExcelData() throws Exception {

        FileInputStream fis =
                new FileInputStream("./Xlxs Sheet/UserDetails.xlsx");

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet = wb.getSheetAt(0);

        int rows = sheet.getLastRowNum();

        int cols = sheet.getRow(0).getLastCellNum();

        Object data[][] = new Object[rows][cols];

        for(int i=1;i<=rows;i++) {

            for(int j=0;j<cols;j++) {

                data[i-1][j] =
                        sheet.getRow(i).getCell(j).toString();
            }
        }

        wb.close();

        return data;
    }
}