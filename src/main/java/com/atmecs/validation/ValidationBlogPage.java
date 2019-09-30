package com.atmecs.validation;

import java.util.Properties;
import org.openqa.selenium.By;
import com.atmecs.testbase.TestBase;
import com.atmecs.utils.ConstantsFilePaths;
import com.atmecs.utils.ReadLocatorsFile;

public class ValidationBlogPage extends TestBase {
	
	static String xpath;
	static Properties properties;
	static Properties properties1;
	static String actualcontent, actualdate, actualtopic;

	public static void validateContent() throws Exception {
		// read locators from locators file
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		// read expecteddata from testdata.properties
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		/*
		 * Validating Content date topic in selected blog
		 */
		actualcontent = driver.findElement(By.xpath(properties.getProperty("loc.validate.content"))).getText();
		ValidationResult.validateData(actualcontent, properties1.getProperty("expectedcontent"),"loc.validate.content");

		actualdate = driver.findElement(By.xpath(properties.getProperty("loc.validate.date"))).getText();
		ValidationResult.validateData(actualdate, properties1.getProperty("expecteddate"), "loc.validate.date");
		ValidationGetDate.differenceBetweenTwoDates();

		actualtopic = driver.findElement(By.xpath(properties.getProperty("loc.validate.topic"))).getText();
		ValidationResult.validateData(actualtopic, properties1.getProperty("expectedtopic"), "loc.validate.topic");
	}
}
