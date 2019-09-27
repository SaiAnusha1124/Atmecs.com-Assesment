package com.atmecs.validation;

import java.util.Properties;
import org.openqa.selenium.By;
import com.atmecs.testbase.TestBase;
import com.atmecs.utils.ConstantsFilePaths;
import com.atmecs.utils.ReadLocatorsFile;

public class ValidationServicesPage extends TestBase {
	static String xpath;
	static Properties properties;
	static Properties properties1;
	static String actualartificialintelligence, actualaugmentedreality, actualqualityengineering, actualblockchain, actualroboticprocessautomation, actualcloudservices,
			actualenterpriseanalytics, actualinternetofthings, actualmobilecomputing,actualproductengineering;

	public static void validateServices() {
		//read locators from locators file
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		//read expecteddata from testdata.properties
		properties1 = ReadLocatorsFile.loadProperty(ConstantsFilePaths.TESTDATA1_FILE);
		/*
		 * In footer part validating Services and subheadings
		 */
		actualartificialintelligence = driver.findElement(By.xpath(properties.getProperty("loc.validate.artificialintelligence"))).getText();
		ValidationResult.validateData(actualartificialintelligence, "expectedartificialintelligence",properties1.getProperty("loc.validate.artificialintelligence"));
		
		actualaugmentedreality = driver.findElement(By.xpath(properties.getProperty("loc.validate.augmentedreality"))).getText();		
		ValidationResult.validateData(actualaugmentedreality, properties1.getProperty("expectedaugmentedreality"),"loc.validate.augmentedreality");
		
		actualqualityengineering = driver.findElement(By.xpath(properties.getProperty("loc.validate.qualityengineering"))).getText();
		ValidationResult.validateData(actualqualityengineering, properties1.getProperty("expectedqualityengineering"),"loc.validate.qualityengineering");

		actualblockchain = driver.findElement(By.xpath(properties.getProperty("loc.validate.blockchain"))).getText();
		ValidationResult.validateData(actualblockchain, properties1.getProperty("expectedblockchain"),"loc.validate.blockchain");

		actualroboticprocessautomation = driver.findElement(By.xpath(properties.getProperty("loc.validate.roboticprocessautomation"))).getText();
		ValidationResult.validateData(actualroboticprocessautomation, properties1.getProperty("expectedroboticprocessautomation"),"loc.validate.roboticprocessautomation");

		actualcloudservices = driver.findElement(By.xpath(properties.getProperty("loc.validate.cloudservices"))).getText();
		ValidationResult.validateData(actualcloudservices, properties1.getProperty("expectedcloudservices"),"loc.validate.cloudservices");

		actualenterpriseanalytics = driver.findElement(By.xpath(properties.getProperty("loc.validate.enterpriseanalytics"))).getText();
		ValidationResult.validateData(actualenterpriseanalytics, properties1.getProperty("expectedenterpriseanalyticscareers"),"loc.validate.enterpriseanalytics");

		actualinternetofthings = driver.findElement(By.xpath(properties.getProperty("loc.validate.internetofthings"))).getText();
		ValidationResult.validateData(actualinternetofthings, properties1.getProperty("expectedinternetofthings"),"loc.validate.internetofthings");
		
		actualmobilecomputing = driver.findElement(By.xpath(properties.getProperty("loc.validate.mobilecomputing"))).getText();
		ValidationResult.validateData(actualmobilecomputing, properties1.getProperty("expectedmobilecomputing"),"loc.validate.mobilecomputing");
		
		actualproductengineering = driver.findElement(By.xpath(properties.getProperty("loc.validate.productengineering"))).getText();
		ValidationResult.validateData(actualproductengineering, properties1.getProperty("expectedproductengineering"),"loc.validate.productengineering");
		
	}
}
