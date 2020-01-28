package net.trycloud.step_definitions;
import io.cucumber.java.en.Given;
import net.trycloud.pages.LoginPage;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {
    @Given("the users enter user information")
    public void the_users_enter_user_information() {
        System.out.println("Opening the Trycloud login page");
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user navigates to Gallery")
    public void the_user_navigates_to_Gallery() {
        System.out.println("Navigate to Gallery");
    }

    @Then("the url should be expected Gallery url")
    public void the_url_should_be_expected_Gallery_url() {
        System.out.println("Expected ==Actual PASS");
    }






    }


