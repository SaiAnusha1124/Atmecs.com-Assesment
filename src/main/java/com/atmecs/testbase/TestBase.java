package com.atmecs.testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.utils.ConstantsFilePaths;
import com.atmecs.utils.ReadLocatorsFile;

public class TestBase {
	Properties baseProperty;
	String url;
	String browser;
	public static WebDriver driver;

	@Test
	public void initializeBrowser() throws Exception {
		baseProperty = ReadLocatorsFile.loadProperty(ConstantsFilePaths.CONFIG_FILE);
		url = baseProperty.getProperty("url");
		browser = baseProperty.getProperty("browserType");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ConstantsFilePaths.CHROME_FILE);
			driver = new ChromeDriver();
			// Chrome browser is started...
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ConstantsFilePaths.FIREFOX_FILE);
			driver = new FirefoxDriver();
			// Firefox browser is started...
			
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ConstantsFilePaths.IE_FILE);
			driver = new InternetExplorerDriver();
			// IE browser is started...
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit(); //closes the opened browser
	}
}
