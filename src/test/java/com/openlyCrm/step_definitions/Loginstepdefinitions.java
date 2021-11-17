package com.openlyCrm.step_definitions;

import com.openlyCrm.pages.BasePage;
import com.openlyCrm.pages.LoginPage;
import com.openlyCrm.utilities.BrowserUtils;
import com.openlyCrm.utilities.ConfigurationReader;
import com.openlyCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Loginstepdefinitions extends BasePage {
LoginPage loginpage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
     String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @Given("the user enters Invalid user name {string}")
    public void the_user_enters_Invalid_user_name(String username) {
     loginpage.usernameInvalid(username);
    }

    @Given("the user enters valid password {string}")
    public void the_user_enters_valid_password(String passwordB) {
      loginpage.loginpassword(passwordB);
    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        loginpage.loginButton.click();
    }

    @Then("the user should NOT be able to login successfully")
    public void the_user_should_NOT_be_able_to_login_successfully() {
        String expectedTitle = "Portal";
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        BrowserUtils.waitFor(2);
        Assert.assertFalse(Driver.get().getTitle().contains(expectedTitle));
    }


    @Then("the user should be able to login homepage")
    public void theUserShouldBeAbleToLoginHomepage() {

        String expectedTitle = "Portal";
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }

    @And("the user enters valid user name {string}")
    public void theUserEntersValidUserName(String username) {
        loginpage.loginUsername(username);
    }

    @And("the user enters Invalid password {string}")
    public void theUserEntersInvalidPassword(String password) {
        loginpage.Invalidpassword(password);
    }
}
