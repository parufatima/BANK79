package com.TestRunnerBank;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.UtilityBank.BaseBank;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features={"src/test/bankresourses/BankFeatures"},
		        plugin={"json:target/cucumber.json"},
		        glue= "StepDepBank", tags= {"@Login"})
		
		
		

public class BankRunner extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void startURl() {
		BaseBank test =new BaseBank();
		
		test.initBankBrowser();
	}
	
	@AfterTest
	public void closeURL() {
		BaseBank test =new BaseBank();
		test.driver.quit();
	}

}
