package io.cucumber.skeleton;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
    tags = "@bar",
    glue = {"io.cucumber.skeleton.steps"},
    plugin = {
        "rerun:rerun.txt",
            "json:target/cucumber-report/cucumber.json",
              "junit:target/cucumber-report/cucumber.xml"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
//