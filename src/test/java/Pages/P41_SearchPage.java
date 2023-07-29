package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P41_SearchPage {
    private final By productSearchLocator =By.cssSelector("h2[class='product-title']");

    public String AssertProductDisplaySuccessfully (){
      return productSearchLocator.findElement(driver).getText();
    }
}
