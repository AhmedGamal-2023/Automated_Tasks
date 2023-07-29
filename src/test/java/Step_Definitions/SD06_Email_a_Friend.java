package Step_Definitions;

import DDT.JSonDataReader;
import DDT.RandomReader;
import Pages.P11_HomePage;
import Pages.P21_LoginPage;
import Pages.P61_Product_1_Page;
import Pages.P62_EmailFriendPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SD06_Email_a_Friend {
    private P11_HomePage home =new P11_HomePage();
    private P21_LoginPage login = new P21_LoginPage();
    private P61_Product_1_Page productPage=new P61_Product_1_Page();
    private P62_EmailFriendPage emailFriendPage =new P62_EmailFriendPage();
    JSonDataReader Reader =new JSonDataReader();
//    RandomReader randomReader =new RandomReader();

    @Given("user on HomePage login with Valid data email, password")
    public void user_login () throws IOException, ParseException {
        Reader.jsonReader();
//        randomReader.randomReader();
        home.navigateLoginPage();
        login.enterValidData(Reader.email, Reader.NewPassword);
        login.clickOnLoginButton();
    }
    @When("user already logged, fills product on searchField and select it")
    public void  fills_product () throws IOException, ParseException {
        Reader.jsonReader();
        home.fills_product(Reader.product);
    }
    @And("on productPage, click on Email a friend")
    public void clickOnEmail_aFriend (){
     productPage.clickOnEmail_aFriend();
    }
    @And("on Email a friend page, Fills FriendEmail, message")
    public void fills_FriendInfo () throws IOException, ParseException {
        Reader.jsonReader();
        emailFriendPage.fills_FriendInfo(Reader.FriendEmail, Reader.message);
    }
    @Then("Assert Your message has been sent")
    public void Assertion (){
        String expectedResult = "Your message has been sent.";
        String actualResult = emailFriendPage.Assertion();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(expectedResult , actualResult);
    }
}
