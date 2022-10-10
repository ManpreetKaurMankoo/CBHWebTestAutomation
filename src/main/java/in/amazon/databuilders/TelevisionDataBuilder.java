package in.amazon.databuilders;

import in.amazon.pojos.data.FilterData;
import in.amazon.pojos.data.MenuData;
import in.amazon.pojos.data.TestData;

public final class TelevisionDataBuilder {

	private TelevisionDataBuilder() {}

	public static TestData getTelevisionData(TestData testData) {

		MenuData menuData = MenuData.builder()
				.setHamburgerMainMenu(testData.getMenuData().getHamburgerMainMenu())
				.setHamburgerSubMenu(testData.getMenuData().getHamburgerSubMenu())
				.build();

		FilterData filterData = FilterData.builder()
				.setFilterSection(testData.getFilterData().getFilterSection())
				.setBrandName(testData.getFilterData().getBrandName())
				.build();

		return TestData.builder()
				.setMenuData(menuData)
				.setFilterData(filterData)
				.setSortByOption(testData.getSortByOption()).setHighestPricedItemNo(testData.getHighestPricedItemNo())
				.setFeatureSectionText(testData.getFeatureSectionText())
				.build();
	}

}