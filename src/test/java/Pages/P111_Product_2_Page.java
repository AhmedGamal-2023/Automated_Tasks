package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P111_Product_2_Page {
    private final By addCompareLocator =By.cssSelector("div[class='compare-products']");
    private final By productComparisonLocator =By.xpath("//a[contains(text(),'product comparison')]");

    public void click_navigate (){
        driver.findElement(addCompareLocator).click();
        driver.findElement(productComparisonLocator).click();
    }
}
