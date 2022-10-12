package youtube.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import youtube.utilities.*;

import static youtube.utilities.ConfigurationReader.*;

public class Base_Page {

    public Base_Page(){PageFactory.initElements(Driver.getDriver(),this);}

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

    @FindBy(xpath = "/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")
    public WebElement searchBox;

    @FindBy(xpath = "/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button")
    public WebElement searchIcon;

    @FindBy(xpath = "/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div[2]/div/div/ytd-player/div/div/div[17]/div/div[3]/div/div[2]/span/button/span")
    public WebElement skipButton;



}
