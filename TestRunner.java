package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@Cucumber.Options(features = "Features",glue={"NewTours_App"}
)

public class TestRunner {

}
