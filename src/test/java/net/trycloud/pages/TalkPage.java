package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkPage extends BasePage{

    public TalkPage(){ PageFactory.initElements(Driver.get(),this);}
    public static int numberOfConversations=0;
    @FindBy(xpath = "//*[.='New conversation …']")
    public WebElement newConversationButton;
    @FindBy(xpath = "//*[@id='select2-drop']//input")
    public WebElement contactNameInputBox;
    @FindBy(xpath = "//ul[@class='select2-results']/li[1]/div")
    public WebElement firstMatchOfInputBox;
    @FindBy(xpath = "//div[@class='wrapper']/li[1]/div[2]")
    public WebElement conversationCreatedMessage;
    @FindBy(xpath = "//div[@class='wrapper']/li[2]/div[2]")
    public WebElement contactAddedMessage;
    @FindBy(xpath = "//ul/li[1]//li[@class='app-navigation-entry-utils-menu-button']")
    public WebElement firstItemThreeDotsButton;
    @FindBy(xpath = "//ul/li[1]/div[2]//button[@class='delete-room-button' or @class='remove-room-button']")
    public WebElement firstItemDeleteButton;
    @FindBy(xpath = "//li[@class='room-list-item']")
    public List<WebElement> allConversations;

}
