package org.serviceToolBox.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions (

        /*
        plugin = {
                "json:target/cucumber.json",
                 // "pretty", // provides additional info about the scenario that is being executed.
                "html:target/cucumber-report.html", // this is the HTML report
                "rerun:target/rerun.txt",    // this is to run failed tests
                "me.jvt.cucumber.report.PrettyReports:target/cucumber" // maven cucumber reporting
        },
        */

        features = "src/main/resources/features",     // This may be wrong check it
        glue = "org/serviceToolBox/stepDefinitions",
        dryRun = false,
        tags = "@LiveDataCheck",
        publish = false

)

public class CukesRunner {


}
