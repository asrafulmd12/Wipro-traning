package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WaitUtils;
import java.util.*;

public class HotelPage {
    private WebDriver driver;

    private By hotelCards = By.xpath("//div[contains(@class,'card-item')]");
    private By hotelNames = By.xpath("//h5[contains(@class,'card-title')]/a");
    // Advanced XPath with parent-child and following-sibling tracking
    private By hotelPrices = By.xpath("//span[contains(text(),'₹') or contains(text(),'USD')]/following-sibling::strong | //div[@class='price-box']//span");

    public HotelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void extractAndValidatePrices() {
        List<WebElement> nameElements = driver.findElements(hotelNames);
        List<WebElement> priceElements = driver.findElements(hotelPrices);

        List<Double> prices = new ArrayList<>();
        Set<String> uniqueNames = new HashSet<>();
        List<String> duplicateNames = new ArrayList<>();

        for (WebElement nameEl : nameElements) {
            String name = nameEl.getText().trim();
            if (!uniqueNames.add(name)) {
                duplicateNames.add(name);
            }
        }

        for (WebElement priceEl : priceElements) {
            String priceText = priceEl.getText().replaceAll("[^0-9.]", "");
            if (!priceText.isEmpty()) {
                prices.add(Double.parseDouble(priceText));
            }
        }

        if(!prices.isEmpty()) {
            double max = Collections.max(prices);
            double min = Collections.min(prices);
            double sum = 0;
            for(double p : prices) sum += p;
            double avg = sum / prices.size();

            System.out.println("--- Advanced Price Analysis Metrics ---");
            System.out.println("Highest Hotel Price Evaluated: " + max);
            System.out.println("Lowest Hotel Price Evaluated: " + min);
            System.out.println("Average System Rate: " + avg);
            System.out.println("Identified Duplications: " + duplicateNames);
        }
    }
}