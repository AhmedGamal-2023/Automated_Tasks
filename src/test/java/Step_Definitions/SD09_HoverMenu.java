package Step_Definitions;

import Pages.P11_HomePage;
import Pages.P91_NotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class SD09_HoverMenu {
    private P11_HomePage home =new P11_HomePage();
    private P91_NotebooksPage note =new P91_NotebooksPage();
    @Given("hover on Computers and click on Notebooks")
    public void hoverOnComputerMenu (){
    home.hoverOnComputerMenu();
    }
    @When("on Notebooks Page")
    public void onPage (){
    }
    @Then("Assert Current Url {string}")
    public void assertCurrentUrl(String url){
//        String expectedResult = url;
        String actualResult = note.assertCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(url));
    }
    @And("Assert PageTitle {string}")
    public void AssertPageTitle(String PageTitle){
        String expectedResult = PageTitle;
        String actualResult = note.AssertPageTitle();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(expectedResult,actualResult);
    }
}
