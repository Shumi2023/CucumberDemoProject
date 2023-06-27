package com.nexttechitc.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



public class TestrunnerTestNG {
	
@CucumberOptions (
			   
			   features = {"Features","FBsignup.feature"},
			   glue = {"com.nexttechitc.Stepdef"}
			    )

public class TestRunner extends AbstractTestNGCucumberTests{}


}
