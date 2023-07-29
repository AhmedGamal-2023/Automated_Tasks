package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P32_ChangePasswordPage {
    private final By oldPasswordLocator =By.id("OldPassword");
    private final By NewPasswordLocator =By.id("NewPassword");
    private final By confirmNewPasswordLocator =By.id("ConfirmNewPassword");
    private final By changPasswordButton = By.cssSelector("button[class='button-1 change-password-button']");
    private final By successMassageLocator =By.xpath("//p[contains(text(),'changed')]");
    public void change_with_newPassword(String password,String NewPassword,String ConfirmNewPassword){
        driver.findElement(oldPasswordLocator).sendKeys(password);
        driver.findElement(NewPasswordLocator).sendKeys(NewPassword);
        driver.findElement(confirmNewPasswordLocator).sendKeys(ConfirmNewPassword);
    }
    public void ClickChangePasswordButton(){
        driver.findElement(changPasswordButton).click();
    }
    public String AssertSuccessMassage(){
        return successMassageLocator.findElement(driver).getText();
    }
}
