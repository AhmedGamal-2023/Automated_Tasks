package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P91_NotebooksPage {
    private final By pageTitleLocator = By.xpath("//h1[contains(text(),'Notebooks')]");

    public String assertCurrentUrl (){
        return driver.getCurrentUrl();
    }
    public String AssertPageTitle(){
        return pageTitleLocator.findElement(driver).getText();
    }
}
