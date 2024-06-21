package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources",
glue= {"StepDefinations"},
monochrome = true,
plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		
        
         },
tags = "@pomtest3"

		)
public class TestRunner {

}
