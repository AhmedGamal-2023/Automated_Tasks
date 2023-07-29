package Step_Definitions;

import Pages.P111_Product_2_Page;
import Pages.P112_ComparePage;
import Pages.P11_HomePage;
import Pages.P61_Product_1_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SD11_AddProductsToComparePage {
    private P11_HomePage home =new P11_HomePage();
    private P61_Product_1_Page product1=new P61_Product_1_Page();
    private P111_Product_2_Page product2=new P111_Product_2_Page();
    private P112_ComparePage compare=new P112_ComparePage();

    @Given("Search on product1 {string} on searchField")
    public void searchProduct1 (String product1){
        home.fills_product(product1);
    }
    @When("in ProductPage, Click on Add to Compare List")
    public void clickOnAddProductsToCompare (){
     product1.clickOnAddProductsToCompare();
    }
    @And("Search on product2 {string} on searchField")
    public void searchProduct2 (String product2){
    product1.searchProduct2(product2);
    }
    @And("in ProductPage, Click on Add to Compare List and navigate to it")
    public void click_navigate (){
        product2.click_navigate();
    }
    @Then("Assert Display {string} ,{string}")
    public void Assert(String p1, String p2) throws IOException, ParseException {
        String expectedResult1 = p1;
        String expectedResult2 = p2;
        String actualResult = compare.Assertion();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(expectedResult1));
        soft.assertTrue(actualResult.contains(expectedResult2));
        compare.PrintNameOfProducts();
    }
}
