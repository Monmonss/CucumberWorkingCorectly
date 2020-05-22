package factory;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", //położenie feature files
        glue = "steps",
        plugin = {"pretty"})
public class RunCucumberTest extends AbstractTestNGCucumberTests{
}
