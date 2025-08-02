package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\umraa\\eclipse-workspace\\Cucumberdemo\\AllFeaturefiles\\Facebooklogin.feature"},
		glue = {"stepdefinition"}
		
		)
public class Runnerfile extends AbstractTestNGCucumberTests{

}
