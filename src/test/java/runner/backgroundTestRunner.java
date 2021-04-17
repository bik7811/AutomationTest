package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "classpath:features",
			glue = {"steps"},
			plugin = {"pretty","html:target/cucumber",
					"json:target/MyReports/report.json",
					"junit: target/MyReports/report.xml"
		},
			monochrome = true,
			dryRun = false 
			)
	
	
	public class backgroundTestRunner {
}
