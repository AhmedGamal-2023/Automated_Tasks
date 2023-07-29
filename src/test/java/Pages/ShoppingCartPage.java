package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    private final By QuantityValueLocator =By.cssSelector("input[aria-label='Qty.']");
    private final By checkoutLocator =By.cssSelector("button[class='button-1 checkout-button']");
    private final By alertLocator=By.cssSelector("button[title='Close']");
    private final By agreeLocator=By.id("termsofservice");
    private final By loginMailLocator = By.id("Email");
    private final By loginPasswordLocator = By.id("Password");
    private final By loginButtonLocator = By.xpath("//button[contains(text(),'Log in')]");

    public String AssertNumberAndClickCheckout(){
        return QuantityValueLocator.findElement(driver).getText();
    }
    public void alertAndClick (){
        driver.findElement(checkoutLocator).click();
        driver.findElement(alertLocator).click();
        driver.findElement(agreeLocator).click();
        driver.findElement(checkoutLocator).click();
    }
    public void logAsHaveAccount(String email,String password){
        driver.findElement(loginMailLocator).sendKeys(email);
        driver.findElement(loginPasswordLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
        driver.findElement(agreeLocator).click();
        driver.findElement(checkoutLocator).click();
    }
}
