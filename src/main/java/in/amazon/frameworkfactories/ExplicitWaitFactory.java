package in.amazon.frameworkfactories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.amazon.constants.FrameworkConstants;
import in.amazon.driver.DriverManager;
import in.amazon.fameworkenums.WaitStrategy;

public final class ExplicitWaitFactory {

	private ExplicitWaitFactory() {}

	public static WebElement waitExplicitly(WaitStrategy waitStrategy, By by) {
		WebElement element = null;
		if(waitStrategy == WaitStrategy.CLICKABLE) {
			element = explicitlyWaitForElementToBeClickable(by);
		}
		else if(waitStrategy == WaitStrategy.VISIBLE) {
			element = explicitlyWaitForElementToBeVisible(by);
		}
		return element;
	}

	private static WebElement explicitlyWaitForElementToBeClickable(By by) {
		return new WebDriverWait(DriverManager.getDriver(),
				Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
				.until(ExpectedConditions.elementToBeClickable(by));
	}

	private static WebElement explicitlyWaitForElementToBeVisible(By by) {
		return new WebDriverWait(DriverManager.getDriver(),
				Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
				.until(ExpectedConditions.presenceOfElementLocated(by));
	}

}
