package in.amazon.driver.driveimpl;

import org.openqa.selenium.WebDriver;

import in.amazon.driver.IDriver;
import in.amazon.driver.data.DriverData;
import in.amazon.driver.factories.LocalDriverFactory;

public class LocalDriverImpl implements IDriver {

	@Override
	public WebDriver getDriver(DriverData driverData) {
		return LocalDriverFactory.getDriver(driverData.getBrowserName());
	}

	//public class LocalDriverImpl {
	//
	//	public static WebDriver getDriver(BrowserType browserName) {
	//		return LocalDriverFactory.getDriver(browserName);
	//	}

}
