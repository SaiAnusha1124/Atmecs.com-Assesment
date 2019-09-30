package com.atmecs.testscripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	static LogReports log = new LogReports();

	@Test(priority = 1)
	public static void Validatingfooter() throws Exception {
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.home"));
		ValidationSitemapPage.validateSitemap();
		log.info("sucessfully validated sitemap ");
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.services"));
		ValidationServicesPage.validateServices();
		log.info("sucessfully validated sevices");
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.carerrs"));
		ValidationCareersPage.validateCareers();
		log.info("sucessfully validated careers ");
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.contactus"));
		ValidationContactusPage.validateContactus();
		log.info("sucessfully validated contactus ");
	}

	@Test(priority = 2)
	public static void Services() throws Exception {
		// PageActions.clickOnElement(driver,
		// properties.getProperty("loc.bttn.Services"));
		// PageActions.sendKeys(driver, properties.getProperty("loc.bttn.Services"),
		// "Digital Life");
		// PageActions.sendKeys(Keys.ENTER);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(properties.getProperty("loc.click.services")));
		System.out.println(element.getText());
		action.moveToElement(element).build().perform();
		WebElement element1 = driver.findElement(By.xpath(properties.getProperty("loc.bttn.digital")));
		action.moveToElement(element1).build().perform();
		ValidationDigitalLifePage.validateDigitallife();
		log.info("sucessfully validated DigitalLife");
		WebElement element2 = driver.findElement(By.xpath(properties.getProperty("loc.click.services")));
		System.out.println(element.getText());
		action.moveToElement(element2).build().perform();
		WebElement element3 = driver.findElement(By.xpath(properties.getProperty("loc.bttn.infra")));
		action.moveToElement(element3).build().perform();
		ValidationInfrastrcuturePage.validateInfrastructure();
		log.info("sucessfully validated Infrastructure");
	}

	@Test(priority = 3)
	public static void insights() throws Exception {
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.insights"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.blog"));
		PageActions.clickOnElement(driver, properties.getProperty("loc.click.firstblog"));
		ValidationBlogPage.validateContent();
		log.info("sucessfully validated Content of the blog");
		// PageActions.clickOnElement(driver,
		// properties.getProperty("loc.click.submit"));
	}
}
