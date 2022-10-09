package in.amazon.utils.javascriptexecutor;

import org.openqa.selenium.By;

import in.amazon.fameworkenums.WaitStrategy;

public final class JavascriptService {

	private JavascriptService() {}

	public static void scrollToElement(By by, WaitStrategy waitStrategy) {
		JavascriptUtilities.scrollIntoViewOfElement(by, waitStrategy);
	}

}
