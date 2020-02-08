package net.trycloud.pages;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Gallery extends BasePage{
    public Gallery(){ PageFactory.initElements(Driver.get(),this);}
    @FindBy(xpath = "//ul[@id='appmenu']//li[3]//a[1]")
    public WebElement galleryButton;
    @FindBy(xpath = "//a[@class='button new']")
    public WebElement dropDownPlus;
    @FindBy(xpath = "//div[@id='uploadprogressbar']")
    public WebElement loadingBarUpload;
    @FindBy(xpath = "//label[@class='menuitem']")
    public WebElement uploadButton;
    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadFile;
    @FindBy(xpath = "//span[@class='displayname'][contains(text(),'New folder')]")
    public WebElement newFolder;
    @FindBy(xpath = " //span[contains(text(),'New text file')]" )
    public WebElement newTextFile;
    @FindBy(xpath = "//input[@class='menuItem svg shareImage icon-share icon-shadow icon-white icon-32']")
    public WebElement picsShareOption;
    @FindBy(xpath = "//input[@class='menuItem svg shareImage icon-share icon-shadow icon-white icon-32']")
    public WebElement picsDeleteOption;
    @FindBy(xpath = "//input[@class='menuItem svg shareImage icon-share icon-shadow icon-white icon-32']")
    public WebElement picsDownloadOption;
    @FindBy(xpath = "//input[@class='menuItem svg shareImage icon-share icon-shadow icon-white icon-32']")
    public WebElement picsCloseOption;
    @FindBy(xpath = " //div[@id='gallery']")
    public WebElement appContent;
}