package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="C:\\Users\\lenovo\\Downloads\\oct_15\\src\\test\\resources\\feature\\login.feature",
        glue= {"step_defination"},
        strict = true,
		dryRun = true
		)




public class loginbatchrunner {

}
