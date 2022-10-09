package in.amazon.utils;

import static in.amazon.frameworkfactories.ExplicitWaitFactory.waitExplicitly;

import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import in.amazon.allurereport.AllureLogger;
import in.amazon.driver.DriverManager;
import in.amazon.fameworkenums.WaitStrategy;
import in.amazon.utils.javascriptexecutor.JavascriptService;

public final class SeleniumUtils {

	private SeleniumUtils() {}

	private static final String PARENT_WINDOW = "Parent Window";

	public static void click(By by, WaitStrategy waitStrategy, String element) {
		waitExplicitly(waitStrategy, by).click();
		AllureLogger.addAllureLog(element + " is clicked");
	}

	public static void click(String locatorStrategy, WaitStrategy waitStrategy, String element) {
		waitExplicitly(waitStrategy, By.xpath(locatorStrategy)).click();
		AllureLogger.addAllureLog(element + " is clicked");
	}

	public static void scrollToElement(By by, WaitStrategy waitStrategy, String element){
		JavascriptService.scrollToElement(by, waitStrategy);
		AllureLogger.addAllureLog("Scrolled to " + element);
	}

	public static void scrollToElement(String locatorStrategy, WaitStrategy waitStrategy, String element){
		JavascriptService.scrollToElement(By.xpath(locatorStrategy), waitStrategy);
		AllureLogger.addAllureLog("Scrolled to " + element);
	}

	public static String switchToChildWindow() {
		String parentWindow = DriverManager.getDriver().getWindowHandle();
		WindowHandlingUtils.setParentWindowHandle(PARENT_WINDOW, parentWindow);

		for (String windowHandle : DriverManager.getDriver().getWindowHandles()) {
			DriverManager.getDriver().switchTo().window(windowHandle);
		}
		AllureLogger.addAllureLog("Switched to child window");
		return parentWindow;
	}

	public static void closeChildWindAndSwitchToParent() {
		DriverManager.getDriver().close();
		DriverManager.getDriver().switchTo().window(WindowHandlingUtils.getParentWindowHandle(PARENT_WINDOW));
		AllureLogger.addAllureLog("Closed child window and switched back to parent window");
	}

	public static boolean isPresent(String loactorStrategy, Predicate<WebElement> webElementPredicate) {
		return webElementPredicate.test(DriverManager.getDriver().findElement(By.xpath(loactorStrategy)));
	}

}
