package cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/feature", // Path to your feature files
    plugin = {"pretty", "json:target/jsonReports/cucumber-report.json"}, // Added pretty plugin for better console output
    glue = {"stepDefinations"} // Package where step definitions are located
//    tags = "@DeletePlace" // Tag to specify which scenarios to run
)
public class TestRunner {
}
