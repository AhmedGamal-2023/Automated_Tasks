package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    private  Select select ;
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    private final By selectCountryLocator = By.cssSelector("[data-trigger='country-select']");
    private final By cityLocator = By.id("BillingNewAddress_City");
    private final By addressLocator = By.id("BillingNewAddress_Address1");
    private final By zipLocator = By.id("BillingNewAddress_ZipPostalCode");
    private final By phoneNumberLocator = By.id("BillingNewAddress_PhoneNumber");
    private final By continueLocator = By.cssSelector("[class='button-1 new-address-next-step-button']");
    private final By shippingContinueLocator = By.cssSelector("[class='button-1 shipping-method-next-step-button']");
    private final By paymentContinueLocator = By.cssSelector("[class='button-1 payment-method-next-step-button']");
    private final By paymentINFOContinueLocator = By.cssSelector("[class='button-1 payment-info-next-step-button']");

    private final By nextDayLocator = By.id("shippingoption_1");
    private final By confirmLocator = By.cssSelector("[class='button-1 confirm-order-next-step-button']");
    private final By messageLocator = By.xpath("//strong[contains(text(),'successfully ')]");

    public void fillsCheckout(String country,String city,String address,String zip,String phoneNumber){
        WebElement selectCountry = driver.findElement(selectCountryLocator);
        select =new Select(selectCountry);
        select.selectByVisibleText(country);
        driver.findElement(cityLocator).sendKeys(city);
        driver.findElement(addressLocator).sendKeys(address);
        driver.findElement(zipLocator).sendKeys(zip);
        driver.findElement(phoneNumberLocator).sendKeys(phoneNumber);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(continueLocator))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(nextDayLocator))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(shippingContinueLocator))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(paymentContinueLocator))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(paymentINFOContinueLocator))).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(confirmLocator).click();
    }
    public String assertMessage(){
        return messageLocator.findElement(driver).getText();
    }
//    public void handlePopUp(){
//        String JS_DISABLE_UNLOAD_DIALOG = "Object.defineProperty(BeforeUnloadEvent.prototype, 'returnValue', { get:function(){}, set:function(){} });";
//        ((JavascriptExecutor)driver).executeScript(JS_DISABLE_UNLOAD_DIALOG);
//    }
}
