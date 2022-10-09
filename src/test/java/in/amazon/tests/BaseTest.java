package in.amazon.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import in.amazon.driver.Driver;

public class BaseTest {

	protected BaseTest() {}

	@BeforeMethod
	protected void setUp() {
		Driver.initialiseDriver();
		Driver.maximizeWindow();
		Driver.getUrl();
	}

	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}

}
