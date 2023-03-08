package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class MyStepdefs4 {

    WebDriver driver = new ChromeDriver();


    //@Given("User open website and go to login page")
    public void userOpenWebsiteAndGoToLoginPage() {

        driver.manage().window().maximize();
        driver.get("https://classic.freecrm.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


    }

    //@When("User fill email as {string} and password as {string} and click on login")
    public void userFillEmailAsAndPasswordAsAndClickOnLogin(String userName, String password) {

        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.close();

    }

    //@Then("user should navigate to home page")
    public void userShouldNavigateToHomePage() {

        driver.switchTo().frame("mainpanel");
        //System.out.println(driver.findElement(By.cssSelector(".logo_text")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(".logo_text")).isDisplayed());



    }


    //@When("User fill email as {string} and {string} and click on login")

    public void userFillEmailAsAndAndClickOnLogin(String userName, String password) {
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }

    //@Then("error message should appear")
    public void errorMessageShouldAppear() {

        Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());

        driver.quit();
    }
}
