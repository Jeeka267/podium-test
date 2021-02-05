package TestRunner;



import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
       plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        //format={"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
        features = "/Users/zhibeksabyrova/Documents/eclipse-workspace/podium-test-app/src/test/resources/features",
        glue = "/src/test/java/StepDefinitions",
        strict=true,
        monochrome=true,
       tags = "@Homepage",
        dryRun =false

//		tags="@SmokeTest",
//		tags= {"@SmokeTest,@RegressionTest"}, // OR operator to execute both Smoke and Regression Test Cases
//		tags= {"@SmokeTest","@RegressionTest"},//And Operator To Execute test cases have Both Regression and Smoke
//		tags= {"~@SmokeTest","~@RegressionTest"},// ~ Operator is used to Ignore Test cases




)
public class TestRunner {

}
