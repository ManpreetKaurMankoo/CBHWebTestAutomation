package in.amazon.pages.components.productresults;

import static in.amazon.utils.SeleniumUtils.click;
import static in.amazon.utils.SeleniumUtils.scrollToElement;

import org.openqa.selenium.By;

import in.amazon.fameworkenums.WaitStrategy;
import in.amazon.utils.dynamicxpath.DynamicXpathUtils;

public final class ResultInfoTopBarComponent {

	private static final By SORT_BY_DRPDWN_BUTTON = By.xpath("//*[@data-action='a-dropdown-button']//span[text()='Sort by:']");
	private static final String SORT_BY_DRPDWN_OPTION = "//*[contains(@id,'result-sort-select') and text()='%s']";

	public ResultInfoTopBarComponent clickOnSortByDropDownBtn() {
		scrollToElement(SORT_BY_DRPDWN_BUTTON, WaitStrategy.CLICKABLE, "Sort By drop down");
		click(SORT_BY_DRPDWN_BUTTON, WaitStrategy.CLICKABLE, "Sort By drop down");
		return this;
	}

	public ResultInfoTopBarComponent selectDrpDwnOption(String sortByOption) {
		String sortByDrpDwnOptionNewXpath = DynamicXpathUtils.getDynamicXpath(SORT_BY_DRPDWN_OPTION, sortByOption);
		click(sortByDrpDwnOptionNewXpath, WaitStrategy.CLICKABLE, sortByOption);
		return this;
	}

}
