package stepDefinitions;

import com.qacart.base.Base;
import com.qacart.pages.ContactsPage;
import com.qacart.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ContactsSteps extends Base {


    HomePage homePage;
    ContactsPage contactsPage;


    @And("Clicks on contacts")// we can use When
    public void clicksOnContacts() {

        homePage = new HomePage();
        homePage.clickOnContacts();

    }

    @Then("Email text filed should be visible")
    public void emailTextFiledShouldBeVisible() {

        contactsPage = new ContactsPage();
        contactsPage.EmailField();

    }

    @And("Clicks on add new contact")
    public void clicksOnAddNewContact() {

        contactsPage = new ContactsPage();
        contactsPage.clickAddNewContact();

    }

    @And("Fll the first name and password")
    public void fllTheFirstNameAndPassword() {

        contactsPage = new ContactsPage();
        contactsPage.setNewContact();

    }

    @Then("A new contact should be added")
    public void aNewContactShouldBeAdded() {

        contactsPage = new ContactsPage();
        contactsPage.checkPrevious();


    }

}
