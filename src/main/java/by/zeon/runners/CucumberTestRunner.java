package by.zeon.runners;

import by.zeon.listeners.TestListener;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty.html"},
        monochrome = true,
        tags = "@smoke",
        glue = "by.zeon.steps",
        features = "src/test/resources/features")
@Listeners(TestListener.class)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
