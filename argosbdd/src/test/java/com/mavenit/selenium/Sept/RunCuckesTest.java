package com.mavenit.selenium.Sept;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", strict = true, dryRun = false,
        plugin = {"json:target/cucumber.json", "html:target/cucumber.html"}, tags = "@register"
        )
public class RunCuckesTest {
}
