package trendyol.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import trendyol.utilities.*;

import static trendyol.utilities.ConfigurationReader.*;

public class Base_Page {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

    @FindBy(xpath = "//div/p[text()='Giriş Yap']")
    public WebElement loginButton;

    @FindBy(id = "#login-email")
    public WebElement usernameBox;

    @FindBy(id = "#login-password-input")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    public void login(){
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(submitButton));
        usernameBox.sendKeys(getProperty("username"));
        passwordBox.sendKeys(getProperty("password"));
        submitButton.click();
    }

}
