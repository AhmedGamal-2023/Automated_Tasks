package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P31_AccountPage {
    private final By changePasswordLocator = By.cssSelector("li[class='change-password inactive']");
    public void navigateToChangePasswordPage(){
        driver.findElement(changePasswordLocator).click();
    }
}
