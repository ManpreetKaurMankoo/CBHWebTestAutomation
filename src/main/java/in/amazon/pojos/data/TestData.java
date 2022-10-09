package in.amazon.pojos.data;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public final class TestData {

	private MenuData menuData;
	private FilterData filterData;
	private String sortByOption;
	private String highestPricedItemNo;
	private String featureSectionText;

}