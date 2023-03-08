package stepDefinitions;

import com.qacart.base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Base {




    @Before("@Sanity")
    public void runsBeforeAnyScenario() {

        System.out.println("Runs Before Any Scenario");

    }

    @After
    public void runsAfterAnyScenario() {

        System.out.println("Runs After Any Scenario");

        driver.quit();

    }
}
