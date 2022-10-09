//package in.amazon.driver.factories;
//
//import java.util.EnumMap;
//import java.util.Map;
//import java.util.function.Supplier;
//
//import org.openqa.selenium.WebDriver;
//
//import in.amazon.driver.enums.BrowserType;
//import in.amazon.driver.managers.SeleniumGridChromeManager;
//
//public final class SeleniumGridFactory {
//
//	private SeleniumGridFactory() {}
//
//	private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);
//	private static final Supplier<WebDriver> SELENUIM_GRID_CHROME = SeleniumGridChromeManager::getDriver;
//
//	static {
//		MAP.put(BrowserType.CHROME, SELENUIM_GRID_CHROME);
//	}
//
//	public static WebDriver getDriver(BrowserType browserName) {
//		return MAP.get(browserName).get();
//	}
//
//}
