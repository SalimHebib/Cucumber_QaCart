package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStepdefs3 {

    WebDriver driver = new ChromeDriver();

    //@Given("User open website and go to login page")
    public void userOpenWebsiteAndGoToLoginPage() {

        driver.manage().window().maximize();
        driver.get("https://classic.freecrm.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    //@When("User filled email as {string} and {string} as password and click on login")
    public void userFilledEmailAsAndPasswordAndClickOnLogin(String userName, String password) {

        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }

    //@Then("error message should appear")
    public void userShouldNavigateToHomePage() {


    }


}
