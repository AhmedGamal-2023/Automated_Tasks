package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P61_Product_1_Page {
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    private final By emailFriendLocator = By.cssSelector("button[class='button-2 email-a-friend-button']");
    private final By priceValueLocator =By.id("price-value-4");
    private final By addReviewLocator =By.cssSelector("a[href='/productreviews/4']");
    private final By addWishlistLocator =By.id("add-to-wishlist-button-4");
    private final By wishlistIconLocator =By.xpath("//a[contains(text(),'wishlist')]");
    private final By addCompareLocator =By.cssSelector("div[class='compare-products']");
    private final By searchFieldLocator = By.id("small-searchterms");
    private final By searchListLocator = By.id("ui-id-2");


    public void clickOnEmail_aFriend(){
    driver.findElement(emailFriendLocator).click();
    }
    public String AssertCurrency(){
        return priceValueLocator.findElement(driver).getText();
    }
    public void ClickAddReview(){
      driver.findElement(addReviewLocator).click();
    }
    public void ClickAddToWishlist(){
        driver.findElement(addWishlistLocator).click();
    }
    public void ClickWishlistIcon(){
    driver.findElement(wishlistIconLocator).click();
    }
    public void clickOnAddProductsToCompare (){
        driver.findElement(addCompareLocator).click();
    }
    public void searchProduct2 (String product2){
        driver.findElement(searchFieldLocator).sendKeys(product2);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchListLocator))).click();
    }
}
