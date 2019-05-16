package com.testautomation.StepDef;

import java.util.Map;
import java.util.Properties;

import com.testautomation.Utility.ExcelHandler;
import com.testautomation.Utility.PropertiesFileReader;
import com.testautomation.Utility.TestDataHandler;
import com.testautomation.Utility.TestDataPropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestDataReadingStepdef {
	
	TestDataHandler testdata = new TestDataHandler();
	TestDataPropertiesFileReader obj = new TestDataPropertiesFileReader();
	
	@Given("^Read Test Data for testcase_(\\d+)$")
	public void read_Test_Data_for_testcase_(int arg1) throws Throwable {
	
		Properties properties = obj.getProperty();
		Map<String,String> TestDataInMap  = ExcelHandler.getTestDataInMap(properties.getProperty("testdatafilepath"), properties.getProperty("sheetname"), "TestCase_001");
	System.out.println(TestDataInMap.get("Skill_7"));
	testdata.setTestDataInMap(TestDataInMap);
	}
	
	
	@When("^Read Test Data for skill two")
	public void read_Test_Data_for_skill_Two() throws Throwable {
		Map<String,String> testDataInMap = testdata.getTestDataInMap();
		System.out.println(testDataInMap.get("Skill_2"));
	}

	@Then("^Read Test Data for skill three")
	public void read_Test_Data_for_skill_Three() throws Throwable {
		Map<String,String> testDataInMap = testdata.getTestDataInMap();
		System.out.println(testDataInMap.get("Skill_3"));
	
	}

}
