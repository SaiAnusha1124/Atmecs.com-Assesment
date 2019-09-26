package com.atmecs.validation;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.utils.ConstantsFilePaths;
import com.atmecs.utils.ReadLocatorsFile;

public class ValidationContactusPage {
	static WebDriver driver;
	static String xpath;
	static Properties properties;
	static Properties properties1;
	static String actualUSheadquarters, actualUSRDCenter, actualIndiaHyderabad, actualIndiaBangalore,
			actualIndiaChennai, actualinfo, actualEuropeIreland;

	public static void validateContactus() throws Exception {
		//read locators from locators file
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		//read expecteddata from testdata.properties
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		/*
		 * In footer part validating Contactus and subheadings
		 */
		actualUSheadquarters = driver.findElement(By.xpath(properties.getProperty("loc.validate.USheadquarters"))).getText();
		ValidationResult.validateData(actualUSheadquarters, properties1.getProperty("expectedUSheadquarters"),"loc.validate.USheadquarters");
		
		actualUSRDCenter = driver.findElement(By.xpath(properties.getProperty("loc.validate.USRDCenter"))).getText();
		ValidationResult.validateData(actualUSRDCenter, properties1.getProperty("expectedUSRDCenter"),"loc.validate.USRDCenter");

		actualIndiaHyderabad = driver.findElement(By.xpath(properties.getProperty("loc.validate.IndiaHyderabad"))).getText();
		ValidationResult.validateData(actualIndiaHyderabad, properties1.getProperty("expectedIndiaHyderabad"),"loc.validate.IndiaHyderabad");

		actualIndiaBangalore = driver.findElement(By.xpath(properties.getProperty("loc.validate.IndiaBangalore"))).getText();
		ValidationResult.validateData(actualIndiaBangalore, properties1.getProperty("expectedIndiaBangalore"),"loc.validate.IndiaBangalore");

		actualIndiaChennai = driver.findElement(By.xpath(properties.getProperty("loc.validate.IndiaChennai"))).getText();
		ValidationResult.validateData(actualIndiaChennai, properties1.getProperty("expectedIndiaChennai"),"loc.validate.IndiaChennai");

		actualinfo = driver.findElement(By.xpath(properties.getProperty("loc.validate.info"))).getText();
		ValidationResult.validateData(actualinfo, properties1.getProperty("expectedinfo"),"loc.validate.info");

		actualEuropeIreland = driver.findElement(By.xpath(properties.getProperty("loc.validate.EuropeIreland"))).getText();
		ValidationResult.validateData(actualEuropeIreland, properties1.getProperty("expectedEuropeIreland"),"loc.validate.EuropeIreland");


	}
}