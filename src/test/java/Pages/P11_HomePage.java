package Pages;
import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P11_HomePage {
    private final Actions actions = new Actions(driver);
    private  Select select ;
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//    private JavascriptExecutor jse =(JavascriptExecutor) driver;

    private final By loginLocator = By.xpath("//a[contains(text(),'Log in')]");
    private final By Register = By.xpath("//a[contains(text(),'Register')]");
    private final By loginAssertLocator = By.xpath("//a[contains(text(),'My account')]");
    private final By myAccountLocator = By.xpath("//a[contains(text(),'My account')]");
    private final By searchFieldLocator = By.id("small-searchterms");
    private final By searchListLocator = By.id("ui-id-1");
    private final By searchButtonLocator = By.cssSelector("button[class='button-1 search-box-button']");
    private final By contactUsLocator =By.xpath("//a[contains(text(),'Contact us')]");
    private final By selectChangeCurrency= By.id("customerCurrency");
    private final By computerLocator= By.xpath("//a[contains(text(),'Computers')]");
    private final By notebooksLocator= By.xpath("//a[contains(text(),'Notebooks')]");

    private final By sleekbookLocator= By.xpath("//span[contains(text(),'Sleekbook')]");



    public void setSignAccount() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Register))).click();

    }
    public void navigateLoginPage(){
        driver.findElement(loginLocator).click();
    }
    public String loginSuccessfully (){
        return loginAssertLocator.findElement(driver).getText();
    }
    public void navigateAccountPage(){
        driver.findElement(myAccountLocator).click();
    }
    public void SearchProduct (String product){
        driver.findElement(searchFieldLocator).sendKeys(product);
        driver.findElement(searchButtonLocator).click();
    }
    public void scrollToButton (){
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,350)", "");
    }
    public void clickOnContact (){
        driver.findElement(contactUsLocator).click();
    }
    public void fills_product(String product){
        driver.findElement(searchFieldLocator).sendKeys(product);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchListLocator))).click();
    }
    public void ChangeCurrency(){
      WebElement currencyElement = driver.findElement(selectChangeCurrency);
      select =new Select(currencyElement);
      select.selectByVisibleText("Euro");
    }
    public void searchOnProduct (String product){
        driver.findElement(searchFieldLocator).sendKeys(product);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchListLocator))).click();
    }
    public void hoverOnComputerMenu(){
        actions.moveToElement(driver.findElement(computerLocator))
               .moveToElement(driver.findElement(notebooksLocator))
               .click()
               .build()
               .perform();
    }
    public void SearchOnProduct(String product){
       driver.findElement(searchFieldLocator).sendKeys(product);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(sleekbookLocator))).click();
    }
}
