package net.trycloud.step_definitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.ActivityPage;
import net.trycloud.pages.DashboardPage;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.junit.Assert;

public class ActivityStepDefs {


    @When("the	user	navigates to	Activity")
    public void the_user_navigates_to_Activity() {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.Activity.click();
        BrowserUtils.waitFor(3);
    }

    @When("the	user	clicks	on	All activities")
    public void the_user_clicks_on_All_activities() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Allactivities.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the	All activities page	should	be	displayed")
    public void the_All_activities_page_should_be_displayed() {
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }

    @When("the	user	clicks	on	By you")
    public void the_user_clicks_on_By_you() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Byyou.click();

    }

    @Then("the	By you page	should	be	displayed")
    public void the_By_you_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/?filter=self";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }

    @When("the	user	clicks	on	By others")
    public void the_user_clicks_on_By_others() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Byothers.click();
    }

    @Then("the	By others page	should	be	displayed")
    public void the_By_others_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/?filter=by";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }

    @When("the	user	clicks	on	Favorites")
    public void the_user_clicks_on_Favorites() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Favorites.click();
    }

    @Then("the	Favorites page	should	be	displayed")
    public void the_Favorites_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/?filter=files_favorites";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }

    @When("the	user	clicks	on	File changes")
    public void the_user_clicks_on_File_changes() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Filechanges.click();
    }

    @Then("the	File changes page	should	be	displayed")
    public void the_File_changes_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/?filter=files";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }

    @When("the	user	clicks	on	Security")
    public void the_user_clicks_on_Security() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Security.click();
    }

    @Then("the	Security page	should	be	displayed")
    public void the_Security_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/?filter=security";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }

    @When("the	user	clicks	on	File shares")
    public void the_user_clicks_on_File_shares() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Fileshares.click();
    }

    @Then("the	File shares page	should	be	displayed")
    public void the_File_shares_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/?filter=files_sharing";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }

    @When("the	user	clicks	on	Calendar")
    public void the_user_clicks_on_Calendar() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Calendar.click();
    }

    @Then("the	Calendar page	should	be	displayed")
    public void the_Calendar_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/?filter=calendar";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }

    @When("the	user	clicks	on	Todos")
    public void the_user_clicks_on_Todos() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Todos.click();
    }

    @Then("the	Todos page	should	be	displayed")
    public void the_Todos_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/?filter=calendar_todo";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }

    @When("the	user	clicks	on	Comments")
    public void the_user_clicks_on_Comments() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Comments.click();
    }

    @Then("the	Comments page	should	be	displayed")
    public void the_Comments_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/?filter=comments";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }

    @When("the	user	clicks	on	Deck")
    public void the_user_clicks_on_Deck() {
        ActivityPage activityPage=new ActivityPage();
        activityPage.Deck.click();
    }

    @Then("the	Deck page	should	be	displayed")
    public void the_Deck_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
        String actualUrl=Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/activity/?filter=deck";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",actualUrl,expectedUrl);
    }
}
