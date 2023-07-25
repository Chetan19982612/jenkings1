package assignment.cucumber;

import cucumber.api.CucumberOptions;

@CucumberOptions(
   features="src/test/java/cucumber.feature",
   glue = "cucumberrr",
   tags = {"@test2"}
   
   )


public class Testrunner {

}
