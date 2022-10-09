package in.amazon.tests;

import org.testng.annotations.Test;

import in.amazon.assertions.TelevisionAssert;
import in.amazon.constants.FrameworkConstants;
import in.amazon.databuilders.TelevisionDataBuilder;
import in.amazon.datasupplier.DataSupplierUtils;
import in.amazon.pages.HomePage;
import in.amazon.pojos.data.TestData;
import io.github.sskorol.core.DataSupplier;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import one.util.streamex.StreamEx;

@Epic("Amazon - Assignment")
@Feature("Amazon - 'About this item' of the 2nd Highest priced television")
@Owner("Manpreet")
public final class HomePageTest extends BaseTest {

	private HomePageTest() {}

	@Story("Asserting the 'About this item' section text of the 2nd highest priced television")
	@Description("Verify the 'About this item' section text of the 2nd highest priced television is present")
	@Severity(SeverityLevel.CRITICAL)
	@Test(dataProvider = "getData", groups = { "Smoke" }, priority = 1)
	public void verifyAboutThisItemTextPresentTest(TestData testData) {

		TestData data = TelevisionDataBuilder.getTelevisionData(testData);

		boolean isAboutThisItemTextPresent = HomePage.with(data)
				.navigateViaHamburgerMenuToTelevisionPage()
				.filterTelevision()
				.sortProducts()
				.goToRequiredProduct()
				.switchWindowAndCheckAboutThisItemTextIsPresent();

		TelevisionAssert.assertThat(isAboutThisItemTextPresent)
		.isTrue()
		.assertAll();
	}



	//	@Story("Asserting the 'About this item' section text of the 2nd highest priced television")
	//	@Description("Verify the 'About this item' section text of the 2nd highest priced television is present")
	//	@Severity(SeverityLevel.CRITICAL)
	//	@Test(dataProvider = "getData", groups = { "Smoke" }, priority = 1)
	//	public void test2(TestData testData) {
	//
	//		TestData data = TelevisionDataBuilder.getTelevisionData(testData);
	//
	//		boolean isAboutThisItemTextPresent = HomePage.with(data)
	//				.navigateViaHamburgerMenuToTelevisionPage()
	//				.filterTelevision()
	//				.sortProducts()
	//				.goToRequiredProduct()
	//				.switchWindowAndCheckAboutThisItemTextIsPresent();
	//
	//		TelevisionAssert.assertThat(isAboutThisItemTextPresent)
	//		.isTrue()
	//		.assertAll();
	//	}
	//
	//	@Story("Asserting the 'About this item' section text of the 2nd highest priced television")
	//	@Description("Verify the 'About this item' section text of the 2nd highest priced television is present")
	//	@Severity(SeverityLevel.CRITICAL)
	//	@Test(dataProvider = "getData", groups = { "Smoke" }, priority = 1)
	//	public void test3(TestData testData) {
	//
	//		TestData data = TelevisionDataBuilder.getTelevisionData(testData);
	//
	//		boolean isAboutThisItemTextPresent = HomePage.with(data)
	//				.navigateViaHamburgerMenuToTelevisionPage()
	//				.filterTelevision()
	//				.sortProducts()
	//				.goToRequiredProduct()
	//				.switchWindowAndCheckAboutThisItemTextIsPresent();
	//
	//		TelevisionAssert.assertThat(isAboutThisItemTextPresent)
	//		.isTrue()
	//		.assertAll();
	//	}

	@DataSupplier(name = "getData", runInParallel = true)
	public StreamEx<TestData> getData() {
		return DataSupplierUtils.getData(FrameworkConstants.getTelevisionDataFilePath(),
				TestData.class);
	}
}

