package Step_Definitions;

import DDT.JSonDataReader;
import DDT.RandomReader;
import Pages.P11_HomePage;
import Pages.P21_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SD02_Login {
    private P11_HomePage home =new P11_HomePage();
    JSonDataReader Reader =new JSonDataReader();
    private P21_LoginPage login = new P21_LoginPage();

//    RandomReader randomReader =new RandomReader();



    @Given("user go to login page")
    public void userGoToLoginPage (){
      home.navigateLoginPage();
    }
    @When("user enter valid data with email , password")
    public void userEnterWithValidData() throws IOException, ParseException {
//        randomReader.randomReader();

        Reader.jsonReader();
        login.enterValidData(Reader.email,Reader.password);
    }
    @And("user press on login button")
    public void userPressLoginButton(){
     login.clickOnLoginButton();
    }
    @Then("user login to the system successfully")
    public void loginSuccessfully(){
        String expectedLoginSuccessfully = "My account";
        String actualLoginSuccessfully = home.loginSuccessfully();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(expectedLoginSuccessfully , actualLoginSuccessfully);
    }
}
