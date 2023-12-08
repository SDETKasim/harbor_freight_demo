package com.hf_project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "html:target/cucumber-report.html",
                    "rerun:target/rerun.txt" ,
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                    "json:target/cucumber.json"
            },
            features = "src/test/resources/features" ,
            glue = "com/hf_project/steps",
            dryRun = false,
            tags = "@demo",
            publish = true
    )

    public class Runner {}



