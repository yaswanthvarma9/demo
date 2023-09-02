package Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features="src\\test\\java\\Feature\\Swagl.feature",glue="StepDefinition",tags="@log1 or @log2")

//@CucumberOptions(features="src\\test\\java\\Feature\\Swagl.feature",glue="StepDefinition",tags ="@login",monochrome = true,dryRun=true)

//@CucumberOptions(features="src\\test\\java\\Feature\\Swagl.feature",glue="StepDefinition",plugin="pretty")

@CucumberOptions(features="src\\test\\java\\Feature\\Swagl.feature",glue="StepDefinition",plugin={"pretty","html:target/Cucumber-report.html",
		"junit:target/JUNITReports/log.xml","json:target/JSONreports/log.json",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	

public class Swaglogfeature1 extends AbstractTestNGCucumberTests{

}
