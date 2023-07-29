package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P12_RegisterPage {
    private final By firstNameLocator = By.id("FirstName");
    private final By lastNameLocator = By.id("LastName");
    private final By emailLocator = By.id("Email");
    private final By passwordLocator = By.id("Password");
    private final By confirmPasswordLocator = By.id("ConfirmPassword");
    private final By registerButton  =By.id("register-button");
    public void RegistrationInfo(String FirstName, String LastName, String email, String password, String confirmPassword) {
        driver.findElement(firstNameLocator).sendKeys(FirstName);
        driver.findElement(lastNameLocator).sendKeys(LastName);
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(confirmPasswordLocator).sendKeys(confirmPassword);
    }
    public void click_register_Button (){
        driver.findElement(registerButton).click();

    }
}
