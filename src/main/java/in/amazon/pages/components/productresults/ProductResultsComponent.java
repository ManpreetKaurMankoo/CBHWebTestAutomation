package in.amazon.pages.components.productresults;

import static in.amazon.utils.SeleniumUtils.click;

import in.amazon.fameworkenums.WaitStrategy;
import in.amazon.utils.dynamicxpath.DynamicXpathUtils;

public final class ProductResultsComponent {

	private static final String SEARCHED_PRODUCT_BY_PRICE = "(//*[@class='a-price-whole'])[%s]";

	public ProductResultsComponent clickOnResultProductByPrice(String highestPricedItemNo) {
		String searchedProductNewXpath = DynamicXpathUtils.getDynamicXpath(SEARCHED_PRODUCT_BY_PRICE, highestPricedItemNo);
		click(searchedProductNewXpath, WaitStrategy.CLICKABLE, "Highest priced item number " + highestPricedItemNo);
		return this;
	}

}