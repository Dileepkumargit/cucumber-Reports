package features;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(ExtendedCucumber.class)
//@ExtendedCucumberOptions(
//		jsonReport = "target/cucumber.json",
//		jsonUsageReport = "target/cucumber-usage.json",
//		usageReport = true,
//		detailedReport = true,
//		detailedAggregatedReport = true,
//		overviewChartsReport = true,
//		overviewReport = true,
//		outputFolder = "target")
@CucumberOptions(
		features="C:\\Users\\abc\\eclipse-workspace\\Reports\\src\\test\\java\\features\\google.feature", 
		glue="JavaCode",
		plugin = { "html:target/cucumber-report",
				"json:target/cucumber.json","pretty:target/cucumber-pretty.txt, com.avenstack.extentreports.cucumber.adpter.ExtentCucumberAdpter"},
        monochrome = true
		)
public class RunTest {

}
