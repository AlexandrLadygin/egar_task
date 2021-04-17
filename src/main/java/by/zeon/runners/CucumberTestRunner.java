package by.zeon.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty.html"},
        glue = "by.zeon.steps",
        features = "src/test/resources/features")
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
