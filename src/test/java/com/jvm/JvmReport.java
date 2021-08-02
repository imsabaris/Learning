package com.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void jvmReportGenerate(String jsonPath) {
		File f = new File("C:\\Users\\riyaz\\eclipse-workspace\\eclipse\\CucumberTask\\src\\test\\resources\\Reports\\JvmReport");
		
		Configuration c = new Configuration(f, "Facebook Application");
		c.addClassifications("Platform", "Winndows");
		c.addClassifications("Browser", "Chrome");
		
		List<String> l = new LinkedList<String>();
		l.add(jsonPath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
			
	}	
}
