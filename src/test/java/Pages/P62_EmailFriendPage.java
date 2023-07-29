package Pages;

import static Step_Definitions.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P62_EmailFriendPage {
    private final By friendEmailLocator = By.id("FriendEmail");
    private final By messageLocator = By.id("PersonalMessage");
    private final By sendEmailLocator = By.name("send-email");
    private final By messageSentLocator =By.cssSelector("div[class='result']");
    public void fills_FriendInfo (String Femail, String message){
       driver.findElement(friendEmailLocator).sendKeys(Femail);
       driver.findElement(messageLocator).sendKeys(message);
       driver.findElement(sendEmailLocator).click();
    }
    public String Assertion (){
      return   messageSentLocator.findElement(driver).getText();
    }
}
