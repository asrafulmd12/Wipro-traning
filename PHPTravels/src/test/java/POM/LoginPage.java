package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

 // Broader locators that look for the input type rather than a specific name
    private By emailField = By.xpath("//input[@type='email']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By loginBtn = By.xpath("//button[@type='submit' or contains(text(), 'Login')]");
 // Example: If there is a Logout button after successful login
    private By userDashboardTitle = By.xpath("//a[contains(text(),'Logout')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void handlePopup() {
        try {
            // Tries to handle a browser alert first
            utilities.WaitUtils.waitForAlert(3).accept(); 
        } catch (Exception e1) {
            try {
                // If no alert, it tries to force-click the HTML Demo Warning
                WebElement demoWarningBtn = driver.findElement(By.xpath("//*[@id=\"acknowledgeDemoWarning\"]"));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", demoWarningBtn);
                System.out.println("Demo warning force-closed using JavaScript.");
            } catch (Exception e2) {
                System.out.println("No warning detected. Continuing execution...");
            }
        }
    }
    public void enterCredentials(String email, String pass) {
        WaitUtils.waitForVisible(emailField, 10).clear();
        if(email != null && !email.trim().isEmpty()) {
            driver.findElement(emailField).sendKeys(email);
        }
        
        WaitUtils.waitForVisible(passwordField, 10).clear();
        if(pass != null && !pass.trim().isEmpty()) {
            driver.findElement(passwordField).sendKeys(pass);
        }
    }

    public void clickLogin() {
        WaitUtils.clickWithRetry(loginBtn, 3);
    }

    public boolean isLoginSuccessful() {
        try {
            // Wait up to 5 seconds for the URL to contain 'dashboard' or 'account'
            return new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(5))
                    .until(org.openqa.selenium.support.ui.ExpectedConditions.or(
                        org.openqa.selenium.support.ui.ExpectedConditions.urlContains("dashboard"),
                        org.openqa.selenium.support.ui.ExpectedConditions.urlContains("account")
                    ));
        } catch (Exception e) {
            return false;
        }
    }

    // Excel Data Driven Parsing Engine
    public List<Map<String, String>> getExcelData(String excelPath, String sheetName) throws Exception {
        List<Map<String, String>> dataList = new ArrayList<>();
        FileInputStream fis = new FileInputStream(new File(excelPath));
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        Row headerRow = sheet.getRow(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row currentRow = sheet.getRow(i);
            Map<String, String> dataMap = new HashMap<>();
            for (int j = 0; j < headerRow.getLastCellNum(); j++) {
                Cell cell = currentRow.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                String value = cell.toString();
                dataMap.put(headerRow.getCell(j).toString(), value);
            }
            dataList.add(dataMap);
        }
        workbook.close();
        return dataList;
    }
}