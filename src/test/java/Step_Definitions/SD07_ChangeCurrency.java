package Step_Definitions;

import DDT.JSonDataReader;
import Pages.P11_HomePage;
import Pages.P61_Product_1_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SD07_ChangeCurrency {
    private P11_HomePage home =new P11_HomePage();
    private P61_Product_1_Page productPage=new P61_Product_1_Page();
    JSonDataReader Reader =new JSonDataReader();

    @Given("Change Currency form Dollar to Euro")
    public void ChangeCurrency(){
        home.ChangeCurrency();
    }
    @When("fills product on searchField and select it")
    public void searchOnProduct() throws IOException, ParseException {
        Reader.jsonReader();
        home.searchOnProduct(Reader.product);
    }
    @Then("Assert price Contain {string}")
    public void AssertCurrency(String Euro){
        String expectedResult = "Your message has been sent.";
        String actualResult = productPage.AssertCurrency();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(Euro));
    }
}
