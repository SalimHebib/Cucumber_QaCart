package com.qacart.pages;

import com.qacart.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    public WebElement loginName;

    @FindBy(name = "password")
    public WebElement loginPass;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement login;


    public HomePage performLogin(String name, String pass) {
        loginName.sendKeys(name);
        loginPass.sendKeys(pass);
        login.click();

        return new HomePage();
    }


    public HomePage performLogin2(String name, String pass) {
        loginName.sendKeys(name);
        loginPass.sendKeys(pass);
        login.click();

        return new HomePage();

    }


    public void ErrorMessage() {

        Assert.assertTrue(loginName.isDisplayed());

    }
}
