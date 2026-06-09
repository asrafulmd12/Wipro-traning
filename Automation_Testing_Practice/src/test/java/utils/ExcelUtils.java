package utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtils {

    public static Object[] getSingleRowData(String filePath, String sheetName) {

        Object[] data = new Object[4]; // 4 columns

        try {
            FileInputStream fis = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(sheetName);

            XSSFRow row = sheet.getRow(1); // ONLY FIRST DATA ROW (index 1)

            for (int i = 0; i < 4; i++) {
                data[i] = row.getCell(i).toString();
            }

            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}