//package in.amazon.driver.factories;
//
//import java.util.EnumMap;
//import java.util.Map;
//import java.util.function.Function;
//
//import org.openqa.selenium.WebDriver;
//
//import in.amazon.driver.enums.BrowserType;
//import in.amazon.driver.enums.RemoteModeType;
//
//public final class RemoteDriverFactory {
//
//	private RemoteDriverFactory() {}
//
//	private static final Map<RemoteModeType, Function<BrowserType, WebDriver>> MAP = new EnumMap<>(RemoteModeType.class);
//	private static final Function<BrowserType, WebDriver> SELENOID = SelenoidFactory::getDriver;
//
//	static {
//		MAP.put(RemoteModeType.SELENOID, SELENOID);
//	}
//
//
//	public static WebDriver getDriver(RemoteModeType remoteModeType, BrowserType browserName) {
//		return MAP.get(remoteModeType).apply(browserName);
//	}
//
//}


