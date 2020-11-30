package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="C:\\Users\\SURESH\\eclipse-workspace\\oct_15\\src\\test\\resources\\feature\\logo.feature",
        glue="step_defination"
		
		
		)






public class batchrunner {

}
