package in.amazon.driver;

import static in.amazon.config.FrameworkConfigService.getConfig;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

import in.amazon.driver.data.DriverData;
import in.amazon.driver.factories.DriverFactory;

public final class Driver {

	private Driver() {}

	public static void initialiseDriver() {

		DriverData driverData = DriverData.builder()
				//				.remoteMode(getConfig().remoteMode())
				.browserName(getConfig().browserName())
				.build();

		if(Objects.isNull(DriverManager.getDriver())) {
			WebDriver driver = DriverFactory
					.getDriver(getConfig().runMode())
					.getDriver(driverData);
			DriverManager.setDriver(driver);
		}
	}

	public static void maximizeWindow() {
		DriverManager.getDriver().manage().window().maximize();
	}

	public static void getUrl() {
		DriverManager.getDriver().get(getConfig().websiteUrl());
	}

	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
