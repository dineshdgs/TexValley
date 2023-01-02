package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature/TagExpo.feature",glue="com.stepdefinition",plugin={"pretty"})

public class TagExpoRunner 
{

	
}
