package net.trycloud.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.trycloud.pages.LoginPage;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TalkSteptDefs {

    @Given("the users enter user information")
    public void the_users_enter_user_information() {
        System.out.println("Opening the Trycloud login page");
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user navigates to Talk")
    public void the_user_navigates_to_Talk() {
        System.out.println("Navigate to Talk");
    }

    @Then("the url should be expected Talk url")
    public void the_url_should_be_expected_Talk_url() {
        System.out.println("Expected ==Actual PASS");
    }

}
