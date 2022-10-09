//package in.amazon.driver.factories;
//
//import java.util.EnumMap;
//import java.util.Map;
//import java.util.function.Supplier;
//
//import org.openqa.selenium.WebDriver;
//
//import in.amazon.driver.enums.BrowserType;
//import in.amazon.driver.managers.SelenoidChromeManager;
//
//public final class SelenoidFactory {
//
//	private SelenoidFactory() {}
//
//	private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);
//	private static final Supplier<WebDriver> SELENOID_CHROME = SelenoidChromeManager::getDriver;
//
//	static {
//		MAP.put(BrowserType.CHROME, SELENOID_CHROME);
//	}
//
//	public static WebDriver getDriver(BrowserType browserName) {
//		return MAP.get(browserName).get();
//	}
//
//}



