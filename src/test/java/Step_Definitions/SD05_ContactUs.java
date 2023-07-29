package Step_Definitions;

import DDT.JSonDataReader;
import DDT.RandomReader;
import Pages.P11_HomePage;
import Pages.P51_ContactUs;
import Pages.P00_PageBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SD05_ContactUs {
    private  WebDriver driver = Hooks.driver;
    private P11_HomePage home=new P11_HomePage();
    private P51_ContactUs contact = new P51_ContactUs();
    JSonDataReader Reader =new JSonDataReader();
//    RandomReader randomReader =new RandomReader();

    @Given("user on Home Page scroll to bottom")
     public void scrollToBottom(){
          home.scrollToButton();
     }
     @When("user click on contact Us to navigate it")
     public void clickOnContact (){
      home.clickOnContact();
     }
     @And("user fills name,email,Enquiry")
     public void fillsContactUsInfo() throws IOException, ParseException {
         Reader.jsonReader();
//         randomReader.randomReader();
         contact.fillsContactUsInfo(Reader.name,Reader.email, Reader.Enquiry);
     }
     @And("Click on Submit Button")
    public void ClickOnSubmit (){
       contact.ClickOnSubmit();
     }
     @Then("Your enquiry has been successfully sent to the store owner.")
    public void enquirySuccessfully(){
         String expectedResult = "Your enquiry has been successfully sent to the store owner.";
         String actualResult = contact.enquirySuccessfully();
         SoftAssert soft = new SoftAssert();
         soft.assertEquals(expectedResult , actualResult);
     }
}
