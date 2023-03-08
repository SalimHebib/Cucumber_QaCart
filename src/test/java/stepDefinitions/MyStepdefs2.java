package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStepdefs2 {

    WebDriver driver = new ChromeDriver();

    //@Given("User open website and go to login page")
    public void userOpenWebsiteAndGoToLoginPage() {

        driver.manage().window().maximize();
        driver.get("https://classic.freecrm.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    //@When("User filled email and password and click on login")
    public void userFilledEmailAsAndPasswordAndClickOnLogin(DataTable table) {

        driver.findElement(By.name("username")).sendKeys(table.cell(0,0));
        driver.findElement(By.name("password")).sendKeys(table.cell(0,1));
        driver.findElement(By.xpath("//input[@value='Login']")).click();


    }

    //@Then("user should navigate to home page")
    public void userShouldNavigateToHomePage() {


        driver.switchTo().frame("mainpanel");
        System.out.println(driver.findElement(By.cssSelector(".logo_text")).isDisplayed());

        driver.close();
    }
}
