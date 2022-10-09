package in.amazon.pages;

import in.amazon.pages.components.productdescrptn.ProductDescComponent;

public final class SamsungProdDescPage {

	private final ProductDescComponent prodDescription;

	public SamsungProdDescPage() {
		this.prodDescription = new ProductDescComponent();
	}

	public boolean isAboutThisItemTextPresent(String featureSectionText) {
		return prodDescription.isRequiredTextPresent(featureSectionText);
	}

}
