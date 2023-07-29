package Step_Definitions;

import DDT.JSonDataReader;
import Pages.CheckoutPage;
import Pages.P11_HomePage;
import Pages.Product3Page;
import Pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SD12_CreateProductCheckout {
    private P11_HomePage home =new P11_HomePage();
    private ShoppingCartPage shopping = new ShoppingCartPage();
    private CheckoutPage checkout =new CheckoutPage();

    private Product3Page product3 = new Product3Page();
    JSonDataReader Reader =new JSonDataReader();

    @Given("SearchOn product {string} on searchField")
    public void searchOnProduct (String product){
    home.SearchOnProduct(product);
    }
    @When("clear, type amount of number {string} and Click on Add to Cart")
    public void clearAndTypeAndClick (String number){
     product3.clearAndTypeAndClick(number);
    }
    @And("navigate To Shopping Cart")
    public void navigateToShoppingCart(){

    }
    @And("Assert numbers of Quantity {string}, Scroll To Click on CheckOut")
    public void AssertNumberAndClickCheckout(String number){
        String expectedResult = number;
        String actualResult = shopping.AssertNumberAndClickCheckout();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(expectedResult,actualResult);
        shopping.alertAndClick();
    }
    @And("log as user have account by email, password")
    public void logAsHaveAccount () throws IOException, ParseException {
        Reader.jsonReader();
        shopping.logAsHaveAccount(Reader.email, Reader.NewPassword);
    }
    @And("fills Checkout Required Information {string} country,{string} city,{string} address,{string} zip,{string} phoneNumber")
    public void fillsCheckout(String country,String city,String address,String zip,String phoneNumber){
     checkout.fillsCheckout(country,city,address,zip,phoneNumber);
    }
    @Then("assert {string}")
    public void assertMessage (String message){
        String actualResult = checkout.assertMessage();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(message,actualResult);
    }
}
