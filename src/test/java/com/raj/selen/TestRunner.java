package com.raj.selen;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestRunner {

	/*static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\IBM_ADMIN\\eclipse-oxygen-workspace\\selen\\drivers\\win64\\geckodriver.exe");
		FirefoxProfile ffProfile=new FirefoxProfile();
		FirefoxOptions ffOptions=new FirefoxOptions();
		ffOptions.setHeadless(true);
		ffOptions.setProfile(ffProfile);
		driver = new FirefoxDriver(ffOptions);
	}
*/
	@Test
	public void test() {
		WebDriver driver;
		String URL = "http://www.gmail.com";
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\IBM_ADMIN\\eclipse-oxygen-workspace\\selen\\drivers\\win64\\v015\\geckodriver.exe");
		FirefoxProfile ffProfile=new FirefoxProfile();
		FirefoxOptions ffOptions=new FirefoxOptions();
		ffOptions.setHeadless(true);
		ffOptions.setProfile(ffProfile);
		driver = new FirefoxDriver(ffOptions);

		driver.get(URL);
	}

}
