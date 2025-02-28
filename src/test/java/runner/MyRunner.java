package runner;

import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features= "src/test/resources/features/Login.feature",
@CucumberOptions(features= "src/test/resources/features",
glue= {"stepDefinitions","hooks"},
//tags= ("@SmokeTest,@RegressionTest"),
publish=true,
plugin= {"pretty", "html:test-output", "html:target/cucumber-html-report","json:target/json_output/cucumber.json"})
//plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})
//plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"})

public class MyRunner {

}

