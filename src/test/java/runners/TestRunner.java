package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions",
        plugin = {"pretty", "html:target/Reports/Reports.html", "json:target/Reports/Reports.json"})


public class TestRunner {
}
//plugin = "pretty" =   making output  steps looks pretty
//dryRun = true   to check that there are tags for all steps in the features
//monochrome = true   = making output  steps looks pretty