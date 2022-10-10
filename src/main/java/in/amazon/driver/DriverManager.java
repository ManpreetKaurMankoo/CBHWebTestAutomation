package in.amazon.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

	private DriverManager() {}

	private static ThreadLocal<WebDriver> threadSafeDriver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return threadSafeDriver.get();
	}

	static void setDriver(WebDriver driver) {
		if(Objects.nonNull(driver)) {
			threadSafeDriver.set(driver);
		}
	}

	static void unload() {
		threadSafeDriver.remove();
	}

}