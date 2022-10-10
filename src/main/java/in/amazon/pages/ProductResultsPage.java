package in.amazon.pages;

import in.amazon.pages.components.productresults.ProductResultsComponent;
import in.amazon.pages.components.productresults.ResultInfoTopBarComponent;
import in.amazon.pages.facades.ResultsAndDescpPagesFacade;
import in.amazon.pojos.data.TestData;
import in.amazon.utils.SeleniumUtils;

public final class ProductResultsPage {

	private final ResultInfoTopBarComponent resultInfoTopBarComponent;
	private final ProductResultsComponent productResultsComponent;
	private String sortByDrpDwnOption;
	private String highestPricedItemNo;
	private TestData data;

	public ProductResultsPage(TestData data) {
		this.resultInfoTopBarComponent = new ResultInfoTopBarComponent();
		this.productResultsComponent = new ProductResultsComponent();
		this.data = data;
		this.sortByDrpDwnOption = data.getSortByOption();
		this.highestPricedItemNo = data.getHighestPricedItemNo();
	}

	public ProductResultsPage sortProducts() {
		resultInfoTopBarComponent.clickOnSortByDropDownBtn()
		.selectDrpDwnOption(sortByDrpDwnOption);
		return this;
	}

	private ProductResultsPage clickOnResultProductByPrice() {
		productResultsComponent.clickOnResultProductByPrice(highestPricedItemNo);
		return this;
	}

	public ResultsAndDescpPagesFacade goToRequiredProduct() {
		clickOnResultProductByPrice();
		return new ResultsAndDescpPagesFacade(data);
	}

	public String switchToProdDescWindow() {
		return SeleniumUtils.switchToChildWindow();
	}

}
