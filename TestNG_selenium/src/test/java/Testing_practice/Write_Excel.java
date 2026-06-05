package Testing_practice;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Write_Excel {

    @Test
    public void WriteData() throws Exception {

        Object[][] data = {
                {"username", "password"},
                {"admin", "123"},
                {"user1", "abc"},
                {"test", "xyz"}
        };

       
        XSSFWorkbook workbook = new XSSFWorkbook();

       
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        
        for(int i = 0; i < data.length; i++) {

            XSSFRow row = sheet.createRow(i);

            for(int j = 0; j < data[i].length; j++) {

                row.createCell(j)
                   .setCellValue(data[i][j].toString());
            }
        }

        
        FileOutputStream file =
                new FileOutputStream("D:\\TestData\\NewData.xlsx");

        workbook.write(file);

        workbook.close();
        file.close();

        System.out.println("Data written successfully");
    }
}