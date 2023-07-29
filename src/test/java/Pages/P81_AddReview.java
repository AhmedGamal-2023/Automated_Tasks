package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P81_AddReview {
    private final By reviewTitleLocator = By.id("AddProductReview_Title");
    private final By reviewTextLocator = By.id("AddProductReview_ReviewText");
    private final By ratingLocator = By.cssSelector("input[value='4']");
    private final By submitReviewLocator = By.name("add-review");
    private final By reviewSuccessfullyLocator = By.xpath("//div[contains(text(),'successfully ')]");

    public void FillsReview(String title, String text){
        driver.findElement(reviewTitleLocator).sendKeys(title);
        driver.findElement(reviewTextLocator).sendKeys(text);
        driver.findElement(ratingLocator).click();
        driver.findElement(submitReviewLocator).click();
    }
    public String AssertProductReviewSuccessfully(){
        return reviewSuccessfullyLocator.findElement(driver).getText();
    }
}
