package com.atmecs.validation;

import java.util.Properties;
import org.openqa.selenium.By;
import com.atmecs.testbase.TestBase;
import com.atmecs.utils.ConstantsFilePaths;
import com.atmecs.utils.ReadLocatorsFile;

public class ValidationInfrastrcuturePage extends TestBase {

	static String xpath;
	static Properties properties;
	static Properties properties1;
	static String actualinfra,actualinfrasructurevalue1, actualinfrasructurevalue2, actualinfrasructurevalue3,
			actualinfrasructurevalue4, actualinfrasructurevalue5;

	public static void validateInfrastructure() throws Exception {
		// read locators from locators file
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		// read expecteddata from testdata.properties
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		/*
		 * In Services,validating Infrastructure subheadings
		 */
		actualinfra = driver.findElement(By.xpath(properties.getProperty("loc.bttn.infra"))).getText();
		ValidationResult.validateData(actualinfra,properties1.getProperty("expectedinfra"), "loc.bttn.infra");

		actualinfrasructurevalue1 = driver.findElement(By.xpath(properties.getProperty("loc.validate.infrastructure.1"))).getText();
		ValidationResult.validateData(actualinfrasructurevalue1,properties1.getProperty("expectedinfrastructurevalue1"), "loc.validate.infrastructure.1");

		actualinfrasructurevalue2 = driver.findElement(By.xpath(properties.getProperty("loc.validate.infrastructure.2"))).getText();
		ValidationResult.validateData(actualinfrasructurevalue2,properties1.getProperty("expectedinfrastructurevalue2"), "loc.validate.infrastructure.2");

		actualinfrasructurevalue3 = driver.findElement(By.xpath(properties.getProperty("loc.validate.infrastructure.3"))).getText();
		ValidationResult.validateData(actualinfrasructurevalue3,properties1.getProperty("expectedinfrastructurevalue3"), "loc.validate.infrastructure.3");

		actualinfrasructurevalue4 = driver.findElement(By.xpath(properties.getProperty("loc.validate.infrastructure.4"))).getText();
		ValidationResult.validateData(actualinfrasructurevalue4,properties1.getProperty("expectedinfrastructurevalue4"), "loc.validate.infrastructure.4");

		actualinfrasructurevalue4 = driver.findElement(By.xpath(properties.getProperty("loc.validate.infrastructure.5"))).getText();
		ValidationResult.validateData(actualinfrasructurevalue4,properties1.getProperty("expectedinfrastructurevalue5"), "loc.validate.infrastructure.5");
	}
}
