package in.amazon.pages.components.productdescrptn;

import static in.amazon.utils.SeleniumUtils.isPresent;

import org.openqa.selenium.WebElement;

import in.amazon.utils.dynamicxpath.DynamicXpathUtils;

public final class ProductDescComponent {

	private static final String FEATURE_SECTION = "//*[@id='feature-bullets']//*[normalize-space()='%s']";

	public boolean isRequiredTextPresent(String featureSectionText) {
		String featureSectionNewXpath = DynamicXpathUtils.getDynamicXpath(FEATURE_SECTION, featureSectionText);
		return isPresent(featureSectionNewXpath, WebElement::isDisplayed);
	}

}
