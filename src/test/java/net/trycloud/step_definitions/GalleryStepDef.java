package net.trycloud.step_definitions;

import net.trycloud.pages.Gallery;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.xml.transform.sax.SAXSource;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class GalleryStepDef{


    @When("the user navigates on Dashboard - Gallery")
    public void the_user_navigates_on_Dashboard_Gallery() {
        Gallery gallery = new Gallery();
        gallery.galleryButton.click();
        System.out.println("Navigate to Gallery Succesfull");
    }
    @Then("the URL should be expected Gallery URL")
    public void the_URL_should_be_expected_Gallery_URL() {
        String expectedUrl = "http://app.trycloud.net/index.php/apps/gallery/";
        String actualtUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualtUrl);
    }
    @When("the user press the gallery button")
    public void the_user_press_the_circled_button() throws InterruptedException {
        BrowserUtils.waitFor(2);
        Gallery gallery = new Gallery();
        gallery.galleryButton.click();
        BrowserUtils.waitFor(2);
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "http://app.trycloud.net/index.php/apps/gallery/";
        Assert.assertEquals(expectedUrl,actualUrl);
        gallery.dropDownPlus.click();
        BrowserUtils.waitFor(2);
        String actualText = gallery.uploadButton.getText();
        String expectedText = "Upload";
        System.out.println("actualText = " + actualText);
        Assert.assertEquals("Check the upload button",expectedText,actualText);
    }
    @When("the user should choose upload button")

    public void the_user_should_choose_upload_button() throws AWTException, InterruptedException {
        //open the dropdown
        BrowserUtils.waitFor(2);
        Gallery gallery = new Gallery();
        BrowserUtils.waitFor(3);
        Actions actions = new Actions(Driver.get());
        actions.click(gallery.uploadButton).click().build().perform();
        BrowserUtils.waitFor(3);
    }
    @Then("the user should choose pictures from his own PC")
    public void the_user_should_choose_pictures_from_his_own_PC() {
        Gallery gallery = new Gallery();
        BrowserUtils.waitFor(1);
        gallery.loadingBarUpload.isDisplayed();
    }
    @Then("the user should manage a picture {string}")
    public void the_user_should_manage_a_picture(String options) throws InterruptedException {
        Gallery gallery = new Gallery();
        BrowserUtils.waitFor(2);
        List <WebElement> buttons = Driver.get().findElements(By.xpath("//body[@id='body-user']/div[@id='content']/div[@id='app-content']/div[@id='gallery']/div[1]"));
        Assert.assertEquals(buttons.size(),1);
        for (WebElement pictures : buttons  ) {
            System.out.println(pictures.getText());
            BrowserUtils.waitFor(3);
            pictures.click();
        }
        String fourButtons = "//input[@class='menuItem svg " + options + "Image icon-delete icon-shadow icon-white icon-32']";
        try {
            BrowserUtils.waitForClickablility(Driver.get().findElement(By.xpath(fourButtons)), 5);
            WebElement invizibleButtons = Driver.get().findElement(By.xpath(fourButtons));
            new Actions(Driver.get()).moveToElement(invizibleButtons).pause(200).doubleClick(invizibleButtons).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(fourButtons),5);
        }
        BrowserUtils.waitFor(3);
        System.out.println("Menu of manipulation picture : " + options);
        System.out.println("Successful" + options);
    }
}







