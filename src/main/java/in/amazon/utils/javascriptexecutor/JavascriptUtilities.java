package in.amazon.utils.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import in.amazon.driver.DriverManager;
import in.amazon.fameworkenums.WaitStrategy;
import in.amazon.frameworkfactories.ExplicitWaitFactory;

public final class JavascriptUtilities {

	private JavascriptUtilities() {}

	static void scrollIntoViewOfElement(By by, WaitStrategy waitStrategy){
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				ExplicitWaitFactory.waitExplicitly(waitStrategy, by));
	}

}
