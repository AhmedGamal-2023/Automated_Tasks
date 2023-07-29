package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product3Page {
    private final By QuantityLocator =By.cssSelector("input[aria-label='Enter a quantity']");
    private final By addToCartLocator =By.id("add-to-cart-button-8");
    private final By shoppingCartLocator =By.xpath("//a[contains(text(),'shopping cart')]");





    public void clearAndTypeAndClick(String number){
        driver.findElement(QuantityLocator).clear();
        driver.findElement(QuantityLocator).sendKeys(number);
        driver.findElement(addToCartLocator).click();
        driver.findElement(shoppingCartLocator).click();

    }

}
