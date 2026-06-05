package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"StepDefinition",
    		"Hooks"},
    tags = "@Smoke",
    plugin = {
            "pretty",
            "html:target/htmlreports/report.html",
            "json:target/jsonreport/report.json",
            "junit:target/junitreport/report.xml"
    }
)

public class TestRunner {

}