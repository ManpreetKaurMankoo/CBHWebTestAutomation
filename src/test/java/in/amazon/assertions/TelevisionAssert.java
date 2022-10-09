package in.amazon.assertions;

import static in.amazon.allurereport.AllureLogger.addAllureLog;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

import io.qameta.allure.model.Status;

public final class TelevisionAssert extends AbstractAssert<TelevisionAssert, Boolean> {

	SoftAssertions assertions = new SoftAssertions();

	private TelevisionAssert(boolean isAboutThisItemTextPresent) {
		super(isAboutThisItemTextPresent, TelevisionAssert.class);
	}

	public static TelevisionAssert assertThat(boolean isAboutThisItemTextPresent) {
		return new TelevisionAssert(isAboutThisItemTextPresent);
	}

	public TelevisionAssert isTrue() {
		assertions.assertThat(actual)
		.withFailMessage(() -> "About this item section text is not found on the Product Description Page")
		.isTrue();

		addAllureLog("'About this item' section text is present on the Product Description Page", Status.PASSED);
		return this;
	}

	public void assertAll() {
		assertions.assertAll();
	}

}
