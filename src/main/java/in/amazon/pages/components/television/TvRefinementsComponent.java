package in.amazon.pages.components.television;

import static in.amazon.utils.SeleniumUtils.click;
import static in.amazon.utils.SeleniumUtils.scrollToElement;

import in.amazon.fameworkenums.WaitStrategy;
import in.amazon.utils.dynamicxpath.DynamicXpathService;

public final class TvRefinementsComponent {

	private static final String SECTION_FILTER = "//*[text()='%s']/../../descendant::span[text()='%s']/ancestor::a";

	public TvRefinementsComponent filterBy(String filterBySection, String brand) {
		String sectionFilterNewXpath = DynamicXpathService.generateDynamicXpath(SECTION_FILTER, filterBySection, brand);
		scrollToElement(sectionFilterNewXpath, WaitStrategy.CLICKABLE, brand);
		click(sectionFilterNewXpath, WaitStrategy.CLICKABLE, brand);
		return this;
	}

}
