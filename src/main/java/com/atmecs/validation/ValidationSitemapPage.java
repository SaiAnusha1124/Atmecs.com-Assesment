package com.atmecs.validation;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.utils.ConstantsFilePaths;
import com.atmecs.utils.ReadLocatorsFile;

public class ValidationSitemapPage {
	static WebDriver driver;
	static String xpath;
	static Properties properties;
	static Properties properties1;
	static String actualhome, actualaboutus, actualserices, actualpartners, actualcasestudiesold, actualnews,
			actualcareers, actualcontactus;

	public static void validateSitemap() throws Exception {
		//read locators from locators file
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		//read expecteddata from testdata.properties
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		/*
		 * In footer part validating Sitmao and subheadings
		 */
		actualhome = driver.findElement(By.xpath(properties.getProperty("loc.validate.home"))).getText();
		ValidationResult.validateData(actualhome, properties1.getProperty("expectedhome"), "loc.validate.home");

		actualaboutus = driver.findElement(By.xpath(properties.getProperty("loc.validate.aboutus"))).getText();
		ValidationResult.validateData(actualhome, properties1.getProperty("expectedaboutus"), "loc.validate.aboutus");

		actualserices = driver.findElement(By.xpath(properties.getProperty("loc.validate.services"))).getText();
		ValidationResult.validateData(actualaboutus, properties1.getProperty("expectedservices"),
				"loc.validate.services");

		actualpartners = driver.findElement(By.xpath(properties.getProperty("loc.validate.partners"))).getText();
		ValidationResult.validateData(actualaboutus, properties1.getProperty("expectedpartners"),
				"loc.validate.partners");

		actualcasestudiesold = driver.findElement(By.xpath(properties.getProperty("loc.validate.casestudiesold")))
				.getText();
		ValidationResult.validateData(actualaboutus, properties1.getProperty("expectedcasestudiesold"),
				"oc.validate.casestudiesold");

		actualnews = driver.findElement(By.xpath(properties.getProperty("loc.validate.news"))).getText();
		ValidationResult.validateData(actualaboutus, properties1.getProperty("expectednews"), "loc.validate.news");

		actualcareers = driver.findElement(By.xpath(properties.getProperty("loc.validate.careers"))).getText();
		ValidationResult.validateData(actualaboutus, properties1.getProperty("expectedcareers"),
				"loc.validate.careers");

		actualcontactus = driver.findElement(By.xpath(properties.getProperty("loc.validate.contactus"))).getText();
		ValidationResult.validateData(actualaboutus, properties1.getProperty("expectedcontactus"),
				"loc.validate.contactus");
	}
}
