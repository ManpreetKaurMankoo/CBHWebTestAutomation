//package in.amazon.driver.managers;
//
//import static in.amazon.config.FrameworkConfigService.getConfig;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public final class SelenoidChromeManager {
//
//	private SelenoidChromeManager() {}
//
//	public static WebDriver getDriver() {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("browserName", "chrome");
//		capabilities.setCapability("browserVersion", "105.0");
//		capabilities.setCapability("enableVNC", "true");
//		capabilities.setCapability("enableVideo", "true");
//		return new RemoteWebDriver(getConfig().selenoidUrl(), capabilities);
//	}
//
//}

