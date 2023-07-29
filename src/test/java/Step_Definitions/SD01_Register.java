package Step_Definitions;
import DDT.JSonDataReader;
import DDT.RandomReader;
import Pages.P11_HomePage;
import Pages.P12_RegisterPage;
import Pages.P13_RegisterResult;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;
import java.io.IOException;



public class SD01_Register {
    JSonDataReader Reader =new JSonDataReader();
//    Faker fakeData =new Faker();
//    RandomReader randomReader =new RandomReader();
    protected P11_HomePage home=new P11_HomePage();
    protected P12_RegisterPage register= new P12_RegisterPage();
    protected P13_RegisterResult result = new P13_RegisterResult();

    @Given("user navigate to Register page")
    @Severity(SeverityLevel.CRITICAL)
    public void user_navigate_to_Register_page(){
       home.setSignAccount();
    }
    @When("user fills  FirstName, LastName, email, password, confirmPassword")
    public  void user_fills() throws IOException, ParseException {
        Reader.jsonReader();
//        randomReader.randomReader();
        register.RegistrationInfo(Reader.FirstName,Reader.LastName,Reader.email,Reader.password,Reader.password);
    }
    @And("user clicks register button")
    public void user_clicks_register_button(){
     register.click_register_Button();
   }
   @Then("success message is displayed")
   public  void success_message_is_displayed(){
       String expectedConfirmationMessage = "Your registration completed";
       String actualConfirmationMessage= result.getConfirmationMessage();
       SoftAssert soft = new SoftAssert();
       soft.assertEquals(expectedConfirmationMessage , actualConfirmationMessage);
   }
}
