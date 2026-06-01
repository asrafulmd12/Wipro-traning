package utilities;

import base.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitUtils {
    private static WebDriverWait getWait(int timeoutInSeconds) {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(timeoutInSeconds));
    }

    public static WebElement waitForVisible(By locator, int timeout) {
        return getWait(timeout).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickable(By locator, int timeout) {
        return getWait(timeout).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement waitForPresence(By locator, int timeout) {
        return getWait(timeout).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static Alert waitForAlert(int timeout) {
        return getWait(timeout).until(ExpectedConditions.alertIsPresent());
    }

    public static WebDriver waitForFrame(By locator, int timeout) {
        return getWait(timeout).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    // Handles Question 14: Stale element & intercepted click retry loop
    public static void clickWithRetry(By locator, int retryCount) {
        int count = 0;
        while (count < retryCount) {
            try {
                waitForClickable(locator, 10).click();
                break;
            } catch (StaleElementReferenceException | ElementClickInterceptedException e) {
                count++;
            }
        }
    }
}
