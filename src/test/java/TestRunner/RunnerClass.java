package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\JOSYA REDDY\\eclipse-workspace\\com.personal.firstProject\\src\\test\\java\\Features",
                  glue = {"StepDefinitions"}
                 )
	
public class RunnerClass {
	
}

