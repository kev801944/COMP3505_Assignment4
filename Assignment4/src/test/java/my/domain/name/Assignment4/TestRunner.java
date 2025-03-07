package my.domain.name.Assignment4;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	    features = {"feature"},
	    glue = {"steps"},
	    plugin = {"html:target/cucumber-html-repo"},
	    monochrome = true
	
)

public class TestRunner {}
