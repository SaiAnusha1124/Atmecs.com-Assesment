package com.atmecs.validation;

import java.util.Properties;
import org.openqa.selenium.By;
import com.atmecs.testbase.TestBase;
import com.atmecs.utils.ConstantsFilePaths;
import com.atmecs.utils.ReadLocatorsFile;

public class ValidationDigitalLifePage extends TestBase {

	static String xpath;
	static Properties properties;
	static Properties properties1;
	static String actualdigitallife,actualdigitallifevalue1, actualdigitallifevalue2, actualdigitallifevalue3, actualdigitallifevalue4,
			actualdigitallifevalue5;

	public static void validateDigitallife() throws Exception {
		// read locators from locators file
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		// read expecteddata from testdata.properties
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		/*
		 * In Services,validating DigitalLife subheadings
		 */
		actualdigitallife = driver.findElement(By.xpath(properties.getProperty("loc.bttn.digital"))).getText();
		ValidationResult.validateData( actualdigitallife,properties1.getProperty("expecteddigital"),"loc.bttn.digital");

		actualdigitallifevalue1 = driver.findElement(By.xpath(properties.getProperty("loc.validate.digitallife.1"))).getText();
		ValidationResult.validateData( actualdigitallifevalue1,properties1.getProperty("expecteddigitallifevalue1"),"loc.validate.digitallife.1");

		actualdigitallifevalue2 = driver.findElement(By.xpath(properties.getProperty("loc.validate.digitallife.2"))).getText();
		ValidationResult.validateData(actualdigitallifevalue2, properties1.getProperty("expecteddigitallifevalue2"),"loc.validate.digitallife.2");

		actualdigitallifevalue3 = driver.findElement(By.xpath(properties.getProperty("loc.validate.digitallife.3"))).getText();
		ValidationResult.validateData(actualdigitallifevalue3, properties1.getProperty("expecteddigitallifevalue3"),"loc.validate.digitallife.3");

		actualdigitallifevalue4 = driver.findElement(By.xpath(properties.getProperty("loc.validate.digitallife.4"))).getText();
		ValidationResult.validateData(actualdigitallifevalue4, properties1.getProperty("expecteddigitallifevalue4"),"loc.validate.digitallife.4");

		actualdigitallifevalue5 = driver.findElement(By.xpath(properties.getProperty("loc.validate.digitallife.5"))).getText();
		ValidationResult.validateData(actualdigitallifevalue5, properties1.getProperty("expecteddigitallifevalue5"),"loc.validate.digitallife.5");

	}
}
