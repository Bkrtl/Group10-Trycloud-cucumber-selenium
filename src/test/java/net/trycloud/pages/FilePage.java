package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class FilePage {

    public FilePage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "(//*[@class='app-icon'])[1]")
    public WebElement file;

    @FindBy(className = "icon-add")
    public WebElement icon;

    @FindBy(xpath = "(//a[@class='menuitem'])[1]")
    public WebElement NewFolder;

    @FindBy(id="view29-input-folder")
    public WebElement NewFolderInput;

 @FindBy(xpath ="//h3[@data-original-title=' folder']")
    public WebElement FolderNameText;

 @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadFile;


}
