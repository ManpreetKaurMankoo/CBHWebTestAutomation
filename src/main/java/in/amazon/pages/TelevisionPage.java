package in.amazon.pages;

import in.amazon.pages.components.television.TvRefinementsComponent;
import in.amazon.pojos.data.TestData;

public final class TelevisionPage {

	private final TvRefinementsComponent tvRefinements;
	private String filterSection;
	private String brand;
	private TestData data;

	TelevisionPage(TestData data) {
		this.tvRefinements = new TvRefinementsComponent();
		this.filterSection = data.getFilterData().getFilterSection();
		this.data = data;
		this.brand = data.getFilterData().getBrandName();
	}

	public ProductResultsPage filterTelevision() {
		tvRefinements.filterBy(filterSection, brand);
		return new ProductResultsPage(data);
	}

}
