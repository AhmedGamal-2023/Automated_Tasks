package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P101_WishlistPage {
    private final By productInWishlistLocator = By.xpath("//a[contains(text(),'MacBook')]");
    private final By removeLocator =By.cssSelector("button[class='remove-btn']");
    private final By updateWishlistLocator =By.cssSelector("button[class='button-2 update-wishlist-button']");
    private final By messageWishlistLocator =By.cssSelector("div[class='no-data']");

    public String AssertDisplayProductInWishlist(){
        return productInWishlistLocator.findElement(driver).getText();
    }
    public void clickOnRemove(){
        driver.findElement(removeLocator).click();
    }
    public void clickOnUpdateWishlist(){
        driver.findElement(updateWishlistLocator).click();
    }
    public String AssertDisplayMessage(){
        return messageWishlistLocator.findElement(driver).getText();
    }
}
