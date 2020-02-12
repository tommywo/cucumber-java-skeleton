package io.cucumber.skeleton;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = "@target/cucumber-report/rerun.txt",
    glue = {"io.cucumber.skeleton.steps"},
    plugin = {
            "json:target/cucumber-report/cucumber.json",
              "junit:target/cucumber-report/cucumber.xml"})
public class ReRunCucumberTest extends AbstractTestNGCucumberTests {
}
//