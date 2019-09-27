package com.atmecs.testscripts;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.atmecs.pageactions.PageActions;
import com.atmecs.testbase.TestBase;
import com.atmecs.utils.ConstantsFilePaths;
import com.atmecs.utils.LogReports;
import com.atmecs.utils.ReadLocatorsFile;
import com.atmecs.validation.ValidationBlogPage;
import com.atmecs.validation.ValidationCareersPage;
import com.atmecs.validation.ValidationContactusPage;
import com.atmecs.validation.ValidationDigitalLifePage;
import com.atmecs.validation.ValidationInfrastrcuturePage;
import com.atmecs.validation.ValidationServicesPage;
import com.atmecs.validation.ValidationSitemapPage;

public class TestCases extends TestBase {
	static Properties properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
	LogReports log = new LogReports();

	@Test(priority = 1)
	public static void Validatingfooter() throws Exception {
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.home"));
		ValidationSitemapPage.validateSitemap();
		ValidationServicesPage.validateServices();
		ValidationCareersPage.validateCareers();
		ValidationContactusPage.validateContactus();
	}

	@Test(priority = 2)
	public static void Services() throws Exception {
		PageActions.clickOnElement(driver, properties.getProperty("loc.bttn.Services"));
		PageActions.sendKeys(driver, properties.getProperty("loc.bttn.Services"), "Digital Life");
		PageActions.sendKeys(Keys.ENTER);
		ValidationDigitalLifePage.validateDigitallife();
		ValidationInfrastrcuturePage.validateInfrastructure();
	}

	@Test(priority = 3)
	public static void insights() throws Exception {
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.insights"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.blog"));
		Thread.sleep(3000);
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.firstblog"));
		ValidationBlogPage.validateContent();
		Thread.sleep(3000);
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.submit"));
	}

}
