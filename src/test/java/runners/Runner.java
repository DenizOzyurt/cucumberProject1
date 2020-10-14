package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        //Where is the path of the feature folder
        features = "src\\test\\resources\\features",
        //path of the step definitons
        glue = "stepdefinitions",
        tags= "@hooks",
        dryRun = false

)
public class Runner {
    //Runner class is to run the feature files
    //This Runner class is also used to configure and control the framework


}
