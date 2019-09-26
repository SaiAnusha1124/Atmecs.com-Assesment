package com.atmecs.validation;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.utils.ConstantsFilePaths;
import com.atmecs.utils.ReadLocatorsFile;

public class ValidationCareersPage {
	static WebDriver driver;
	static String xpath;
	static Properties properties;
	static Properties properties1;
	static String actualautomationengineer,actualdevopsengineer,actualseniornetengineer,actualseniorjavaJ2EEengineer;

	public static void validateCareers() throws Exception {
		//read locators from locators file
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		//read expecteddata from testdata.properties
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		/*
		 * In footer part validating Carrers and subheadings
		 */
		actualautomationengineer = driver.findElement(By.xpath(properties.getProperty("loc.validate.automationengineer"))).getText();
		ValidationResult.validateData(actualautomationengineer, properties1.getProperty("expectedautomationengineer"), "loc.validate.automationengineer");
		
		actualdevopsengineer = driver.findElement(By.xpath(properties.getProperty("loc.validate.devopsengineer"))).getText();
		ValidationResult.validateData(actualdevopsengineer, properties1.getProperty("expecteddevopsengineer"), "loc.validate.devopsengineer");

		actualseniornetengineer = driver.findElement(By.xpath(properties.getProperty("loc.validate.seniornetengineer"))).getText();
		ValidationResult.validateData(actualseniornetengineer, properties1.getProperty("expectedseniornetengineer"), "loc.validate.seniornetengineer");

		actualseniorjavaJ2EEengineer = driver.findElement(By.xpath(properties.getProperty("loc.validate.seniorjavaJ2EEengineer"))).getText();
		ValidationResult.validateData(actualseniorjavaJ2EEengineer, properties1.getProperty("expectedseniorjavaJ2EEengineer"), "loc.validate.seniorjavaJ2EEengineer");


	}
}
