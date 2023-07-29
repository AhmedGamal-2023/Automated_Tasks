package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P21_LoginPage {
    private final By loginMailLocator = By.id("Email");
    private final By loginPasswordLocator = By.id("Password");
    private final By loginButtonLocator = By.xpath("//button[contains(text(),'Log in')]");

    public void enterValidData (String email,String password){
        driver.findElement(loginMailLocator).sendKeys(email);
        driver.findElement(loginPasswordLocator).sendKeys(password);
    }
    public void clickOnLoginButton(){
        driver.findElement(loginButtonLocator).click();
    }

}
