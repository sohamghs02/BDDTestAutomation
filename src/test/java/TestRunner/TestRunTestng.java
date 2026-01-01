package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./myWebApp/Home.feature"}, 
		glue = {"PageContent"}
)

public class TestRunTestng extends AbstractTestNGCucumberTests{
	
}
