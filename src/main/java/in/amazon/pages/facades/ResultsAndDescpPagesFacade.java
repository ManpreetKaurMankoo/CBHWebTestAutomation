package in.amazon.pages.facades;

import static in.amazon.utils.SeleniumUtils.closeChildWindAndSwitchToParent;

import in.amazon.pages.ProductResultsPage;
import in.amazon.pages.SamsungProdDescPage;
import in.amazon.pojos.data.TestData;

public final class ResultsAndDescpPagesFacade {

	private ProductResultsPage productResultsPage;
	private SamsungProdDescPage samsungProdDescPage;
	private TestData data;

	public ResultsAndDescpPagesFacade(TestData data) {
		this.productResultsPage = new ProductResultsPage(data);
		this.samsungProdDescPage = new SamsungProdDescPage();
		this.data = data;
	}

	public void closeChildWindowAndSwitchToParent() {
		closeChildWindAndSwitchToParent();
	}

	public boolean switchWindowAndCheckAboutThisItemTextIsPresent() {
		productResultsPage.switchToProdDescWindow();
		boolean isValuePresent =  samsungProdDescPage.isAboutThisItemTextPresent(data.getFeatureSectionText());
		closeChildWindowAndSwitchToParent();
		return isValuePresent;
	}

}