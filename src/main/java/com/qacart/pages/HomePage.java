package com.qacart.pages;

import com.qacart.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".logo_text")
    public WebElement homePageLogo;

    @FindBy(xpath = "//*[@title='Contacts']")
    public WebElement menuContact;


    public void logoIsDisplayed() {

        driver.switchTo().frame("mainpanel");
        Assert.assertTrue(homePageLogo.isDisplayed());

    }

    public void clickOnContacts() {

        driver.switchTo().frame("mainpanel");
        menuContact.click();

    }


}
