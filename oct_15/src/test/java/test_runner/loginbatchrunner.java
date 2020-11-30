package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="C:\\Users\\SURESH\\eclipse-workspace\\oct_15\\src\\test\\resources\\feature\\login.feature",
        glue= {"stepsdefine"},
        strict = true,
		dryRun = true
		)




public class loginbatchrunner {

}
