package in.amazon.driver.managers;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class LocalChromeManager {

	private LocalChromeManager() {}

	public static WebDriver getDriver() {
		return WebDriverManager.chromedriver().create();
	}

}
