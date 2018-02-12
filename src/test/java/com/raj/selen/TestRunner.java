package com.raj.selen;

import java.io.InputStream;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Properties properties = new Properties();
		InputStream in = TestRunner.class.getResourceAsStream("/test.properties");
		if (in != null) {
			properties.load(in);
			in.close();
		}
		String GECKO_DRIVER_PATH = "";
		if (properties != null && "true".equalsIgnoreCase(properties.getProperty("windows"))) {
			GECKO_DRIVER_PATH = properties.getProperty("gecko.driver.win.path");
		} else if (properties != null) {
			GECKO_DRIVER_PATH = properties.getProperty("gecko.driver.linux.path");
		}
		System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH);
		FirefoxProfile ffProfile = new FirefoxProfile();
		FirefoxOptions ffOptions = new FirefoxOptions();
		ffOptions.setHeadless(true);
		ffOptions.setProfile(ffProfile);
		driver = new FirefoxDriver(ffOptions);
	}

	@Test
	public void test() {
		String URL = "http://www.google.com";
		driver.get(URL);
		System.out.println(driver.getPageSource());
	}

}
