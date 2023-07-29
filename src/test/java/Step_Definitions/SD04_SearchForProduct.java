package Step_Definitions;

import DDT.JSonDataReader;
import Pages.P11_HomePage;
import Pages.P41_SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SD04_SearchForProduct {
    JSonDataReader Reader =new JSonDataReader();
    private P11_HomePage home =new P11_HomePage();
    private P41_SearchPage search = new P41_SearchPage();
   @Given("user fills product on searchField")
   @Severity(SeverityLevel.CRITICAL)
    public void user_fills_Product() throws IOException, ParseException {
       Reader.jsonReader();
       home.SearchProduct(Reader.product);
   }
   @When("Click on SearchButton")
   @Severity(SeverityLevel.CRITICAL)
    public void clickOnButton(){

   }
   @Then("Product Search Display successfully")
   @Severity(SeverityLevel.CRITICAL)
    public void Product_Search_Display_successfully(){
       String expectedResult = "Apple MacBook Pro 13-inch";
       String actualResult = search.AssertProductDisplaySuccessfully();
       SoftAssert soft = new SoftAssert();
       soft.assertEquals(expectedResult , actualResult);
   }
}
