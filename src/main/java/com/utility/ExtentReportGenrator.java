package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports getReports() {
		String filepath="C:\\Users\\HP\\Downloads\\Batch_Framework\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(filepath);
		 reporter.config().setDocumentTitle("Automation Test Report");
		 reporter.config().setReportName("Batch 15 Automation Report");
		 reporter.config().setTheme(Theme.DARK);
		 
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Project name", "Batch 15 Project");
	extent.setSystemInfo("Moudle Name", "ABC");
	extent.setSystemInfo("Automation", "Selenium WebDriver");
	extent.setSystemInfo("QA", "PQR");
	return extent;
	}
}
