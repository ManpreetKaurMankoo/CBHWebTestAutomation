package in.amazon.driver;

import org.openqa.selenium.WebDriver;

import in.amazon.driver.data.DriverData;

public interface IDriver {

	WebDriver getDriver(DriverData driverData);

}
