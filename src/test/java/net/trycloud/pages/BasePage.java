package net.trycloud.pages;

import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#appmenu > li:nth-child(1)")
    public WebElement File;

    @FindBy(css = "#appmenu > li:nth-child(2)")
    public WebElement Activity;

    @FindBy(css = "#appmenu > li:nth-child(3)")
    public WebElement Gallery;

    @FindBy(css = "#appmenu > li:nth-child(4)")
    public WebElement Talk;

    @FindBy(css = "#appmenu > li:nth-child(5)")
    public WebElement Calendar;

    @FindBy(css = "#appmenu > li:nth-child(6)")
    public WebElement Deck;

    @FindBy(css = "#appmenu > li:nth-child(7)")
    public WebElement Announcement;

    @FindBy(css = "#expand")
    public WebElement logMenu;

    @FindBy(css = "[data-id='logout']")
    public WebElement logOutButton;


    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(logMenu);
        BrowserUtils.clickWithJS(logOutButton);
    }


}
