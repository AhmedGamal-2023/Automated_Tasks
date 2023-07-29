package Step_Definitions;

import DDT.JSonDataReader;
import Pages.P11_HomePage;
import Pages.P21_LoginPage;
import Pages.P61_Product_1_Page;
import Pages.P81_AddReview;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SD08_AddReview {
    private P11_HomePage home =new P11_HomePage();
    private P21_LoginPage login = new P21_LoginPage();

    private P61_Product_1_Page productPage=new P61_Product_1_Page();
    private P81_AddReview addReview =new P81_AddReview();
    JSonDataReader Reader =new JSonDataReader();


    @Given("user on HomePage, login with Valid data email, password")
    public void loginWithValidData  () throws IOException, ParseException {
        Reader.jsonReader();
        home.navigateLoginPage();
        login.enterValidData(Reader.email, Reader.NewPassword);
        login.clickOnLoginButton();
    }
    @When("User Search on Product on searchField and select it")
    public void UserSearchOnProduct() throws IOException, ParseException {
        Reader.jsonReader();
        home.fills_product(Reader.product);
    }
    @And("on productPage, click on Add Review")
    public void ClickAddReview (){
     productPage.ClickAddReview();
    }
    @And("on ProductReview Page, Fills title, text")
    public void FillsReview() throws IOException, ParseException {
        Reader.jsonReader();
        addReview.FillsReview(Reader.title, Reader.text);
        home.scrollToButton();
    }
    @Then("Assert {string}")
    public void AssertProductReviewSuccessfully (String message){
        String expectedResult = message;
        String actualResult = addReview.AssertProductReviewSuccessfully();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(expectedResult,actualResult);
    }
}
