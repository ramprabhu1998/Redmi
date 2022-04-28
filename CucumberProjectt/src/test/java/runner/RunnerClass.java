package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "featureFiles\\LogIn.feature", glue = "stepDefinition")

public class RunnerClass {

	//It Should Combine the Feature Files and StepDefinition File
	//Run
}
