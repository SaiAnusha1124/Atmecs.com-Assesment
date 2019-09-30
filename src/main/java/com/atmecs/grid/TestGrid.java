package com.atmecs.grid;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestGrid 
{
	public static WebDriver driver;
	@Test
	public static WebDriver getConnection() throws Exception 
	{
		String nodeurl = "http://localhost:4444/wd/hub";
		DesiredCapabilities capability = new DesiredCapabilities();
		URL url1 = new URL(nodeurl);
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(url1, capability);
		driver.get("http:atmecs.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver;
	}

}