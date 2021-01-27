package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/Priya/eclipse-workspace/cucumber_java/Features", glue= {"stepDefinitions"} , monochrome =true,
plugin = {"pretty","junit:target/JUnitreport/report1.xml"})	
public class TestRunner {

}
