package org.serviceToolBox.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "org/serviceToolBox/stepDefinitions/definitions",
        features = "@target/rerun.txt"     // This may be wrong check it
)



// FAILED TEST RUNNER

public class FailedTestRunner {






}
