package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.jvm.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/fbregistration.feature",glue="com.steps",dryRun=false,monochrome=true,strict=true,tags="@smoke",
				plugin= {"pretty",
				"html:C:/Users/riyaz/eclipse-workspace/eclipse/CucumberTask/src/test/resources/Reports/HTMLreport",
				"json:C:/Users/riyaz/eclipse-workspace/eclipse/CucumberTask/src/test/resources/Reports/JsonReport/jsonreport.json",
				"junit:C:/Users/riyaz/eclipse-workspace/eclipse/CucumberTask/src/test/resources/Reports/JunitReport/junitreport.xml",
				"rerun:C:/Users/riyaz/eclipse-workspace/eclipse/CucumberTask/Rerun/failed.txt"
				})

public class TestRunnerClass {
	@AfterClass
	public static void jvm() {
		JvmReport.jvmReportGenerate("C:/Users/riyaz/eclipse-workspace/eclipse/CucumberTask/src/test/resources/Reports/JsonReport/jsonreport.json");
	}

}
