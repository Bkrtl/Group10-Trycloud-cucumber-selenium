package net.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityPage extends BasePage {

    @FindBy(css = "[data-navigation='all']")
    public WebElement Allactivities;

    @FindBy(css = "[data-navigation='self']")
    public WebElement Byyou;

    @FindBy(css = "[data-navigation='by']")
    public WebElement Byothers;

    @FindBy(css = "[data-navigation='files_favorites']")
    public WebElement Favorites;

    @FindBy(css = "[data-navigation='files']")
    public WebElement Filechanges;

    @FindBy(css = "[data-navigation='security']")
    public WebElement Security;

    @FindBy(css = "[data-navigation='files_sharing']")
    public WebElement Fileshares;

    @FindBy(css = "[data-navigation='calendar']")
    public WebElement Calendar;

    @FindBy(css = "[data-navigation='calendar_todo']")
    public WebElement Todos;

    @FindBy(css = "[data-navigation='comments']")
    public WebElement Comments;

    @FindBy(css = "[data-navigation='deck']")
    public WebElement Deck;




}
