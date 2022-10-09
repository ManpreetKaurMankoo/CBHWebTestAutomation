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
				//	.runMode(getConfig().runMode())
				.remoteMode(getConfig().remoteMode())
				.browserName(getConfig().browserName())
				.build();

		System.out.println("remoteMode(): " + getConfig().remoteMode());
		System.out.println("remoteMode from driverData: " + driverData.getRemoteMode());

		System.out.println("driverData: " + driverData);
		//				new DriverData(getConfig().remoteMode(),
		//				getConfig().browserName());

		if(Objects.isNull(DriverManager.getDriver())) {
			WebDriver driver = DriverFactory
					.getDriver(getConfig().runMode())
					.getDriver(driverData);
			//	.getDriver(driverData);
			//			System.out.println("Inside initiali");
			//			System.out.println("browserName: " + browserName);
			//			System.out.println("runMode: " + runMode);
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
