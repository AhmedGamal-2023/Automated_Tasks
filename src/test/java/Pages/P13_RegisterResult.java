package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P13_RegisterResult {
    private final By confirmationMessage = By.cssSelector("div[class='result']");
    public String getConfirmationMessage(){
        return confirmationMessage.findElement(driver).getText();
    }
}
