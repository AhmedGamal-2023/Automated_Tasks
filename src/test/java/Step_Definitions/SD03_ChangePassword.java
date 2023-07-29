package Step_Definitions;

import DDT.JSonDataReader;
import Pages.P11_HomePage;
import Pages.P21_LoginPage;
import Pages.P31_AccountPage;
import Pages.P32_ChangePasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class SD03_ChangePassword {
    JSonDataReader Reader =new JSonDataReader();

    private P11_HomePage home =new P11_HomePage();
    private P21_LoginPage login = new P21_LoginPage();
    private P31_AccountPage account =new P31_AccountPage();
    private P32_ChangePasswordPage change =new P32_ChangePasswordPage();
    @Given("login with old data email, password")
    public void login_With_Old_Password() throws IOException, ParseException {
        Reader.jsonReader();
        home.navigateLoginPage();
        login.enterValidData(Reader.email, Reader.password);
        login.clickOnLoginButton();
    }
    @When("navigate to MyAccount Page and click Change password")
    public void navigate_to_MyAccount_Page_and_click_Change_password (){
      home.navigateAccountPage();
      account.navigateToChangePasswordPage();
    }
    @And("enter password, NewPassword, ConfirmNewPassword")
    public void enterNewData () throws IOException, ParseException {
        Reader.jsonReader();

        change.change_with_newPassword(Reader.password, Reader.NewPassword,Reader.ConfirmNewPassword);
    }
    @And("Click Change password Button")
    public void Click_Change_password_Button(){
      change.ClickChangePasswordButton();
    }
    @Then("Assert Change password successfully")
    public void AssertChangePasswordSuccessfully(){
        String expectedChangePasswordSuccessfully = "Password was changed";
        String actualChangePasswordSuccessfully = change.AssertSuccessMassage();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(expectedChangePasswordSuccessfully , actualChangePasswordSuccessfully);
    }
    @Given("user navigate to login page")
    public void userGoToLoginPage (){
        home.navigateLoginPage();
    }
    @When("user enter new data with email, NewPassword")
    public void userEnterWithValidData() throws IOException, ParseException {
        Reader.jsonReader();

        login.enterValidData(Reader.email, Reader.NewPassword);
    }
    @And("user Click on login button")
    public void userPressLoginButton(){
        login.clickOnLoginButton();
    }
    @Then("user login to the system successfully by new Password")
    public void loginSuccessfully(){
        String expectedLoginSuccessfully = "My account";
        String actualLoginSuccessfully = home.loginSuccessfully();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(expectedLoginSuccessfully , actualLoginSuccessfully);
    }
}
