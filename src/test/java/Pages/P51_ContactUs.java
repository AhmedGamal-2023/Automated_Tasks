package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P51_ContactUs {
    private final By yourNameLocator =By.id("FullName");
    private final By yourEmailLocator =By.id("Email");
    private final By EnquiryLocator =By.id("Enquiry");
    private final By submitLocator =By.name("send-email");
    private final By enquirySuccessfully = By.cssSelector("div[class='result']");



    public void fillsContactUsInfo(String name,String email,String Enquiry){
        driver.findElement(yourNameLocator).sendKeys(name);
        driver.findElement(yourEmailLocator).sendKeys(email);
        driver.findElement(EnquiryLocator).sendKeys(Enquiry);
    }
    public void ClickOnSubmit(){
        driver.findElement(submitLocator).click();

    }
    public String enquirySuccessfully(){
        return enquirySuccessfully.findElement(driver).getText();
    }
}
