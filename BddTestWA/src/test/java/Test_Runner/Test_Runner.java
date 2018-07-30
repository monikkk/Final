package Test_Runner;

import org.junit.runner.*;
import cucumber.api.junit.*;
import cucumber.api.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue="p2")
public class Test_Runner {
	
}
