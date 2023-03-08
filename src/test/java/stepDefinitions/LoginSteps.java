package stepDefinitions;

import com.qacart.base.Base;
import com.qacart.pages.HomePage;
import com.qacart.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends Base {


    LoginPage loginPage;
    HomePage homePage;

    @Given("User open website and go to login page")
    public void userOpenWebsiteAndGoToLoginPage() {

        launchBrowser();

    }

    @When("User fill email as {string} and password as {string} and click on login")
    public void userFillEmailAsAndPasswordAsAndClickOnLogin(String userName, String password) {

        loginPage = new LoginPage();
        homePage = loginPage.performLogin(userName, password);
    }

    @Then("user should navigate to home page")
    public void userShouldNavigateToHomePage() throws InterruptedException {

        homePage.logoIsDisplayed();

    }

    @When("User fill email as {string} and {string} and click on login")
    public void userFillEmailAsAndAndClickOnLogin(String userName, String password) {

        loginPage = new LoginPage();
        homePage = loginPage.performLogin2(userName, password);

    }


    @Then("error message should appear")
    public void errorMessageShouldAppear() {

        loginPage.ErrorMessage();

    }


}
