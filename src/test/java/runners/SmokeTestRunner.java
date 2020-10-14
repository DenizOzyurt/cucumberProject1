package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/default-cucumber-reports1",
                "json:target/json-reports/cucumber3.json",
                "junit:target/xml-report/cucumber3.xml"
        },
        //Where is the path of the feature folder
        features = "src\\test\\resources\\features",
        //path of the step definitons
        glue = "stepdefinitions",
        tags= "@smoke",
        dryRun = false

)





public class SmokeTestRunner {
}
