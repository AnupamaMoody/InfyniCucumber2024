package Cucumber2024Automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"Feature"},
				glue= {"Cucumber2024Automation.StepDefintion"},
				plugin={"pretty","html:target/cucumber-reports/cucumberreports.html"},
				tags= "@regression",
				monochrome=true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
