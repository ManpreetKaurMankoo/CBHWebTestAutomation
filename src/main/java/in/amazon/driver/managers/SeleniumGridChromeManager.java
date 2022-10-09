//package in.amazon.driver.managers;
//
//import static in.amazon.config.FrameworkConfigService.getConfig;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public final class SeleniumGridChromeManager {
//
//	private SeleniumGridChromeManager() {}
//
//	public static WebDriver getDriver() {
//		System.out.println("Inside lenium grid chrome manager");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("browserName", "chrome");
//		return new RemoteWebDriver(getConfig().seleniumGridUrl(), capabilities);
//	}
//
//}
