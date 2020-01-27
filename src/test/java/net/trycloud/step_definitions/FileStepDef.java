package net.trycloud.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.FilePage;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class FileStepDef {
    @Then("the user should get title as expected")
    public void the_user_should_get_title_as_expected() {
        FilePage filePage=new FilePage();
        filePage.file.click();
        String actual= Driver.get().getTitle();
        System.out.println(actual);
        String expected="Files - Trycloud";
        Assert.assertEquals(expected,actual);

    }

    @When("the user should be click the icon")
    public void the_user_should_be_click_the_icon() {
        BrowserUtils.waitFor(4);
    FilePage filePage=new FilePage();
    filePage.icon.click();
    BrowserUtils.waitFor(10);



    }

    @Then("the user should create new folder")
    public void the_user_should_create_new_folder() {
        FilePage filePage = new FilePage();
        filePage.NewFolder.click();
        BrowserUtils.waitFor(10);
        filePage.NewFolderInput.sendKeys("Flower7" + Keys.ENTER);
        BrowserUtils.waitFor(10);


    }

    @Then("the user should upload the file")
    public void the_user_should_upload_the_file() {
        FilePage filePage =new FilePage();
        filePage.uploadFile.click();
       // filePage.uploadFile.sendKeys("/users/java/Desktop/file.txt");
        //filePage.uploadFile.click();



    }

}




