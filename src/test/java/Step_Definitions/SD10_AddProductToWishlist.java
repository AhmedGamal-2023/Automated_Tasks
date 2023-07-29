package Step_Definitions;

import Pages.P101_WishlistPage;
import Pages.P11_HomePage;
import Pages.P61_Product_1_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class SD10_AddProductToWishlist {
    private P11_HomePage home =new P11_HomePage();
    private P101_WishlistPage wishList = new P101_WishlistPage();
    private P61_Product_1_Page productPage=new P61_Product_1_Page();
    @Given("user Search on product {string} on searchField")
    public void SearchOnProduct (String product){
        home.fills_product(product);

    }
    @When("in ProductPage, Click on Add to Wishlist")
    public void ClickAddToWishlist (){
     productPage.ClickAddToWishlist();
    }
    @And("Click on Wishlist icon to navigate it")
    public void ClickWishlistIcon (){
     productPage.ClickWishlistIcon();
    }
    @Then("assert display product {string} in WishlistPage")
    public void AssertDisplayProductInWishlist(String product){
        String expectedResult = product;
        String actualResult = wishList.AssertDisplayProductInWishlist();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(expectedResult,actualResult);
    }
    @When("click on remove")
    public void clickOnRemove (){
     wishList.clickOnRemove();
    }
    @And("click on Update Wishlist")
    public void clickOnUpdateWishlist(){
//      wishList.clickOnUpdateWishlist();
    }
    @Then("Assert display message {string}")
    public void AssertDisplayMessage(String message){
        String expectedResult = message;
        String actualResult = wishList.AssertDisplayMessage();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains("empty"));
    }
}
