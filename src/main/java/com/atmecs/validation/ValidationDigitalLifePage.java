package com.atmecs.validation;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.utils.ConstantsFilePaths;
import com.atmecs.utils.ReadLocatorsFile;

public class ValidationDigitalLifePage {
	static WebDriver driver;
	static String xpath;
	static Properties properties;
	static Properties properties1;
	static String actualdigitallifevalue1, actualdigitallifevalue2, actualdigitallifevalue3, actualdigitallifevalue4, actualdigitallifevalue5;

	public static void validateDigitallife() throws Exception {
		//read locators from locators file
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		//read expecteddata from testdata.properties
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		/*
		 * In Services,validating DigitalLife subheadings
		 */
		actualdigitallifevalue1 = driver.findElement(By.xpath(properties.getProperty("loc.validate.digitallife.1"))).getText();
		ValidationResult.validateData(actualdigitallifevalue1, properties1.getProperty("expectedvalue1"),"loc.validate.digitallife.1");

		actualdigitallifevalue2 = driver.findElement(By.xpath(properties.getProperty("loc.validate.digitallife.2"))).getText();
		ValidationResult.validateData(actualdigitallifevalue2, properties1.getProperty("expectedvalue2"),"loc.validate.digitallife.2");

		actualdigitallifevalue3 = driver.findElement(By.xpath(properties.getProperty("loc.validate.digitallife.3"))).getText();
		ValidationResult.validateData(actualdigitallifevalue3, properties1.getProperty("expectedvalue3"),"loc.validate.digitallife.3");

		actualdigitallifevalue4 = driver.findElement(By.xpath(properties.getProperty("loc.validate.digitallife.4"))).getText();
		ValidationResult.validateData(actualdigitallifevalue4, properties1.getProperty("expectedvalue4"),"loc.validate.digitallife.4");

		actualdigitallifevalue5 = driver.findElement(By.xpath(properties.getProperty("loc.validate.digitallife.5"))).getText();
		ValidationResult.validateData(actualdigitallifevalue5, properties1.getProperty("expectedvalue5"),"loc.validate.digitallife.5");
	}
}
