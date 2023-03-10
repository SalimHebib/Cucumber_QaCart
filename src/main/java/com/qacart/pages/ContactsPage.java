package com.qacart.pages;

import com.qacart.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactsPage extends Base {

    public ContactsPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "cs_email")
    public WebElement emailTextField;

    @FindBy(xpath = "//*[@value='New Contact']")
    public WebElement addNewContact;

    @FindBy(name = "first_name")
    public WebElement firstName;

    @FindBy(name = "surname")
    public WebElement surname;

    @FindBy(css = "[value=\"Save\"]")
    public WebElement save;

    @FindBy(css = "[value=\"Previous\"]")
    public WebElement previous;


    public void EmailField() {

        Assert.assertTrue(emailTextField.isDisplayed());

    }

    public void clickAddNewContact() {
        addNewContact.click();
    }

    public void setNewContact() {


        firstName.sendKeys("Salamo");
        surname.sendKeys("Amazigh");
        save.click();
    }

    public void checkPrevious() {
        Assert.assertTrue(previous.isDisplayed());
    }
}
