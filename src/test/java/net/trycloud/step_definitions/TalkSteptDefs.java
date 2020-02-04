package net.trycloud.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.DashboardPage;
import net.trycloud.pages.TalkPage;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.junit.Assert;

public class TalkSteptDefs {

    @When("the user navigates to Talk")
    public void the_user_navigates_to_Talk() {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.Talk.click();
        BrowserUtils.waitFor(3);
        System.out.println("Navigate to Talk");
    }
    @Then("the url should be expected Talk url")
    public void the_url_should_be_expected_Talk_url() {
        BrowserUtils.waitFor(2);
        String actualUrl= Driver.get().getCurrentUrl();
        String expectedUrl="http://app.trycloud.net/index.php/apps/spreed/";
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals("Verify that actual url is expected url",expectedUrl,actualUrl);
    }


    @When("the user clicks on new conversation")
    public void the_user_clicks_on_new_conversation() {
        BrowserUtils.waitForVisibility(new TalkPage().newConversationButton,3);
        new TalkPage().newConversationButton.click();
    }
    @When("the user types {string} and clicks")
    public void the_user_types_and_clicks(String contactName) {
        TalkPage talkPage=new TalkPage();
        talkPage.contactNameInputBox.sendKeys(contactName);
        BrowserUtils.waitForClickablility(talkPage.firstMatchOfInputBox,3);
        talkPage.firstMatchOfInputBox.click();
    }
    @Then("the messages {string} {string} should be displayed")
    public void the_messages_should_be_displayed(String expectedConversationCreatedMessage, String expectedContactAddedMessage) {
        TalkPage talkPage=new TalkPage();
        BrowserUtils.waitForVisibility(talkPage.conversationCreatedMessage,4);
        String actualConversationCreatedMessage=talkPage.conversationCreatedMessage.getText();
        String actualContactAddedMessage=talkPage.contactAddedMessage.getText();
        Assert.assertEquals(expectedConversationCreatedMessage,actualConversationCreatedMessage);
        Assert.assertEquals(expectedContactAddedMessage,actualContactAddedMessage);
    }
    @When("the user clicks on the three dots next to the first conversation")
    public void the_user_clicks_on_the_three_dots_next_to_the_first_conversation() {
        BrowserUtils.waitForClickablility(new TalkPage().firstItemThreeDotsButton,4);
        new TalkPage().firstItemThreeDotsButton.click();
    }
    @When("clicks on delete conversation from the dropdown")
    public void clicks_on_delete_conversation_from_the_dropdown() {
        TalkPage.numberOfConversations=new TalkPage().allConversations.size();
        new TalkPage().firstItemDeleteButton.click();
    }
    @Then("the number of conversations should be one less")
    public void the_number_of_conversations_should_be_one_less() {
        Assert.assertEquals(TalkPage.numberOfConversations-1,new TalkPage().allConversations.size());
    }
}