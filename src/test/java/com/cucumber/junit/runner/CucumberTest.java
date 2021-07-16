package com.cucumber.junit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/CucumberTests.json", "junit:target/cucumber-reports/CucumberTests.xml"},
        glue = "com.cucumber.junit",
        features = "src/test/resources/com.cucumber.junit.features/Search.feature"

)
public class CucumberTest {
}
