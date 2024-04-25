package ru.gb.pom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
//import org.openqa.selenium.WebDriver;
import com.codeborne.selenide.impl.SelenidePageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final WebDriverWait wait;

    //@FindBy(css="form#login input[type='text']")
    //private WebElement usernameField;
    private SelenideElement usernameField = $("form#login input[type='text']");

    //@FindBy(css="form#login input[type='password']")
    //private WebElement passwordField;
    private SelenideElement passwordField = $("form#login input[type='password']");
    //@FindBy(css="form#login button")
    //private WebElement loginButton;
    private SelenideElement loginButton = $("form#login button");

     public LoginPage(WebDriver driver, WebDriverWait wait) {
         PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    public void login(String username, String password) {
        typeUsernameInField(username);
        typePasswordInField(password);
        clickLoginButton();
    }

    public void typeUsernameInField (String username) {
        usernameField.should(Condition.visible).sendKeys(username);
        //wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
    }

    public void typePasswordInField (String password) {
        passwordField.should(Condition.visible).sendKeys(password);
        //wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
    }

    public void clickLoginButton () {
        loginButton.should(Condition.visible).click();
        //wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
    }
}
