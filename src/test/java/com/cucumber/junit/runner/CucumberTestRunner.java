package com.cucumber.junit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        glue = "com.cucumber.junit",
        features = "src/test/resources/com.cucumber.junit.features/MenuSections.feature"

)
public class CucumberTestRunner {
}
